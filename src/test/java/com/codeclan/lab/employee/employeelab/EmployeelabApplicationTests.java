package com.codeclan.lab.employee.employeelab;

import com.codeclan.lab.employee.employeelab.models.Employee;
import com.codeclan.lab.employee.employeelab.repositories.EmployeeRepository;
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

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployee(){
		Employee steve = new Employee("Steve", 33, 12, "steve@steve.com");
		employeeRepository.save(steve);
	}

}

