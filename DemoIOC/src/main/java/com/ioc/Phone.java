package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {
//using IOC container
	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("beans.xml");
		Sim s=c.getBean("Sim",Sim.class);
		s.calling();
		s.data();

	}

}
