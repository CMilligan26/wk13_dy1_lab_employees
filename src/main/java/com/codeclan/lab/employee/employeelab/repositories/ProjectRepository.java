package com.codeclan.lab.employee.employeelab.repositories;

import com.codeclan.lab.employee.employeelab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
