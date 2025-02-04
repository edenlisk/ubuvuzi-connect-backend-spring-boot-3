package com.edenlisk.ubuvuzi.connect.controller;


import com.edenlisk.ubuvuzi.connect.dto.DepartmentDto;
import com.edenlisk.ubuvuzi.connect.dto.ResponseDto;
import com.edenlisk.ubuvuzi.connect.entity.Department;
import com.edenlisk.ubuvuzi.connect.mapper.DepartmentMapper;
import com.edenlisk.ubuvuzi.connect.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/departments", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Validated
public class DepartmentController {

    private DepartmentRepository departmentRepository;

    @PostMapping
    public ResponseEntity<ResponseDto> createDepartment() {
        Department inter = new Department();
        inter.setDepartmentName("Internal medicine");
        departmentRepository.save(inter);
        Department inter2 = new Department();
        inter2.setDepartmentName("Surgery");
        departmentRepository.save(inter2);

        Department inter3 = new Department();
        inter3.setDepartmentName("Paediatrics");
        departmentRepository.save(inter3);

        Department inter4 = new Department();
        inter4.setDepartmentName("Gynaecology & Obstetrics");
        departmentRepository.save(inter4);

        Department inter6 = new Department();
        inter6.setDepartmentName("Other specialty services");
        departmentRepository.save(inter6);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto("202", "Department created successfully"));
    }

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getDepartments() {
        List<DepartmentDto> departments = departmentRepository.findAll()
                .stream()
                .map(dept -> DepartmentMapper.mapToDepartmentDto(dept, new DepartmentDto()))
                .toList();

        return ResponseEntity.ok(departments);
    }

}
