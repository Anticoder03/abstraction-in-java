package day8;

public class User extends BankOfBaroda{
	public static void main(String[] args) {
		InternationalBank user1 = new BankOfBaroda();
		
		user1.createAccount("Ashish", "ap5381545@gmail.com");
		user1.deposit(50000);
		user1.withdraw(6000);
		user1.transfer(10000, "Ashish03");
		
		System.out.println("Type Of Bank Is :" + InternationalBank.TYPE);

		
	}
}
