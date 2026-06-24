package demo4;
import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("xxx");
		list.add("yyy");
		list.add("zzz");
		list.add("jjj");
		list.add("vvv");
		
		System.out.println(" Student Details :");
		System.out.println(list);
		
		list.add("xxx");
		list.add(null);
		System.out.println("After adding null and duplicate :");
		System.out.println(list);
		
		System.out.println("Students size :" + list.size());
	}

}
