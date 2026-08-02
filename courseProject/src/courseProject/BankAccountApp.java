package courseProject;

import java.util.ArrayList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<>();
		
		Customer customer1 = new Customer();
		customer1.setID("1");
		customer1.setSSN(null);
		customer1.setLastName(null);
		customer1.setFirstName(null);
		customer1.setCustStreet(null);
		customer1.setCustCity(null);
		customer1.setCustState(null);
		customer1.setCustZip(null);
		customer1.setCustPhone();
		
		customers.add(customer1);
		
		Customer customer2 = new Customer();
		customer2.setID("1");
		customer2.setSSN(null);
		customer2.setLastName(null);
		customer2.setFirstName(null);
		customer2.setCustStreet(null);
		customer2.setCustCity(null);
		customer2.setCustState(null);
		customer2.setCustZip(null);
		customer2.setCustPhone();
		
		customers.add(customer2);
		
	}

}
