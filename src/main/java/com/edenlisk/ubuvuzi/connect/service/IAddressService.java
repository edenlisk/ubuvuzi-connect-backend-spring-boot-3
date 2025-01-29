package com.edenlisk.ubuvuzi.connect.service;


import com.edenlisk.ubuvuzi.connect.dto.AddressDto;
import com.edenlisk.ubuvuzi.connect.entity.Address;

public interface IAddressService {

    /**
     *
     * @param addressDto - AddressDto Object
     * return Address
     */
    Address create(AddressDto addressDto);


}
