package collection;
import java.util.Iterator;
import java.util.LinkedList;

	
public class LinkedList1 {
		public static void main(String[] args) 
		{
	    	
	        LinkedList<String> ll = new LinkedList<String>();
	        
	        ll.add("May");
	        ll.add("June");
	        ll.add("July");
	        ll.add("August");
	        ll.add(3,"April");
	        ll.add(10,"November");
	        //ll.add(a1);    // wrapping of primitive is done automatically to convert to Integer object
	                
	        ll.addLast("December");
	        ll.addFirst("January");
	        
	        ll.add(2,"March");
	        ll.add(1,"Febuary");
	        ll.add(8,"September");
	        ll.add(9,"October");
	        ll.remove(3);
	                 
	        Iterator<String> itr=ll.iterator();
	        while(itr.hasNext()) {
	        System.out.println("list is"+ itr.next());
	        }
	       
	        System.out.println(ll);
	        System.out.println("Size of the linked list: "+ll.size());
	        System.out.println("Is LinkedList empty? "+ll.isEmpty());
	        System.out.println("Does LinkedList contains 'September'? "+ll.contains("September"));

		}

	}


