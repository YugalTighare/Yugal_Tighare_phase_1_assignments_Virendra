package exception;

public class CustomerException {
	static void performance(int salary)throws PerformanceException{
		if (salary<2100)
			throw new  PerformanceException("you need to work hard");
		else if (salary>=2100 && salary<=5000)
			throw new  PerformanceException("Your salary is somehow good");
		else if (salary>=5100 && salary<=9000)
			throw new  PerformanceException("Your salary is very good");
		else
			System.out.println("Impressive");
	}
	public static void main(String[] args) {
		try {
			performance(7800);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+ e.getMessage());
		}
	}

}
class  PerformanceException extends Exception{
	 PerformanceException(String e){
		 super(e);
	 }
}