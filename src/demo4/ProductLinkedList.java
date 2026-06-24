package demo4;
import java.util.LinkedList;

public class ProductLinkedList {
	public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Keyboard");
        products.add("Mouse");
        
        System.out.println("Product List:");
        System.out.println(products);

        products.addFirst("Monitor");
        System.out.println("After adding Monitor at beginning:" + products);
        
        products.addLast("Printer");
        System.out.println("After adding Printer at end:" + products);
        
        products.removeFirst();
        System.out.println("After removing first product:" + products);
        
        products.removeLast();
        System.out.println("\nAfter removing last product:" + products);
        
        System.out.println("\nFinal Product List:" + products);

	}

}
