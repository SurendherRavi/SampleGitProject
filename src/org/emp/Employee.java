package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

//Diff package diff class
//child
public class Employee {
	public void empName() {
		System.out.println("kathir");		
	}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empName();	
	Company c = new Company();
	c.companyName();
	Project p = new Project();
	p.projectName();
	Client t = new Client();
	t.clientName();

}
}
