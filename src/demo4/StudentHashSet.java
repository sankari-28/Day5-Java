package demo4;
import java.util.HashSet;

public class StudentHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(101);
        hs.add(102);
        hs.add(103);
        hs.add(101);
        hs.add(104);
        hs.add(102);
        
        System.out.println("Final Roll Numbers are :" + hs);
	}

}
