package com.nit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.nit.entity.Employee;
import com.nit.repositories.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmployeeRepository bean = run.getBean(EmployeeRepository.class);
		
		
		int pageSize = 3;      //to print the total records from the db here in output only 3 records are displayed 
		int pageNo = 0;   //index starts from zero(1st page) 
		
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		
		Page<Employee> all = bean.findAll(pageRequest);
		
		all.forEach(pages->System.out.println(pages));
		
		

	}
}
