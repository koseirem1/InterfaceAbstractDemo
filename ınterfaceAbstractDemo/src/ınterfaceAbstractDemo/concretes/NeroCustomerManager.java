package ýnterfaceAbstractDemo.concretes;

import ýnterfaceAbstractDemo.abstracts.BaseCustomerManager;
import ýnterfaceAbstractDemo.abstracts.CustomerCheckService;
import ýnterfaceAbstractDemo.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService checkService;
	
	
	public NeroCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}


	@Override
	public void save(Customer customer) {
		if(checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("not a valid person");
		}
	}
	

}
