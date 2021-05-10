package �nterfaceAbstractDemo;

import java.time.LocalDate;


import �nterfaceAbstractDemo.abstracts.BaseCustomerManager;
import �nterfaceAbstractDemo.adapters.MernisServiceAdapter;
import �nterfaceAbstractDemo.concretes.NeroCustomerManager;
import �nterfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseManager = new NeroCustomerManager(new MernisServiceAdapter());
		baseManager.save(new Customer(1, "�rem", "�lhan",LocalDate.of(1995, 5, 20) , "123456789101"));
	}

}
