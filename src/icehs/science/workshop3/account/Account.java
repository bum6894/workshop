package icehs.science.workshop3.account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public int calculateInterest() {
		System.out.println(">> ���ڸ� �����մϴ�.");
		System.out.println("���� : " + (int)(interestRate/100 * balance) + "��");
		balance += (int)(interestRate/100 * balance);
		printAccountInfo();
		return 0;
	}
	
	public void deposit(int money) {
		System.out.println(">> "+ money + "���� �Ա��մϴ�.");
		if (money < 0) {
			System.out.println("[�ַ�] ������ �Է��� �� �����ϴ�.");
			printAccountInfo();
		}else {
			balance += money;
			printAccountInfo();
		}
	}
	public void withdraw(int money) {
		System.out.println(">> "+ money + "���� ����մϴ�.");
		if (money < 0) {
			System.out.println("[�ַ�] ������ �Է��� �� �����ϴ�.");
			printAccountInfo();
		}else if (money > balance) {
			System.out.println("[����] �ܱ��� �����մϴ�.");
			printAccountInfo();
		}else {
			balance -= money;
			printAccountInfo();
		}
	}
	public void printAccountInfo() {
		System.out.println("���� ���� : " + account + ", �ܾ� : " + balance +"��, ������ : " + interestRate + "%");
	}
}
