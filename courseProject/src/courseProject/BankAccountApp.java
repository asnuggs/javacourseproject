//Ashley Snuggs CIS 407 Part 1 

package courseProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<>();
		DataEntry de = new DataEntry();
		Scanner scanner = new Scanner(System.in);
		
		String cont;
		
		do {
			System.out.println("Would you like to add a new customer? (y/n");
			cont = scanner.nextLine();
			Customer customer = new Customer();
			while(true) {
				try {
					customer.setID(de.getString("Customer ID: ", 5));
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
		} while (cont != "n");
		
		scanner.close();
		
		System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %-5s %-15s %s%n","Customer ID","Customer SSN","Last Name","First Name","Street Address","City","State","Zip Code", "Phone Number");
		
		for (Customer cust : customers) {
			System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %-5s %-15s %s%n", cust.custid, cust.ssn, cust.lastname, cust.firstname, cust.custstreet , cust.custcity, cust.custstate, cust.custzip, cust.custphone);
		}

	}
}