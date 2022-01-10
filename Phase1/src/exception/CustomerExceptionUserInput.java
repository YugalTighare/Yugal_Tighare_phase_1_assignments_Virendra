package exception;

import java.util.Scanner;

public class CustomerExceptionUserInput {
	static void salary(int sal) throws salary{
		if(sal<2100){
			throw new salary("you need to work hard");
		}
		else if (sal>=2100 && sal<=5000){
			throw new salary("you salary is somehow good");
		}
		else if (sal>=5100 && sal<=9000)
		{
			throw new salary("Your salary is very good");
		}
		else
		{
			throw new salary("invalid input");
		}
	}
	public static void main(String[] args) {
		int result=0;
		   Scanner sc = new Scanner(System.in);  // taking user input from console
	       
	       System.out.println("Enter Salary : ");
	       int sal = sc.nextInt();
		
		try {
			salary(sal);
		}
		catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("Done");  
	}

}

class salary extends Exception{
	salary(String m) {
		super(m);
	}

}
