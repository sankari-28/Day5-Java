package demo4;
import java.util.Vector;

public class BankTransactionVector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("TN101");
        v.add("TN102");
        v.add("TN103");
        v.add("TN104");
        v.add("TN105");
        v.add("TN103");
        System.out.println("Transaction ID :" + v);
        System.out.println("Vector size : " + v.size());
        System.out.println("Is TXN1002 exist ? " + v.contains("TXN1002"));
		
	}

}
