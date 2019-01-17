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
		System.out.println(">> 이자를 지급합니다.");
		System.out.println("이자 : " + (int)(interestRate/100 * balance) + "원");
		balance += (int)(interestRate/100 * balance);
		printAccountInfo();
		return 0;
	}
	
	public void deposit(int money) {
		System.out.println(">> "+ money + "원을 입금합니다.");
		if (money < 0) {
			System.out.println("[애러] 음수는 입력할 수 없습니다.");
			printAccountInfo();
		}else {
			balance += money;
			printAccountInfo();
		}
	}
	public void withdraw(int money) {
		System.out.println(">> "+ money + "원을 출금합니다.");
		if (money < 0) {
			System.out.println("[애러] 음수는 입력할 수 없습니다.");
			printAccountInfo();
		}else if (money > balance) {
			System.out.println("[에러] 잔금이 부족합니다.");
			printAccountInfo();
		}else {
			balance -= money;
			printAccountInfo();
		}
	}
	public void printAccountInfo() {
		System.out.println("계좌 정보 : " + account + ", 잔액 : " + balance +"원, 이자율 : " + interestRate + "%");
	}
}
