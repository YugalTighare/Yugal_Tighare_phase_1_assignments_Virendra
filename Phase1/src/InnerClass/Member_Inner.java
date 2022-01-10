package InnerClass;

public class Member_Inner {
private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner{  		
	 private int data=20;
	  
	  void msg()
	  {
		  System.out.println("data is "+data);
	  }  
	  
	  // calling the duplicate method of the outer class
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }// inner class accessing the outside private variable
	 }  
	
	
	class Inner2{  		
		 //private int data=20;
		  
		  void msg2()
		  {
			  System.out.println("data is "+data);
		  }  
		  
		  // calling the duplicate method of the outer class
		  void display2(){
			  System.out.println("i am inside the inner2 class method");
		  }// inner class accessing the outside private variable
		 }  
	
	public static void main(String args[]){  
	  
	  Member_Inner obj=new Member_Inner();     // creating object of Outer class
	  Member_Inner.Inner in=obj.new Inner(); // creating object of Inner class
	  Member_Inner.Inner2 inn=obj.new Inner2();
	  inn.msg2();  
	  inn.display2(); 
	  in.display();
	  in.msg();
	  obj.display();
	 }  
	} 