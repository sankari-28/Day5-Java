package demo4;
import java.util.LinkedHashSet;

public class StudentLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		
		hs.add("REG101");
        hs.add("REG102");
        hs.add("REG103");
        hs.add("REG104");
        hs.add("REG102"); 
        hs.add("REG105");
        hs.add("REG103"); 
        hs.add("REG106");
        
        System.out.println("Final Registration Numbers:" + hs);
	}

}
