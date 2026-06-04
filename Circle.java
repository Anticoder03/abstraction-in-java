package day8;

public class Circle implements Shape{
	
	@Override
	public void perimeter() {
		System.out.println("Area of circle" + Math.PI*5*5);
	}

	@Override
	public void area() {
		System.out.println("Perimeter of circle" + 2*Math.PI*5);
		
	}
}
