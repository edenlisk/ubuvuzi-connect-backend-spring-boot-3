package com.edenlisk.ubuvuzi.connect.mapper;

import com.edenlisk.ubuvuzi.connect.dto.DepartmentDto;
import com.edenlisk.ubuvuzi.connect.dto.SubDepartmentDto;
import com.edenlisk.ubuvuzi.connect.entity.SubDepartment;
import jakarta.validation.constraints.NotNull;

public class SubDepartmentsMapper {

    public static SubDepartment mapToSubDepartment(SubDepartment subDepartment, @NotNull SubDepartmentDto subDepartmentDto) {
//        subDepartment.setDepartment(DepartmentMapper.mapToDepartment(subDepartmentDto.getDepartmentDto(), new Department()));
//        subDepartment.setSubDepartmentName(subDepartmentDto.getSubDepartmentName());
        return subDepartment;
    }

    public static SubDepartmentDto mapToSubDepartmentDto(SubDepartmentDto subDepartmentDto, SubDepartment subDepartment) {
        subDepartmentDto.setSubDepartmentName(subDepartment.getSubDepartmentName());
        subDepartmentDto.setId(subDepartment.getId());
//        subDepartmentDto.setDepartmentDto(DepartmentMapper.mapToDepartmentDto(subDepartment.getDepartment(), new DepartmentDto()));
        return subDepartmentDto;
    }

}

