package access.modifier.p2;
import access.modifier.p1.M;
import access.modifier.p1.N;

public class Y extends N{
	public static void main(String[] args) {
		M objM = new M();
		//objM.publicMethod();
		M.publicMethod();
		
		Y objY = new Y();
		objY.protectedMethod();
		objY.publicMethod();
		
		X objX = new X();
		System.out.println("long variable of class X: "+objX.longVar);
		System.out.println("float variable of class X:" + objX.floatVar);
		System.out.println("char variable of class X:" + objX.charVar);
	}

}
