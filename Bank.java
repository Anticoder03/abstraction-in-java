package day8;

public interface Bank {
	void createAccount(String name,String email);
	void deposit(double amount);
	void withdraw(double amount);
	void transfer(double amount, String account);
	 
	
}
