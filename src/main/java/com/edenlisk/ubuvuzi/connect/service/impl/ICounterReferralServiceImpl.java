package com.edenlisk.ubuvuzi.connect.service.impl;


import com.edenlisk.ubuvuzi.connect.dto.CounterReferralDto;
import com.edenlisk.ubuvuzi.connect.dto.CreateCounterReferralDto;
import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;
import com.edenlisk.ubuvuzi.connect.entity.CounterReferral;
import com.edenlisk.ubuvuzi.connect.entity.Hospital;
import com.edenlisk.ubuvuzi.connect.entity.Transfer;
import com.edenlisk.ubuvuzi.connect.exception.ResourceNotFoundException;
import com.edenlisk.ubuvuzi.connect.mapper.CounterReferralMapper;
import com.edenlisk.ubuvuzi.connect.repository.CounterReferralRepository;
import com.edenlisk.ubuvuzi.connect.repository.HospitalRepository;
import com.edenlisk.ubuvuzi.connect.repository.TransferRepository;
import com.edenlisk.ubuvuzi.connect.repository.UserRepository;
import com.edenlisk.ubuvuzi.connect.service.ICounterReferralService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ICounterReferralServiceImpl implements ICounterReferralService {


    private CounterReferralRepository counterReferralRepository;
    private TransferRepository transferRepository;
    private HospitalRepository hospitalRepository;
    private UserRepository userRepository;


    /**
     * @param counterReferralDto
     */
    @Override
    public void createCounterReferral(CreateCounterReferralDto counterReferralDto) {
        CounterReferral counterReferral = CounterReferralMapper.mapToCounterReferral(counterReferralDto, new CounterReferral());
        ApplicationUser healthcareProvider = userRepository.findById(counterReferralDto.getHealthcareProvider())
                .orElseThrow(
                        () -> new ResourceNotFoundException("Healthcare provider", "id", counterReferralDto.getHealthcareProvider().toString())
                );
        Optional<ApplicationUser> contactedPerson = userRepository.findById(counterReferralDto.getContactPerson());
        Hospital referredBackTo = hospitalRepository.findById(counterReferralDto.getReferredBackToId()).orElseThrow(
                () -> new ResourceNotFoundException("Hospital", "id", counterReferralDto.getReferredBackToId().toString())
        );
        Transfer transfer = transferRepository.findById(counterReferralDto.getTransferId()).orElseThrow(
                () -> new ResourceNotFoundException("Transfer", "id", counterReferralDto.getTransferId().toString())
        );
        contactedPerson.ifPresent(counterReferral::setContactPerson);
        counterReferral.setHospital(referredBackTo);
        counterReferral.setHealthCareProvider(healthcareProvider);
        counterReferral.setTransfer(transfer);
        counterReferralRepository.save(counterReferral);
    }

    /**
     * @param transferId
     * @return
     */
    @Override
    public CounterReferralDto getCounterReferralByTransfer(Long transferId) {
        CounterReferral counterReferral = counterReferralRepository.findById(transferId).orElseThrow(
                () -> new ResourceNotFoundException("Counter referral", "id", transferId.toString())
        );
        return CounterReferralMapper.mapToCounterReferralDto(counterReferral, new CounterReferralDto());
    }
}
