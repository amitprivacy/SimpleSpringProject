package org.packt.Spring.chapter2.ApplicationContext;

public class EmployeeServiceImpl implements EmployeeService{
	
	public Long generateEmployeeId()
	{
		return System.currentTimeMillis();
	}

}
