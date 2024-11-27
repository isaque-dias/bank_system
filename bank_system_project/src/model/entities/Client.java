package model.entities;

public class Client extends Person {
	private String accountNumber;
	private String agency;
	private String accountType;
	private Double balance = 1.0;
	

	public Client() {
	}

	public Client(String name, String cpf, String address, String email, String phoneNumber, String accountNumber,
			String agency, String accountType, Double balance) {
		super(name, cpf, address, email, phoneNumber);
		this.accountNumber = accountNumber;
		this.agency = agency;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	public void deposit(Double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.printf("Deposit made. New balance: %.2f%n", balance);
		}else {
			System.out.println("Invalid deposit amount.");
		}
	}

	
	public void withdraw(Double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.printf("Withdrawal made. New balance: %.2f%n", balance);
		} else {
			System.out.println("Withdrawal not allowed. Insufficient balance or invalid amount.");
		}
	}
	
	
	public void checkBalance() {
		System.out.printf("Current balance: %.2f%n", balance);
	}

	
	public void showInformations() {
		System.out.println(super.toString());
	}

	
	@Override
	public String toString() {
		return "Client [accountNumber=" + accountNumber + ", agency=" + agency + ", accountType=" + accountType
				+ ", balance=" + balance + "]";
	}
	
	
	
}
