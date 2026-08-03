//Ashley Snuggs CIS 407 Part 1 

package courseProject;

import java.util.ArrayList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<>();
		
		Customer customer1 = new Customer();
		customer1.setID("1");
		customer1.setSSN("123456789");
		customer1.setLastName("Smith");
		customer1.setFirstName("Jane");
		customer1.setCustStreet("123 Main Street");
		customer1.setCustCity("Gotham");
		customer1.setCustState("DC");
		customer1.setCustZip("12345");
		customer1.setCustPhone("0987654321");
		
		customers.add(customer1);
		
		Customer customer2 = new Customer();
		customer2.setID("2");
		customer2.setSSN("987654321");
		customer2.setLastName("Williams");
		customer2.setFirstName("Jake");
		customer2.setCustStreet("456 Elm Street");
		customer2.setCustCity("Springwood");
		customer2.setCustState("OH");
		customer2.setCustZip("54321");
		customer2.setCustPhone("1234567890");
		
		customers.add(customer2);
		
		System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %-5s %-15s %s%n","Customer ID","Customer SSN","Last Name","First Name","Street Address","City","State","Zip Code", "Phone Number");
		
		for (Customer cust : customers) {
			System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %-5s %-15s %s%n", cust.custid, cust.ssn, cust.lastname, cust.firstname, cust.custstreet , cust.custcity, cust.custstate, cust.custzip, cust.custphone);
		}

	}
}