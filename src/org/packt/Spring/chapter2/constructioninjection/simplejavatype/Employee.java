package org.packt.Spring.chapter2.constructioninjection.simplejavatype;

public class Employee {

	private String employeeName;
	private int employeeAge;
	private String employeeId;
	
	private Address address;
	public Employee(String employeeName, int employeeAge, String employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeId = employeeId;
	}
	
	public Employee(String employeeName, String employeeId, int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeId = employeeId;
	}

	public Employee(String employeeName, int employeeAge, String employeeId, Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeId = employeeId;
		this.address = address;
	}
	
	void show()
	{
		System.out.println(this.employeeName+" "+this.employeeId+" "+this.employeeAge);
		System.out.println(address.toString());
	}
	
	
	
	
}
