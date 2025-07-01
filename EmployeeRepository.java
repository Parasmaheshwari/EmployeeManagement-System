package com.googlerestapi.googleapi.repository;

import com.googlerestapi.googleapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // CRUD

}
