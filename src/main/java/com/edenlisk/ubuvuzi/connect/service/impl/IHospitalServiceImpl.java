package com.edenlisk.ubuvuzi.connect.service.impl;

import com.edenlisk.ubuvuzi.connect.dto.HospitalCreateDto;
import com.edenlisk.ubuvuzi.connect.dto.HospitalDto;
import com.edenlisk.ubuvuzi.connect.entity.Address;
import com.edenlisk.ubuvuzi.connect.entity.Hospital;
import com.edenlisk.ubuvuzi.connect.exception.ResourceNotFoundException;
import com.edenlisk.ubuvuzi.connect.mapper.AddressMapper;
import com.edenlisk.ubuvuzi.connect.mapper.HospitalMapper;
import com.edenlisk.ubuvuzi.connect.repository.AddressRepository;
import com.edenlisk.ubuvuzi.connect.repository.HospitalRepository;
import com.edenlisk.ubuvuzi.connect.service.IHospitalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IHospitalServiceImpl implements IHospitalService {


    private HospitalRepository hospitalRepository;
    private AddressRepository addressRepository;


    /**
     * @param hospitalCreateDto - HospitalCreateDto Object
     */
    @Override
    public void create(HospitalCreateDto hospitalCreateDto) {
        Address address = addressRepository.save(AddressMapper.mapToAddress(new Address(), hospitalCreateDto.getAddress()));
        Hospital hospital = HospitalMapper.mapToHospital(hospitalCreateDto, new Hospital());
        hospital.setAddress(address);
        hospitalRepository.save(hospital);
    }

    /**
     * @param hospitalId        - Input hospital unique identifier
     * @param hospitalCreateDto - HospitalCreateDto Object
     */
    @Override
    public void updateHospital(Long hospitalId, HospitalCreateDto hospitalCreateDto) {

    }

    /**
     * @param hospitalId - Input hospital unique identifier
     * @return hospital details
     */
    @Override
    public HospitalDto findById(Long hospitalId) {
        Hospital hospital = hospitalRepository.findById(hospitalId).orElseThrow(
                () -> new ResourceNotFoundException("Hospital", "hospitalId", hospitalId.toString())
        );
        System.out.println(hospital.toString());
        return HospitalMapper.mapToHospitalDto(hospital, new HospitalDto());
    }

    /**
     * @param employeeId - Input employee/medical staff identifier
     * @return List of all hospitals associated with medical staff/employee
     */
    @Override
    public List<HospitalDto> getHospitalsForEmployee(Long employeeId) {
        return List.of();
    }

    /**
     * @return List of all hospitals associated with medical staff/employee
     */
    @Override
    public List<HospitalDto> getAllHospitals() {
        return List.of();
    }

    /**
     * @param hospitalId - Input hospital unique identifier
     * @return a boolean to indicate the result
     */
    @Override
    public boolean deleteHospital(Long hospitalId) {
        return false;
    }
}
