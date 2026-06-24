package demo4;
import java.util.ArrayList;

public class EmployeeArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("xxx");
		list.add("yyy");
		list.add("zzz");
		list.add("vvv");
		list.add("rrr");
		list.add(1, "www");
		
		System.out.println("Employee names :");
		System.out.println(list);
		
		list.remove(4);
		System.out.println(list);
		
		System.out.println("If xxx is present in list or not :" + list.contains("xxx"));
		
		System.out.println("Index of www :" + list.indexOf("www"));
		
		System.out.println("After replacement : " + list.set(4, "vvv"));;
		
		System.out.println("Name in Index 2 :" + list.get(2));
		
		System.out.println("Is the list empty ?" + list.isEmpty());
		
		System.out.println("Total no of Employees :" + list.size());
		
		list.clear();
		System.out.print(list);
	}

}
