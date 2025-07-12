import java.util.*;

public class JC2{
	public static void main(String[] args) {
		System.out.println("Java Collection");

		// List<String> lis1 = new ArrayList<>();
		// List<String> lis1 = new Vector<>();
		List<String> lis1 = new Stack<>();
		lis1.add("mango");
		lis1.add("grapes");
		lis1.add("apple");
		lis1.add("papaya");
		System.out.println(lis1);

		System.out.println("element at index 1 : "+lis1.get(1));
		System.out.println("Other Search : "+lis1.indexOf("apple"));

		System.out.println("Updating element at index 1 : "+lis1.set(1,"pineapple"));
		System.out.println("Updated element : "+lis1);

		System.out.println("Contains : "+lis1.contains("papaya"));

		// lis1.remove("pineapple");
		lis1.remove(0);
		System.out.println(lis1);




	}
}