package com.yapikredi.project.customer.processors;

import com.yapikredi.project.customer.commands.GoruntuleALTIN;
import com.yapikredi.project.customer.commands.GoruntuleDOLAR;
import com.yapikredi.project.customer.commands.GoruntuleTL;
import com.yapikredi.project.customer.commands.ParaCekAltin;
import com.yapikredi.project.customer.commands.ParaCekDOLAR;
import com.yapikredi.project.customer.commands.ParaYatirAltin;
import com.yapikredi.project.customer.commands.ParaYatirDOLAR;

public class AltinCustomerProcessors extends GumusCustomerProcessors{
	
	public AltinCustomerProcessors() {
		addCommand(new GoruntuleALTIN());
		addCommand(new ParaCekAltin());
		addCommand(new ParaYatirAltin());

		
	}
	
}
