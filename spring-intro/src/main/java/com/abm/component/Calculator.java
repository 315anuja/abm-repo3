package com.abm.component;

import org.springframework.stereotype.Component;

@Component("cc") //alternative  to <bean  id="calc"  class="...calculator" 

public class Calculator {
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void sub(int x,int y) {
		System.out.println(x-y);
	}
}
