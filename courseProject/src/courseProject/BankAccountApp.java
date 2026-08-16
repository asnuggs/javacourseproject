//Ashley Snuggs CIS 407 Part 1 

package courseProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<>();
		List<Accounts> accounts = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		String cont;
		
		do {
			Customer c = new Customer();
			Accounts a = new Accounts();
			
			while(true) {
				try {
					c.setID(DataEntry.getString("Customer ID: ", 5));
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					c.setSSN(DataEntry.getString("SSN: ", 9));
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					c.setLastName(DataEntry.getString("Last Name: "));
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
				
			}
			
			while(true) {
				try {
					c.setFirstName(DataEntry.getString("First Name: "));
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					c.setCustStreet(DataEntry.getString("Street Address: "));
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					c.setCustCity(DataEntry.getString("City: "));
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					c.setCustState(DataEntry.getString("State: "));
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					c.setCustZip(DataEntry.getNumString("Zip Code: "));
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					c.setCustPhone(DataEntry.getNumString("Phone Number: "));
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					a.setAccountNumber(DataEntry.getNumString("Account Number: "));
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					a.setAccountType(DataEntry.getString("Account Type:" ));
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					a.setServiceFee(DataEntry.getDecimalLimit( "Service Fee: ", 0, 10));
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try { 
					a.setIntrestRate(DataEntry.getDecimalLimit("Intrest Rate: ", 0, 10));
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			a.setOverdraftFee(5);
			a.setBalance(0);
			
			customers.add(c);
			accounts.add(a);
			System.out.println("Would you like to add a new customer? (y/n)");
			cont = scanner.nextLine();
		} while (!cont.equalsIgnoreCase("N"));
		
		scanner.close();
		
		System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %-5s %-15s %s%n","Customer ID","Customer SSN","Last Name","First Name","Street Address","City","State","Zip Code", "Phone Number");
		
		for (Customer cust : customers) {
			System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %-5s %-15s %s%n", cust.custid, cust.ssn, cust.lastname, cust.firstname, cust.custstreet , cust.custcity, cust.custstate, cust.custzip, cust.custphone);
		}
		
		System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %s%n", "Account Number","Account Type","Service Fee","Intrest Rate", "Overdraft Fee", "Balance");
		
		for (Accounts act : accounts) {
			System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %s%n", act.accountNumber, act.accountType, act.serviceFee , act.intrestRate , act.overdraftFee, act.balance);
		}

	}
}
