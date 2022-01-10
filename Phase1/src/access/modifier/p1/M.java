package access.modifier.p1;

public class M {
	private int intvar = 57;
	long longvar = 98765;
	protected float floatvar = 876.9876f;
	
	private void privateMethod(){
		System.out.println("In a private method of class M");
	}
	
	void defaultMethod(){
		System.out.println("In a default method of class M");

	}
	
	protected void protectedMethod(){
		System.out.println("In a protected method of class M");

	}
	
	public static void publicMethod(){
		System.out.println("In a public method of class M");

	}
}

