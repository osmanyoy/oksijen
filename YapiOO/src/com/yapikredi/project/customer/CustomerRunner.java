package com.yapikredi.project.customer;

import com.yapikredi.project.customer.business.CustomerManager;
import com.yapikredi.project.customer.business.UserInterractions;
import com.yapikredi.project.customer.models.Customer;
import com.yapikredi.project.customer.models.ECustomerType;
import com.yapikredi.project.customer.processors.CustomerProcessors;

public class CustomerRunner {
	public static void main(String[] args) {
		userlogin: while(true) {
			UserInterractions userInterractions = UserInterractions.getInstance();
			userInterractions.printLine("username : ");
			String username = userInterractions.getStringInput();
			userInterractions.printLine("username : ");
			String password = userInterractions.getStringInput();
			
			Customer login = CustomerManager.getInstance().login(username, password);
			if (login == null) {
				System.out.println("Username yada password yanlýþ");
				continue userlogin;
			}
			
			ECustomerType customerType = login.getCustomerType();
			CustomerProcessors processor = customerType.getProcessor();
			
			while (true) {
				processor.showMenu();
				int menuChoice = processor.getMenuChoice();
				processor.executeCommand(menuChoice, login);
			}
			
			
		}
		
	}
}
