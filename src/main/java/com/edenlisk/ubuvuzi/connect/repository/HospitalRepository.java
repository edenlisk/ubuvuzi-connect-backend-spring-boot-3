package com.edenlisk.ubuvuzi.connect.repository;

import com.edenlisk.ubuvuzi.connect.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

}
