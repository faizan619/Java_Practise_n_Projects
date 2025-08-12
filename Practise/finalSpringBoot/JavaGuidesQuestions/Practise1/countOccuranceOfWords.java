import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class countOccuranceOfWords{
	public static void main(String[] args) {
		System.out.println("Count Occurance of Words");

		// System.out.print("Enter your Words : ");
		Scanner sc = new Scanner(System.in);
		// String words = sc.nextLine();
		String words = "FaiZAN ALAm SAJJad ALAM SHAIKH";

		String word[] = words.split(" ");

		Map<String,Integer> wordCountMap = new HashMap<>();
		for(String m:word){
			m = m.toLowerCase();
			wordCountMap.put(m, wordCountMap.getOrDefault(m,0)+1);
			// System.out.println(m);
		}
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}
}