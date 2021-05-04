package concrete;

import entities.Customer;
import interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
