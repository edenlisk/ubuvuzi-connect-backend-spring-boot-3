package com.edenlisk.ubuvuzi.connect.mapper;


import com.edenlisk.ubuvuzi.connect.dto.AddressDto;
import com.edenlisk.ubuvuzi.connect.dto.HospitalCreateDto;
import com.edenlisk.ubuvuzi.connect.dto.HospitalDto;
import com.edenlisk.ubuvuzi.connect.entity.Hospital;

public class HospitalMapper {

    public static HospitalDto mapToHospitalDto(Hospital hospital, HospitalDto hospitalDto) {
        hospitalDto.setId(hospital.getId());
        hospitalDto.setNameOfHospital(hospital.getNameOfHospital());
        // TODO 1: CREATE ADDRESS MAPPER ---> DONE
        hospitalDto.setAddress(AddressMapper.mapToAddressDto(new AddressDto(), hospital.getAddress()));
        return hospitalDto;
    }

    public static Hospital mapToHospital(HospitalCreateDto hospitalCreateDto, Hospital hospital) {
        hospital.setNameOfHospital(hospitalCreateDto.getNameOfHospital());
        return hospital;
    }
}
