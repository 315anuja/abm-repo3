package com.abm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.Calculator;
import com.abm.component.HelloWorld;
import com.abm.component.HelloWorld1;
import com.abm.component.TextEditor;
import com.abm.component.di.Atm;
import com.abm.component.di.HdfcAtm;

public class App {
	public static void main(String[] args) {
		//Loading IoC Container of String
		ApplicationContext ctx=new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		//Accessing a bean
		for(int i =0;i<5;i++) {
		HelloWorld hw=(HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHello("Anuja"));
		}
		
		HelloWorld1 hw1=(HelloWorld1) ctx.getBean("hello1");  // hello1 is a id mention in my-spring-config.xml file
		System.out.println(hw1.sayHello1("ANUUUUUUUUUUUUUJJJJJJJJJJJJJJJJJJAaaaa"));
		
		Calculator c1=(Calculator) ctx.getBean("cc");
		c1.add(10, 20);
		c1.sub(10, 20);
		
		TextEditor te=(TextEditor) ctx.getBean("txtEdtr");
		te.loadDocument("abc.txt");
		
		Atm atm=(Atm) ctx.getBean(HdfcAtm.class);
		atm.withdraw(12, 123000);
		
		
	}

}
