package com.edenlisk.ubuvuzi.connect.repository;


import com.edenlisk.ubuvuzi.connect.dto.AddressDto;
import com.edenlisk.ubuvuzi.connect.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
