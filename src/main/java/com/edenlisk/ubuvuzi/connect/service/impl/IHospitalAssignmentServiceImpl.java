package com.edenlisk.ubuvuzi.connect.service.impl;


import com.edenlisk.ubuvuzi.connect.dto.CreateHospitalEmployeeDto;
import com.edenlisk.ubuvuzi.connect.dto.HospitalEmployeeDto;
import com.edenlisk.ubuvuzi.connect.entity.ApplicationUser;
import com.edenlisk.ubuvuzi.connect.entity.Hospital;
import com.edenlisk.ubuvuzi.connect.entity.HospitalEmployee;
import com.edenlisk.ubuvuzi.connect.exception.ResourceNotFoundException;
import com.edenlisk.ubuvuzi.connect.repository.HospitalAssigmentRepo;
import com.edenlisk.ubuvuzi.connect.repository.HospitalRepository;
import com.edenlisk.ubuvuzi.connect.repository.UserRepository;
import com.edenlisk.ubuvuzi.connect.service.IHospitalAssignmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class IHospitalAssignmentServiceImpl implements IHospitalAssignmentService {

    private HospitalAssigmentRepo hospitalAssigmentRepo;
    private UserRepository userRepository;
    private HospitalRepository hospitalRepository;

    /**
     * @param hospitalEmployeeDto
     */
    @Override
    public void createHospitalAssignment(CreateHospitalEmployeeDto hospitalEmployeeDto) {
        HospitalEmployee hospitalEmployee = new HospitalEmployee();
        ApplicationUser medicalWorker = userRepository.findById(hospitalEmployeeDto.getUserId()).orElseThrow(
                () -> new ResourceNotFoundException("User", "id", hospitalEmployeeDto.getUserId().toString())
        );
        Hospital hospital =  hospitalRepository.findById(hospitalEmployeeDto.getHospitalId()).orElseThrow(
                () -> new ResourceNotFoundException("Hospital", "id", hospitalEmployeeDto.getHospitalId().toString())
        );
        hospitalEmployee.setHospital(hospital);
        hospitalEmployee.setHealthcareProvider(medicalWorker);
        hospitalEmployee.setRole(medicalWorker.getUserRole());
        hospitalEmployee.setStartDate(LocalDate.now());
        hospitalAssigmentRepo.save(hospitalEmployee);
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public List<HospitalEmployeeDto> getAssigmentByUser(Long userId) {
        return List.of();
    }

    /**
     * @param hospitalEmployeeDto
     * @return
     */
    @Override
    public boolean updateHospitalAssignment(CreateHospitalEmployeeDto hospitalEmployeeDto) {
        return false;
    }
}
