package day8;

public class BankOfBaroda implements InternationalBank{

	@Override
	public void createAccount(String name, String email) {
		String acc = name + Math.round(Math.random()*100);
		System.out.println("Account Created: " + acc);
		
	}
	@Override
	public void deposit(double amount) {
		System.out.println(amount + " deposited.");
		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println(amount + " withdrawl.");
		
	}

	@Override
	public void transfer(double amount, String account) {
		System.out.println(amount + " Transfered to " + account);
		
	}

	

}
