package com.edenlisk.ubuvuzi.connect.mapper;

import com.edenlisk.ubuvuzi.connect.dto.DepartmentDto;
import com.edenlisk.ubuvuzi.connect.dto.SubDepartmentDto;
import com.edenlisk.ubuvuzi.connect.entity.Department;

public class DepartmentMapper {

    public static DepartmentDto mapToDepartmentDto(Department department, DepartmentDto departmentDto) {
        departmentDto.setDepartmentName(department.getDepartmentName());
        departmentDto.setSubDepartments(
                department.getSubDepartments()
                .stream()
                .map(subDepartment -> SubDepartmentsMapper.mapToSubDepartmentDto(new SubDepartmentDto(), subDepartment))
                .toList()
        );
        departmentDto.setId(department.getId());

        // TODO 2: CREATE SUB DEPARTMENTS MAPPER
        return departmentDto;
    }


    public static Department mapToDepartment(DepartmentDto departmentDto, Department department) {
        department.setDepartmentName(departmentDto.getDepartmentName());
        return department;
    }
}
