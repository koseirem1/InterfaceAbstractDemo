package �nterfaceAbstractDemo.concretes;

import �nterfaceAbstractDemo.abstracts.CustomerCheckService;
import �nterfaceAbstractDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}



	
}
