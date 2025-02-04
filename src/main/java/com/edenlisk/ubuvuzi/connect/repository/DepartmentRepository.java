package com.edenlisk.ubuvuzi.connect.repository;


import com.edenlisk.ubuvuzi.connect.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
