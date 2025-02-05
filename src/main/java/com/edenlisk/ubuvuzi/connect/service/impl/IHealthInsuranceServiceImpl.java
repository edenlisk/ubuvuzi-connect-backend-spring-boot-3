package com.edenlisk.ubuvuzi.connect.service.impl;


import com.edenlisk.ubuvuzi.connect.dto.CreateHealthInsuranceDto;
import com.edenlisk.ubuvuzi.connect.dto.HealthInsuranceDto;
import com.edenlisk.ubuvuzi.connect.entity.HealthInsurance;
import com.edenlisk.ubuvuzi.connect.mapper.HealthInsuranceMapper;
import com.edenlisk.ubuvuzi.connect.repository.HealthInsuranceRepository;
import com.edenlisk.ubuvuzi.connect.service.IHealthInsuranceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class IHealthInsuranceServiceImpl implements IHealthInsuranceService {

    private HealthInsuranceRepository healthInsuranceRepository;

    /**
     * @param healthInsuranceDto
     */
    @Override
    public void createHealthInsurance(CreateHealthInsuranceDto healthInsuranceDto) {
        HealthInsurance healthInsurance = HealthInsuranceMapper.mapToInsurance(healthInsuranceDto, new HealthInsurance());
        healthInsuranceRepository.save(healthInsurance);
    }

    /**
     * @return
     */
    @Override
    public List<HealthInsuranceDto> getHealthInsurances() {
        return healthInsuranceRepository.findAll()
                .stream()
                .map(healthInsurance -> HealthInsuranceMapper.mapToHealthInsuranceDto(healthInsurance, new HealthInsuranceDto()))
                .toList();
    }
}
