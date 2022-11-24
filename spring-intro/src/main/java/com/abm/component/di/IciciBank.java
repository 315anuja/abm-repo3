package com.abm.component.di;

import org.springframework.stereotype.Component;

@Component
public class IciciBank  implements Bank{

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("user of IciciBAnk wanting to withdraw"+amount);
		
	}

}
