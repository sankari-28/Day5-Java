package demo4;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }
}

public class StudentTreeSet {
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student(103, "Ravi", 78));
        ts.add(new Student(101, "Arul", 85));
        ts.add(new Student(105, "Kumar", 92));
        ts.add(new Student(102, "Priya", 90));
        ts.add(new Student(104, "Divya", 88));

        System.out.println("Student Details (Sorted by Roll Number):");

        for (Student s : ts) {
            System.out.println("Roll No: " + s.rollNo +
                               ", Name: " + s.name +
                               ", Mark: " + s.mark);
        }
    }
}