package com.yapikredi.project.customer.processors;

import com.yapikredi.project.customer.commands.GoruntuleDOLAR;
import com.yapikredi.project.customer.commands.GoruntuleTL;
import com.yapikredi.project.customer.commands.ParaCekDOLAR;
import com.yapikredi.project.customer.commands.ParaCekTL;
import com.yapikredi.project.customer.commands.ParaYatirDOLAR;
import com.yapikredi.project.customer.commands.ParaYatirTL;

public class GumusCustomerProcessors extends BronzCustomerProcessors{
	
	public GumusCustomerProcessors() {
		addCommand(new GoruntuleDOLAR());
		addCommand(new ParaCekDOLAR());
		addCommand(new ParaYatirDOLAR());

	}
	
}
