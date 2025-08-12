import java.util.*;
public class removeDuplicateWords{
	public static void main(String[] args) {
		System.out.println("Remove duplicate Words");

		String sentence = "faizan alam sajjad alam";
		String word[] = sentence.split(" ");

		Set<String> unique = new LinkedHashSet<>();
		for(String m:word){
			unique.add(m);
		}

		String result = String.join(" ",unique);
		System.out.println("Result : "+result);
	}
}