package com.edenlisk.ubuvuzi.connect.repository;

import com.edenlisk.ubuvuzi.connect.entity.HealthInsurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthInsuranceRepository extends JpaRepository<HealthInsurance, Long> {


}
