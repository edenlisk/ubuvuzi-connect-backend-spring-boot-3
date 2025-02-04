package com.edenlisk.ubuvuzi.connect.repository;


import com.edenlisk.ubuvuzi.connect.entity.Outcome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOutcomeRepository extends JpaRepository<Outcome, Long> {


}
