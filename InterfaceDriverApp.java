package day8;

public class InterfaceDriverApp {
	public static void main(String[] args) {
		Horse h1 = new Horse();
		Animal h2 = new Horse();
		
//		h1.eat();
//		h1.sleep();
//		h1.run();
//		
//		h2.eat();
//		h2.sleep();
//		h2.run();
		
		Animal t1 = new BengolTiger();
		Tiger t2 = new BengolTiger();
		BengolTiger t3 = new BengolTiger();
		
//		t1.eat();
//		t2.sleep();
//		t3.run();
		
//		t1.hunt();
//		t2.hunt(); not work because its a method og b tiger
//		t3.hunt();
		
		Shape f1 = new FootballField();
		Rect f2 = new FootballField();
		FootballField f3 = new FootballField();
		
		
	}
}
