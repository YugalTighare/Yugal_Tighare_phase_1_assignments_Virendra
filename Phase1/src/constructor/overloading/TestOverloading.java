package constructor.overloading;

public class TestOverloading {
	public int calculate(int a , int b){
		return a + b ;
	}
	public int calculate(int r){
		return (int) (3.14*r*r);
	}
	public int calculate(float l, int b){
		return (int) (l*b);
	}
public static void main (String [] args){
	TestOverloading obj1 = new TestOverloading();
	System.out.println("calling addition method by passing 3 and 2 as parameter " + obj1.calculate(3 , 2));
	System.out.println("calling area of circle by passing radius 6 is " + obj1.calculate(6));
	System.out.println("calling area of rectangle by passing 14 and 4 as parameter " + obj1.calculate(14f , 4));
}
}
