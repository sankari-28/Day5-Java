package demo4;
import java.util.LinkedList;

public class CustomerLinkedList {
	public static void main(String[] args) {
		 LinkedList<String> c = new LinkedList<>();
		    c.add("Aaaa");
	        c.add("Bbbb");
	        c.add("Cccc");
	        c.add("Dddd");
	        c.add("Eeee");
	        System.out.println("Customer List:" + c);
	        
	        c.addFirst("Aaaa");
	        System.out.println("After adding Ajay at first:" + c);
	        
	        c.addLast("Haaa");
	        System.out.println("After adding Hari at last:" + c);
	        
	        System.out.println("\nFirst Customer: " + c.getFirst());
	        
	        System.out.println("Last Customer: " + c.getLast());
	        
	        c.removeFirst();
	        System.out.println("\nAfter removing first customer:" + c);
	        
	        c.removeLast();
	        System.out.println("\nAfter removing last customer:" + c);
	        
	        System.out.println("\nIs Bala present? " + c.contains("Bbbb"));

	        System.out.println("Total Customers: " + c.size());
	        
	        System.out.println("\nFinal Customer List:" + c);
	}

}
