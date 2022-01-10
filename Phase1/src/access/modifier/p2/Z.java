package access.modifier.p2;

import access.modifier.p1.M;
import access.modifier.p1.N;
import access.modifier.p1.P;

public class Z extends M {

	public static void main(String[] args) {
		Z objZ = new Z();
		objZ.protectedMethod();
		objZ.publicMethod();
		
		N objN = new N();
		objN.publicMethod();
		
		P objP = new P();
		objP.publicMethod();
		
		X objX = new X();
		System.out.println("long variable of class X: " +objX.longVar);
		System.out.println("float variable of class X:" + objX.floatVar);
		System.out.println("char variable of class X:" + objX.charVar);
		
	}
}

