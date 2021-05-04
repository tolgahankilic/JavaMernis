import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;
import interfaces.BaseCustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(0, "Tolgahan", "Kýlýç", 1999, "12345678901");

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.Save(customer);

	}

}
