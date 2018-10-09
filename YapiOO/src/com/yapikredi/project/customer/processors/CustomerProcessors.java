package com.yapikredi.project.customer.processors;

import java.util.ArrayList;
import java.util.List;

import com.yapikredi.project.customer.business.UserInterractions;
import com.yapikredi.project.customer.commands.Icommand;
import com.yapikredi.project.customer.models.Customer;

public class CustomerProcessors {
	List<Icommand> icommands = new ArrayList<>();
	
	public void addCommand(Icommand icommand) {
		icommands.add(icommand);
	}
	
	public void showMenu() {
		UserInterractions ui = UserInterractions.getInstance();
		for (int i = 0; i < icommands.size(); i++) {
			Icommand icommand = icommands.get(i);
			ui.printLine( (i + 1) + " " +  icommand.getMenuDescription());
		}
	}
	
	public int getMenuChoice() {
		UserInterractions ui = UserInterractions.getInstance();
		ui.printLine("seçiminiz : ");
		int index = ui.getIntegerInput();
		return index;
		
	}
	
	public void executeCommand(int index,Customer customer) {
		Icommand icommand = icommands.get(index - 1);
		icommand.execute(customer);
	}
}
