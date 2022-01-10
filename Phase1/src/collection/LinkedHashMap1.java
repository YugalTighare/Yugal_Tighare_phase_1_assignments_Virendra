package collection;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

public static void main(String[] args) {
		
	LinkedHashMap<Integer, String> fruit = new LinkedHashMap<Integer, String>();
		
		fruit.put(1,"orange");
		fruit.put(3,"Grapes");
		fruit.put(2,"Banana");
		fruit.put(7,"mango");
		fruit.put(5,"chiku");
		fruit.put(4,"custard");
		fruit.put(9,"Watermelon");
		fruit.put(6,"Papaya");
		fruit.put(8,"Strawberry");
		fruit.put(10,"pomegranate");
		
		for (Integer key: fruit.keySet ()){
	        System.out.println("Contents of LinkedHashMap : " + fruit);
			System.out.println(key +": "+ fruit.get(key));
			System.out.println("\nRemove entry for key 4th : " + fruit.remove(4));
			System.out.println("\nRemove entry for key 7th : " + fruit.remove(7));
			System.out.println("LinkedHashMap contains banana ? : " + fruit.containsValue("Banana"));
			System.out.println("LinkedHashMap contains Apple ? : " + fruit.containsValue("Apple"));
			System.out.println("\nLinkedHashMap contains 4th as key? : " + fruit.containsKey(4));
			System.out.println("\nLinkedHashMap HashCode is:" + fruit.hashCode());
			
			fruit.clear();
		}
		
	}

}


