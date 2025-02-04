package com.edenlisk.ubuvuzi.connect.service;


import com.edenlisk.ubuvuzi.connect.dto.CreateHospitalEmployeeDto;
import com.edenlisk.ubuvuzi.connect.dto.HospitalEmployeeDto;

import java.util.List;

public interface IHospitalAssignmentService {


    void createHospitalAssignment(CreateHospitalEmployeeDto hospitalEmployeeDto);


    List<HospitalEmployeeDto> getAssigmentByUser(Long userId);


    boolean updateHospitalAssignment(CreateHospitalEmployeeDto hospitalEmployeeDto);

}
