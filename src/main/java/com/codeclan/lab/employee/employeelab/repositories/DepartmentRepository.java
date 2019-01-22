package com.codeclan.lab.employee.employeelab.repositories;

import com.codeclan.lab.employee.employeelab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
