package w10;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) 
	{
		Set<String> fruits = new HashSet<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Orange");
		
		for(String s: fruits) {
			System.out.println(s);
		}
	}

}
