package ýnterfaceAbstractDemo.concretes;

import ýnterfaceAbstractDemo.abstracts.CustomerCheckService;
import ýnterfaceAbstractDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}



	
}
