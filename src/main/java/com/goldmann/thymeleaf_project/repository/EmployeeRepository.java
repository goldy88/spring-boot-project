package com.goldmann.thymeleaf_project.repository;

import com.goldmann.thymeleaf_project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
