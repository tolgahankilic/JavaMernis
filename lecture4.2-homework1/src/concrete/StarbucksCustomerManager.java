package concrete;

import entities.Customer;
import interfaces.BaseCustomerManager;
import interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Starbucks Manager : Validation Error - Not a valid person.");
		}
	}

}
