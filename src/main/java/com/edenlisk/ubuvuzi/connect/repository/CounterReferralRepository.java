package com.edenlisk.ubuvuzi.connect.repository;

import com.edenlisk.ubuvuzi.connect.entity.CounterReferral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterReferralRepository extends JpaRepository<CounterReferral, Long> {
}
