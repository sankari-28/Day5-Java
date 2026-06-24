package demo4;
import java.util.TreeSet;

public class MarkTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
        ts.add(85);
        ts.add(60);
        ts.add(95);
        ts.add(75);
        ts.add(90);
        ts.add(70);

        System.out.println("Marks in Ascending Order:" + ts);

        System.out.println("Marks in Descending Order:" + ts.descendingSet());

        System.out.println("First Mark: " + ts.first());

        System.out.println("Last Mark: " + ts.last());

        System.out.println("Does 75 exist? " + ts.contains(75));

        System.out.println("Marks less than 80:" + ts.headSet(80));

        System.out.println("\nMarks greater than or equal to 80:" + ts.tailSet(80));

        ts.remove(70);
        System.out.println("\nAfter removing 70:" + ts);

        System.out.println("\nTotal Marks: " + ts.size());
	}

}
