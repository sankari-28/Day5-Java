package demo4;
import java.util.TreeSet;

public class EmployeeTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(105);
        ts.add(102);
        ts.add(109);
        ts.add(101);
        ts.add(103);
        ts.add(102);   

        System.out.println("Employee IDs:");
        for (int id : ts) {
            System.out.println(id);
        }
	}

}
