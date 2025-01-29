package com.edenlisk.ubuvuzi.connect.mapper;

import com.edenlisk.ubuvuzi.connect.dto.AddressDto;
import com.edenlisk.ubuvuzi.connect.entity.Address;
import jakarta.validation.constraints.NotNull;

public class AddressMapper {

    @NotNull
    public static Address mapToAddress(Address address, AddressDto addressDto) {
        address.setProvince(addressDto.getProvince());
        address.setDistrict(addressDto.getDistrict());
        address.setSector(addressDto.getSector());
        address.setCell(addressDto.getCell());
        address.setVillage(addressDto.getVillage());
        return address;
    }

    @NotNull
    public static AddressDto mapToAddressDto(AddressDto addressDto,  Address address) {
        addressDto.setProvince(address.getProvince());
        addressDto.setDistrict(address.getDistrict());
        addressDto.setSector(address.getSector());
        addressDto.setCell(address.getCell());
        addressDto.setVillage(address.getVillage());
        return addressDto;
    }
}
