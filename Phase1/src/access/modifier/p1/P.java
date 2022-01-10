package access.modifier.p1;


public class P {

	private void privateMethod(){
		System.out.println("In a private method of class P");
	}
	
	void defaultMethod(){
		System.out.println("In a default method of class P");

	}
	
	protected void protectedMethod(){
		System.out.println("In a protected method of class P");

	}
	
	public void publicMethod(){
		System.out.println("In a public method of class P");

	}
	public static void main(String [] args){
		M objM = new M();
		N objN = new N();
		System.out.println("long variable of class M: "+ objM.longvar);
		System.out.println("float variable of class M: "+objM.floatvar);
		
		System.out.println("long variable of class N: "+objN.longvar);
		System.out.println("int variable of class N: "+objN.intvar);
		System.out.println("double variable of class N: "+objN.doublevar);
	}
}
