package com.edenlisk.ubuvuzi.connect.service;

import com.edenlisk.ubuvuzi.connect.dto.EmployeeDto;

public interface IEmployeeService {


    /**
     *
     * @param employeeDto - EmployeeDto Object
     * return Employee
     */
    void addEmployee(EmployeeDto employeeDto);

    /**
     *
     * @param employeeId - Employee unique identifier
     * return EmployeeDto
     */
    EmployeeDto fetchEmployee(Long employeeId);


}

