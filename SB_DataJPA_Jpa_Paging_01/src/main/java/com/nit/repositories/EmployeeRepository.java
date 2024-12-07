package com.nit.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nit.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Serializable>
{ 
	


}
