package com.edenlisk.ubuvuzi.connect.service;

import com.edenlisk.ubuvuzi.connect.dto.HospitalCreateDto;
import com.edenlisk.ubuvuzi.connect.dto.HospitalDto;

import java.util.List;

public interface IHospitalService {

    /**
     *
     * @param hospitalCreateDto - HospitalCreateDto Object
     */
    void create(HospitalCreateDto hospitalCreateDto);

    /**
     *
     * @param hospitalId - Input hospital unique identifier
     * @param hospitalCreateDto - HospitalCreateDto Object
     */
    void updateHospital(Long hospitalId, HospitalCreateDto hospitalCreateDto);

    /**
     *
     * @param hospitalId - Input hospital unique identifier
     * @return hospital details
     */
    HospitalDto findById(Long hospitalId);


    /**
     *
     * @param employeeId - Input employee/medical staff identifier
     * @return List of all hospitals associated with medical staff/employee
     */
    List<HospitalDto> getHospitalsForEmployee(Long employeeId);

    /**
     *
     * @return List of all hospitals associated with medical staff/employee
     */
    List<HospitalDto> getAllHospitals();


    /**
     *
     * @param hospitalId - Input hospital unique identifier
     * @return a boolean to indicate the result
     */
    boolean deleteHospital(Long hospitalId);

}
