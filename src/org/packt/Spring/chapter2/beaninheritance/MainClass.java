package org.packt.Spring.chapter2.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp=(Employee)context.getBean("employeeBean");
		System.out.println(emp);
		
		Employee emp1=(Employee)context.getBean("indianEmployee");
		
		System.out.println(emp1);
		
	}

}
