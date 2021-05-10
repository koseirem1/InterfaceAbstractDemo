package �nterfaceAbstractDemo.concretes;

import �nterfaceAbstractDemo.abstracts.BaseCustomerManager;
import �nterfaceAbstractDemo.abstracts.CustomerCheckService;
import �nterfaceAbstractDemo.entities.Customer;

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
