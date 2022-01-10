package access.modifier.p1;

public class N {
	protected long longvar = 987654L;
	public int intvar = 8765;
	double doublevar = 87.9809;

	private void privateMethod(){
		System.out.println("In a private method of class N");
	}
	
	void defaultMethod(){
		System.out.println("In a default method of class N");

	}
	
	protected void protectedMethod(){
		System.out.println("In a protected method of class N");

	}
	
	public void publicMethod(){
		System.out.println("In a public method of class N");

	}
}

