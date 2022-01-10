package collection;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> fruit = new TreeMap<Integer, String>();
		
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
	        System.out.println("Contents of TreeMap : " + fruit);
			System.out.println(key +": "+ fruit.get(key));
			System.out.println("\nRemove entry for key 4th : " + fruit.remove(4));
			System.out.println("\nRemove entry for key 7th : " + fruit.remove(7));
			System.out.println("TreeMap contains banana ? : " + fruit.containsValue("Banana"));
			System.out.println("TreeMap contains Apple ? : " + fruit.containsValue("Apple"));
			System.out.println("\nTreeMap contains 4th as key? : " + fruit.containsKey(4));
			System.out.println("\nTreeMap HashCode is:" + fruit.hashCode());
			
			fruit.clear();
		}
		
	}

}
