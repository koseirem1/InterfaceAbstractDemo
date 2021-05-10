package ýnterfaceAbstractDemo;

import java.time.LocalDate;


import ýnterfaceAbstractDemo.abstracts.BaseCustomerManager;
import ýnterfaceAbstractDemo.adapters.MernisServiceAdapter;
import ýnterfaceAbstractDemo.concretes.NeroCustomerManager;
import ýnterfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseManager = new NeroCustomerManager(new MernisServiceAdapter());
		baseManager.save(new Customer(1, "Ýrem", "Ýlhan",LocalDate.of(1995, 5, 20) , "123456789101"));
	}

}
