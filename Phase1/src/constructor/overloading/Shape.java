package constructor.overloading;

public class Shape {
	int side;
	float radius;
	int length;
	int breadth;
	Shape(){
	}
	Shape(int s){
		side = s;
	}
	
	Shape(float r){
		radius = r;
	}
	
	Shape(int l , int b){
		length = l;
		breadth = b;
	}
	
	 public float areaOfCircle(){
		 return 3.14f*radius*radius;
	 }
	 
	 public int areaOfSquare(){
		 return side*side;
	 }
	 
	 public int areaOfRectangle(){
		 return length*breadth;
	 
	 }
	 public int area(int height , int base){
		 return (height*base)/2;
	 }
	 public float area(float diagonal1 , float diagonal2){
		 return (diagonal1 * diagonal2)/2;
	 }
	 
	 
	 public static void main(String[] args) {
		Shape circle = new Shape(98.98f);
		Shape square = new Shape(54);
		Shape rectangle = new Shape(43,35);
		Shape traingle = new Shape();
		Shape rhombus = new Shape();
		System.out.println("Area of circle:"+ circle.areaOfCircle());
		System.out.println("Area of Square:"+ square.areaOfSquare());
		System.out.println("Area of rectangle:"+ rectangle.areaOfRectangle());
		System.out.println("Area of traingle:"+ traingle.area(43, 9));
		System.out.println("Area of rhombus:"+ rhombus.area(44.09f, 77.76f));
		
	}
}

