package program.data.type;

public class DataTypeProgram {

	public static void main(String[] args) {
		boolean status = true;
		System.out.println("I am printing status" +  status);
		char gender = 'M';
		System.out.println("I am printing status" + gender);
		int age = 45;
		System.out.println("I am printing status" + age);
		long distance = 638736363838L;
		System.out.println("I am printing status" + distance);
		float percentage = 56.85f;
		System.out.println("I am printing status" + percentage);
		double pi = 3.1487657557444;
		System.out.println("I am printing status" + pi);
		
		int i = 100;
		long l = i;
		System.out.println("long value"+ l);
		
		int o = (int) l;
		System.out.println("int value "+o);
		
		char t= (char) i;
		System.out.println("char value "+t);
		
		double d = 14536789789.567899009098765;
		float r= (float) d;
		System.out.println("float value "+ r);
		System.out.println("double value " +d);
		
		double d2 = 56789087654.0987658765;
		long l2 = (long)d2;
		int i2 = (int)l2;
		System.out.println("Double value "+ d2);
		System.out.println("Long value "+ l2);
		System.out.println("Int value "+i2);
		
		float f = l;
		System.out.println("Float value"+ f);
		
		byte b;
		int i1 = 257;
		double dd = 323.142;
		System.out.println("conversion of int to byte.");
		b = (byte)i1;
		System.out.println("i1 = " + i1 + "b = " + b);
		
		b = (byte) dd;
		System.out.println("dd =" + dd + "b= " + b);
		
	}

}
