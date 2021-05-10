package ýnterfaceAbstractDemo.concretes;

import ýnterfaceAbstractDemo.abstracts.BaseCustomerManager;
import ýnterfaceAbstractDemo.abstracts.CustomerCheckService;
import ýnterfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("not a valid person");
		}
		
	}


}
