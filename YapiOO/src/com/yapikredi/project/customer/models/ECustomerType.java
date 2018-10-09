package com.yapikredi.project.customer.models;

import com.yapikredi.project.customer.processors.AltinCustomerProcessors;
import com.yapikredi.project.customer.processors.BronzCustomerProcessors;
import com.yapikredi.project.customer.processors.CustomerProcessors;
import com.yapikredi.project.customer.processors.GumusCustomerProcessors;

public enum ECustomerType {
	ALTIN{
		public CustomerProcessors getProcessor() {
			return new AltinCustomerProcessors();
		}
		
	},GUMUS{
		public CustomerProcessors getProcessor() {
			return new GumusCustomerProcessors();
		}
		
	},BRONZ {
		public CustomerProcessors getProcessor() {
			return new BronzCustomerProcessors();
		}
		
	};
	
	public CustomerProcessors getProcessor() {
		return null;
	}
}
