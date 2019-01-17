package icehs.science.workshop3.account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setAccount("441-0290-1203");
		account1.setBalance(500000);
		account1.setInterestRate(7.3);
		
		System.out.println(">> 계좌를 생성합니다.");
		account1.printAccountInfo();
		System.out.println();
		account1.deposit(20000);
		System.out.println();
		account1.calculateInterest();
		System.out.println();
		account1.withdraw(150000);
		System.out.println();
		account1.withdraw(500000);
		System.out.println();
	}
}
