package entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	private Double interestRate;

	public Account() {
	}

	

	public Account(Integer number, String holder, Double balance, Double interestRate) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.interestRate = interestRate;
	}


	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0 ;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public Double getinterestRate() {
		return interestRate;
	}
	public void interestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {
		balance += balance * interestRate;
	}
}
