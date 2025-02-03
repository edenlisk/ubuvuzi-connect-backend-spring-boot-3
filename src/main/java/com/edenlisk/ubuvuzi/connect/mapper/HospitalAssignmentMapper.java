package com.edenlisk.ubuvuzi.connect.mapper;


import com.edenlisk.ubuvuzi.connect.dto.*;
import com.edenlisk.ubuvuzi.connect.entity.HospitalEmployee;

public class HospitalAssignmentMapper {

    public static HospitalEmployeeDto mapToHospitalAssignment(
            HospitalEmployee hospitalEmployee,
            HospitalEmployeeDto hospitalEmployeeDto
            ) {
        hospitalEmployeeDto.setHospital(HospitalMapper.mapToHospitalDto(hospitalEmployee.getHospital(), new HospitalDto()));
        hospitalEmployeeDto.setId(hospitalEmployee.getId());
        hospitalEmployeeDto.setDepartments(
                hospitalEmployee.getDepartments()
                        .stream()
                        .map(department -> DepartmentMapper.mapToDepartmentDto(department, new DepartmentDto()))
                        .toList()
        );

        return hospitalEmployeeDto;
    }

}
