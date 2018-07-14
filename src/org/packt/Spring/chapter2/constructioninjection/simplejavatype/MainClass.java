package org.packt.Spring.chapter2.constructioninjection.simplejavatype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee=(Employee)context.getBean("employee");
		
		employee.show();
		
		

	}

}
