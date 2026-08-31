package courseProject;

import java.time.LocalDate;

public abstract class Account {
	public String accountNumber;
	public LocalDate transactionDate;
	public String transactionType;
	public double transactionAmount;
	public double lastFeeCharged;
	public double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		if (accountNumber != null && accountNumber.length() > 5) {
			throw new IllegalArgumentException("Account Number can not be more than 5 characters.");
		} else if (accountNumber == null || accountNumber.isBlank()) {
			throw new IllegalArgumentException("Account Number can not be blank.");
		}
		this.accountNumber = accountNumber;
	}
	
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(LocalDate transactionDate) {
		if (transactionDate == null) {
			throw new IllegalArgumentException("Transaction date can not be blank.");
		}
		this.transactionDate = transactionDate;
	}
	
	public String getTransactionType() {
		return transactionType;
	}
	
	public void setTransactionType(String transactionType) {
		if (transactionType == null || transactionType.isBlank()) {
			throw new IllegalArgumentException("Transaction type can not be blank.");
		} else if (!transactionType.equalsIgnoreCase("DEP") && !transactionType.equalsIgnoreCase("WTH")) {
			throw new IllegalArgumentException("Transaction type must be DEP or WTH.");
		}
		this.transactionType = transactionType.toUpperCase();
	}
	
	public double getTransactionAmount() {
		return transactionAmount;
	}
	
	public void setTransactionAmount(double transactionAmount) {
		if (transactionAmount <= 0) {
			throw new IllegalArgumentException("Transaction amount must be greater than zero.");
		}
		this.transactionAmount = transactionAmount;
	}
	
	public double getLastFeeCharged() {
		return lastFeeCharged;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdrawal(double amount);
}
