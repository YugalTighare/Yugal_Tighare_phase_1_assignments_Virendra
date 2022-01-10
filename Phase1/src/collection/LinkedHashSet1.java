package collection;

import java.util.*;

class LinkedHashSet1{
	public static void main(String[] args){
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		//HashSet<String> hs=new HashSet<String>();
		
		hs.add("orange");
		hs.add("Grapes");
		hs.add("Banana");
		hs.add("mango");
		hs.add("chiku");
		hs.add("custard");
		hs.add("Watermelon");
		hs.add("Papaya");
		hs.add("Strawberry");
		hs.add("pomegranate");
				
		
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("Does hashset contains orange " + hs.contains("orange"));		
		System.out.println("is Fruits collection is empty or not  " + hs.isEmpty());
		System.out.println("remove two fruits "+hs.remove("chiku"));
		System.out.println("remove two fruits "+hs.remove("Banana"));
		System.out.println("Add 3 fruits more "+hs.remove("Grapes"));
		System.out.println("Add 3 fruits more "+hs.remove("custard"));
		System.out.println("Add 3 fruits more "+hs.remove("Papaya"));
		
		
	    hs.clear();
	    System.out.println("get class  " +hs.getClass());
		
	    System.out.println("is hashset empty  " +hs.isEmpty());
	    
	    
		
	}
}