package com.yapikredi.project.customer.processors;

import com.yapikredi.project.customer.commands.GoruntuleTL;
import com.yapikredi.project.customer.commands.ParaCekTL;
import com.yapikredi.project.customer.commands.ParaYatirTL;

public class BronzCustomerProcessors extends CustomerProcessors{
	
	public BronzCustomerProcessors() {
		addCommand(new GoruntuleTL());
		addCommand(new ParaCekTL());
		addCommand(new ParaYatirTL());
	}
	
}
