package com.yapikredi.dp.structural.facade;

import com.yapikredi.project.customer.models.Customer;

public class CustomerFacade {

	public boolean createCustomer(final Customer customer) {
		CRM crm = new CRM();
		Billing billing = new Billing();
		SMS sms = new SMS();
//		if (crm.createCustomer(customer)) {
//			if (billing.createBilling(customer)) {
//				sms.sendSMS("Customer yaratýldý");
//				return true;
//			}
//		}

		if (!crm.createCustomer(customer)) {
			return false;
		}
		if (!billing.createBilling(customer)) {
			return false;
		}
		sms.sendSMS("Customer yaratýldý");
		return true;

	}

}
