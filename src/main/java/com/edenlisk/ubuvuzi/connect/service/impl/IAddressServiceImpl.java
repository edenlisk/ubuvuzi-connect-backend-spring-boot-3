package com.edenlisk.ubuvuzi.connect.service.impl;

import com.edenlisk.ubuvuzi.connect.dto.AddressDto;
import com.edenlisk.ubuvuzi.connect.entity.Address;
import com.edenlisk.ubuvuzi.connect.mapper.AddressMapper;
import com.edenlisk.ubuvuzi.connect.repository.AddressRepository;
import com.edenlisk.ubuvuzi.connect.service.IAddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IAddressServiceImpl implements IAddressService {

    private AddressRepository addressRepository;

    /**
     * @param addressDto - AddressDto Object
     */
    @Override
    public Address create(AddressDto addressDto) {
        Address address = AddressMapper.mapToAddress(new Address(), addressDto);
        return addressRepository.save(address);
    }
}
