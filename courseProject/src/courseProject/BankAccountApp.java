//Ashley Snuggs CIS 407 Part 3

package courseProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<>();
		List<Account> accounts = new ArrayList<>();
		
		String cont;
		
		do {
			Customer c = new Customer();
			Account a = null;
			
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
					String acctType = DataEntry.getString("Account Type (CHK/SAV): ");
					if (acctType.equalsIgnoreCase("CHK")) {
						a = new CheckingAccount();
					} else if (acctType.equalsIgnoreCase("SAV")) {
						a = new SavingsAccount();
					} else {
						throw new IllegalArgumentException("Account type must be CHK or SAV.");
					}
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
					a.setTransactionDate(DataEntry.getDate("Opening Transaction Date: "));
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					String type = DataEntry.getString("Opening Transaction Type (DEP/WTH): ");
					double amount = DataEntry.getDecimal("Opening Transaction Amount: ");
					if (type.equalsIgnoreCase("DEP")) {
						a.deposit(amount);
					} else if (type.equalsIgnoreCase("WTH")) {
						a.withdrawal(amount);
					} else {
						throw new IllegalArgumentException("Transaction type must be DEP or WTH.");
					}
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			System.out.printf("%-12s %-15s %-12s %-14s %-10s %-15s %-10s %s%n","Customer ID","Account Number","Account Type","Trans Date","Trans Type","Trans Amount","Fees","Balance");
			printTransaction(c, a, a.getTransactionDate());
			
			customers.add(c);
			accounts.add(a);
			cont = DataEntry.getString("Would you like to add a new customer? (y/n): ");
		} while (!cont.equalsIgnoreCase("N"));
		
		System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %-5s %-15s %s%n","Customer ID","Customer SSN","Last Name","First Name","Street Address","City","State","Zip Code", "Phone Number");
		
		for (Customer cust : customers) {
			System.out.printf("%-15s %-15s %-20s %-20s %-20s %-15s %-5s %-15s %s%n", cust.custid, cust.ssn, cust.lastname, cust.firstname, cust.custstreet , cust.custcity, cust.custstate, cust.custzip, cust.custphone);
		}
		
		System.out.printf("%n%-15s %-15s %s%n","Account Number","Account Type","Balance");
		
		for (Account act : accounts) {
			System.out.printf("%-15s %-15s %.2f%n", act.getAccountNumber(), getAccountTypeLabel(act), act.getBalance());
		}
		
		String moreTrans = DataEntry.getString("\nWould you like to perform a transaction on an existing account? (y/n): ");
		if (moreTrans.equalsIgnoreCase("Y")) {
			System.out.printf("%n%-12s %-15s %-12s %-14s %-10s %-15s %-10s %s%n","Customer ID","Account Number","Account Type","Trans Date","Trans Type","Trans Amount","Fees","Balance");
		}
		while (moreTrans.equalsIgnoreCase("Y")) {
			Account selected = null;
			Customer selectedCustomer = null;
			
			while(true) {
				try {
					String acctNum = DataEntry.getString("Account Number: ");
					for (int i = 0; i < accounts.size(); i++) {
						if (accounts.get(i).getAccountNumber().equals(acctNum)) {
							selected = accounts.get(i);
							selectedCustomer = customers.get(i);
							break;
						}
					}
					if (selected == null) {
						throw new IllegalArgumentException("Account number not found.");
					}
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			LocalDate transDate = null;
			while(true) {
				try {
					transDate = DataEntry.getDate("Transaction Date: ");
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			while(true) {
				try {
					String type = DataEntry.getString("Transaction Type (DEP/WTH): ");
					double amount = DataEntry.getDecimal("Transaction Amount: ");
					if (type.equalsIgnoreCase("DEP")) {
						selected.deposit(amount);
					} else if (type.equalsIgnoreCase("WTH")) {
						selected.withdrawal(amount);
					} else {
						throw new IllegalArgumentException("Transaction type must be DEP or WTH.");
					}
					break;
				}catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			
			printTransaction(selectedCustomer, selected, transDate);
			
			moreTrans = DataEntry.getString("Would you like to perform another transaction? (y/n): ");
		}
		
		System.out.printf("%n%-15s %-15s %s%n","Account Number","Account Type","Balance");
		
		for (Account act : accounts) {
			System.out.printf("%-15s %-15s %.2f%n", act.getAccountNumber(), getAccountTypeLabel(act), act.getBalance());
		}
	}
	
	private static String getAccountTypeLabel(Account a) {
		if (a instanceof CheckingAccount) {
			return "CHK";
		} else {
			return "SAV";
		}
	}
	
	private static void printTransaction(Customer c, Account a, LocalDate date) {
		System.out.printf("%-12s %-15s %-12s %-14s %-10s %-15.2f %-10.2f %.2f%n",
				c.getID(), a.getAccountNumber(), getAccountTypeLabel(a), date, a.getTransactionType(), a.getTransactionAmount(), a.getLastFeeCharged(), a.getBalance());
	}
}
