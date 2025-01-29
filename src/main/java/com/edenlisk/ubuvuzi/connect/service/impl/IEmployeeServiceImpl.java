package com.edenlisk.ubuvuzi.connect.service.impl;

import com.edenlisk.ubuvuzi.connect.dto.EmployeeDto;
import com.edenlisk.ubuvuzi.connect.service.IEmployeeService;
import org.springframework.stereotype.Service;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {


    /**
     * @param employeeDto - EmployeeDto Object
     *                    return Employee
     */
    @Override
    public void addEmployee(EmployeeDto employeeDto) {

    }

    /**
     * @param employeeId - Employee unique identifier
     *                   return EmployeeDto
     */
    @Override
    public EmployeeDto fetchEmployee(Long employeeId) {
        return null;
    }
}
