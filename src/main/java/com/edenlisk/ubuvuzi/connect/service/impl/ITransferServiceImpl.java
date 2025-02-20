package com.edenlisk.ubuvuzi.connect.service.impl;

import com.edenlisk.ubuvuzi.connect.dto.CreateTransferDto;
import com.edenlisk.ubuvuzi.connect.dto.TransferDto;
import com.edenlisk.ubuvuzi.connect.entity.*;
import com.edenlisk.ubuvuzi.connect.exception.ResourceNotFoundException;
import com.edenlisk.ubuvuzi.connect.mapper.TransferMapper;
import com.edenlisk.ubuvuzi.connect.repository.*;
import com.edenlisk.ubuvuzi.connect.service.ITransferService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ITransferServiceImpl implements ITransferService {

    private TransferRepository transferRepository;
    private HospitalRepository hospitalRepository;
    private UserRepository userRepository;
    private HealthInsuranceRepository healthInsuranceRepository;
    private DepartmentRepository departmentRepository;

    /**
     * @param createTransferDto
     */
    @Override
    public void createTransfer(CreateTransferDto createTransferDto) {
        Transfer transfer = TransferMapper.mapToTransfer(createTransferDto, new Transfer());
        Hospital receivingFacility = hospitalRepository.findById(createTransferDto.getReceivingFacilityId()).orElseThrow(
                () -> new ResourceNotFoundException("Hospital", "id", createTransferDto.getReceivingFacilityId().toString())
        );
        Optional<Department> receivingService = departmentRepository.findById(createTransferDto.getReceivingServiceId());
        receivingService.ifPresent(transfer::setReceivingService);
        Optional<HealthInsurance> healthInsurance = healthInsuranceRepository.findById(createTransferDto.getHealthInsuranceId());
        healthInsurance.ifPresent(transfer::setHealthInsurance);
        Hospital referralFacility = hospitalRepository.findById(createTransferDto.getReferralFacilityId()).orElseThrow(
                () -> new ResourceNotFoundException("Hospital", "id", createTransferDto.getReferralFacilityId().toString())
        );
        ApplicationUser healthcareProvider = userRepository.findById(createTransferDto.getHealthCareProviderId()).orElseThrow(
                () -> new ResourceNotFoundException("Health care provider", "id", createTransferDto.getHealthCareProviderId().toString())
        );
        Optional<ApplicationUser> contactedPerson = userRepository.findById(createTransferDto.getContactedPerson());
        contactedPerson.ifPresent(transfer::setContactedPerson);
        transfer.setReceivingFacility(receivingFacility);
        transfer.setReferralFacility(referralFacility);
        transfer.setHealthCareProvider(healthcareProvider);
        transferRepository.save(transfer);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public TransferDto getTransferById(Long id) {
        Transfer transfer = transferRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Transfer", "id", id.toString())
        );
        return TransferMapper.mapToTransferDto(transfer, new TransferDto());
    }

    /**
     * @param hospitalId
     * @return List<TransferDto>
     */
    @Override
    public List<TransferDto> getTransfersByHospital(Long hospitalId) {
        return transferRepository.findAllByReferralFacility_IdOrReceivingFacility_IdOrderByDateDesc(hospitalId, hospitalId)
                .stream()
                .map(transfer -> TransferMapper.mapToTransferDto(transfer, new TransferDto()))
                .toList();
    }

    /**
     * @param healthcareProviderUserId
     * @return List<TransferDto>
     */
    @Override
    public List<TransferDto> getTransfersByHealthcareProvider(Long healthcareProviderUserId) {
        return transferRepository.findAllByHealthCareProvider_UserIdOrderByDateDesc(healthcareProviderUserId)
                .stream()
                .map(transfer -> TransferMapper.mapToTransferDto(transfer, new TransferDto()))
                .toList();
    }

    /**
     * @param phoneNumber
     * @return
     */
    @Override
    public List<TransferDto> getPatientTransfersByPhoneNumber(String phoneNumber) {
        return transferRepository.findAllByCaregiverPhoneNumberOrderByDateDesc(phoneNumber)
                .stream()
                .map(transfer -> TransferMapper.mapToTransferDto(transfer, new TransferDto()))
                .toList();
    }
}
