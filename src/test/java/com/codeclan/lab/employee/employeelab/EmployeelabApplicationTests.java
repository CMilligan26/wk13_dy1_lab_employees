package com.codeclan.lab.employee.employeelab;

import com.codeclan.lab.employee.employeelab.models.Department;
import com.codeclan.lab.employee.employeelab.models.Employee;
import com.codeclan.lab.employee.employeelab.models.Project;
import com.codeclan.lab.employee.employeelab.repositories.DepartmentRepository;
import com.codeclan.lab.employee.employeelab.repositories.EmployeeRepository;
import com.codeclan.lab.employee.employeelab.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeelabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateDepartmentAndEmployee(){
		Department department = new Department("HR");
		departmentRepository.save(department);
		Employee steve = new Employee("Steve", 33, 12, "steve@steve.com", department);
		employeeRepository.save(steve);
	}

	@Test
	public void addEmployeesInProjects(){
		Department department = new Department("HR");
		departmentRepository.save(department);
		Employee steve = new Employee("Steve", 33, 12, "steve@steve.com", department);
		employeeRepository.save(steve);
		Project project = new Project("Project 1", 5);
		projectRepository.save(project);
		project.addEmployee(steve);
		projectRepository.save(project);

	}

}

