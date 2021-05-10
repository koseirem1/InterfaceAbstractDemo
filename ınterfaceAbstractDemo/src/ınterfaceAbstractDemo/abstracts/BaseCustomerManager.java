package �nterfaceAbstractDemo.abstracts;

import �nterfaceAbstractDemo.entities.Customer;

//starbucks ve nero i�in ortak i�lemler
public abstract class BaseCustomerManager implements CustomerService {

	//virtual
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db " + customer.getFirstName());		
	}

}
