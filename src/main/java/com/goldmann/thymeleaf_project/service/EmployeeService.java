package com.goldmann.thymeleaf_project.service;

import com.goldmann.thymeleaf_project.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeByID(long id);
    Page < Employee > findPaginated(int pageNo, int pageSize);

}

