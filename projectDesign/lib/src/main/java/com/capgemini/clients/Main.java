package com.capgemini.clients;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.dao.EmployeeDao;
import com.capgemini.dao.EmployeeDaoImplV2;
import com.capgemini.entities.Address;
import com.capgemini.entities.Employee;
import com.capgemini.entities.Project;

public class Main {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImplV2();
		
		Address address = new Address();
		address.setCity("mumbai");
		address.setState("mh");
		
		// Projects
		List<Project> list = new ArrayList<>();
		Project p1 = new Project();
		p1.setName("String");
		p1.setLocation("Dc");
		
		Project p2 = new Project();
		p2.setName("Boot");
		p2.setLocation("Ku");
		
		list.add(p1);
		 list.add(p2);
		
		Employee employee = new Employee();
		employee.setName("varunbabu");
		employee.setEmail("varunbabu@gmail.com");
		employee.setSalary(123455.0);
		employee.setAddress(address);
		employee.setProjectList(list);
		dao.createEmployee(employee);
		
	}
}
