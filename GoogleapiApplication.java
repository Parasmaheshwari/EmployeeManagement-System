package com.googlerestapi.googleapi;

import com.googlerestapi.googleapi.model.Employee;
import com.googlerestapi.googleapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoogleapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GoogleapiApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		if (employeeRepository.count() == 0) {
			Employee employee = new Employee();
			employee.setFirstName("Paras");
			employee.setLastName("Maheshwari");
			employee.setEmailId("paras@gmail.com");
			employeeRepository.save(employee);

			Employee employee1 = new Employee();
			employee1.setFirstName("Shashi");
			employee1.setLastName("Rani");
			employee1.setEmailId("shashi@gmail.com");
			employeeRepository.save(employee1);

			System.out.println("Initial data added.");
		} else {
			System.out.println("Data already exists, skipping insert.");
		}
	}

}
