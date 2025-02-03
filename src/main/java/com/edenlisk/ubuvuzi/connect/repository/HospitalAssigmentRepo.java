package com.edenlisk.ubuvuzi.connect.repository;


import com.edenlisk.ubuvuzi.connect.entity.HospitalEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalAssigmentRepo extends JpaRepository<HospitalEmployee, Long> {
}
