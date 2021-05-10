package ýnterfaceAbstractDemo.abstracts;

import ýnterfaceAbstractDemo.entities.Customer;

//starbucks ve nero için ortak iþlemler
public abstract class BaseCustomerManager implements CustomerService {

	//virtual
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db " + customer.getFirstName());		
	}

}
