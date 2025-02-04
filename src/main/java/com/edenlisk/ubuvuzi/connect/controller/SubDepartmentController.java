package com.edenlisk.ubuvuzi.connect.controller;


import com.edenlisk.ubuvuzi.connect.dto.CreateSubDepartmentDto;
import com.edenlisk.ubuvuzi.connect.dto.ResponseDto;
import com.edenlisk.ubuvuzi.connect.dto.SubDepartmentDto;
import com.edenlisk.ubuvuzi.connect.entity.Department;
import com.edenlisk.ubuvuzi.connect.entity.SubDepartment;
import com.edenlisk.ubuvuzi.connect.mapper.SubDepartmentsMapper;
import com.edenlisk.ubuvuzi.connect.repository.DepartmentRepository;
import com.edenlisk.ubuvuzi.connect.repository.SubDepartmentRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/sub-departments", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
@AllArgsConstructor
public class SubDepartmentController {

    private SubDepartmentRepository subDepartmentRepository;
    private DepartmentRepository departmentRepository;


    @PostMapping
    public ResponseEntity<ResponseDto> createSubDepartment(@Valid @RequestBody CreateSubDepartmentDto subDepartmentDto) {
        Department department = departmentRepository.findById(subDepartmentDto.getDepartmentId()).get();
        var subDep = new SubDepartment();
        subDep.setDepartment(department);
        subDep.setSubDepartmentName(subDepartmentDto.getSubDepartmentName());
        subDepartmentRepository.save(subDep);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto("202", "Sub department created successfully"));
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<List<SubDepartmentDto>> getSubDepartments(@PathVariable Long departmentId) {
        List<SubDepartmentDto> subDepartmentDtos = subDepartmentRepository.findAllByDepartmentId(departmentId)
                .stream()
                .map(subDepartment -> SubDepartmentsMapper.mapToSubDepartmentDto(new SubDepartmentDto(), subDepartment))
                .toList();

        return ResponseEntity.ok(subDepartmentDtos);
    }

}
