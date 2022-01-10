package string;

public class ImmutableString {

String t="Delhi";
String o="Mumbai";
String k="delhi";
String y= new String ("Mumbai");
String l= new String ("delhi");
String p= new String ("Hello");

public static void main(String[] args) {
	
	ImmutableString obj = new ImmutableString();
	System.out.println("o with l-> Equals: "+obj.o.equals(obj.l));
	System.out.println("y with p-> Equals: "+obj.y.equals(obj.p));
	System.out.println("t with o-> Equals: "+obj.t.equals(obj.o));
	System.out.println("k with y-> Equals: "+obj.k.equals(obj.y));
	System.out.println("p with y-> Equals: "+obj.p.equals(obj.y));
	System.out.print("o with l-> ==: ");
	System.out.println(obj.o == obj.l);
	System.out.print("y with p-> ==: ");
	System.out.println(obj.y ==obj.p);
	System.out.print("t with o-> ==: ");
	System.out.println(obj.t ==obj.o);
	System.out.print("k with y-> ==: ");
	System.out.println(obj.k ==obj.y);
	System.out.print("p with y-> ==: ");
	System.out.println(obj.p ==obj.y);
	
	
	
}
}

