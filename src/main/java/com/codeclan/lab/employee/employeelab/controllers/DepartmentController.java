package com.codeclan.lab.employee.employeelab.controllers;

import com.codeclan.lab.employee.employeelab.models.Department;
import com.codeclan.lab.employee.employeelab.models.Employee;
import com.codeclan.lab.employee.employeelab.repositories.DepartmentRepository;
import com.codeclan.lab.employee.employeelab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/departments")
public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping()
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Department> getDepartment(@PathVariable Long id){
        return departmentRepository.findById(id);
    }

}
