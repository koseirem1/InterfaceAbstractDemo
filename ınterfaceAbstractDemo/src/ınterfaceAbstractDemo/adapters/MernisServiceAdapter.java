package �nterfaceAbstractDemo.adapters;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import �nterfaceAbstractDemo.abstracts.CustomerCheckService;
import �nterfaceAbstractDemo.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result = true;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
			
		} catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		
		return result;
		
	}

}
