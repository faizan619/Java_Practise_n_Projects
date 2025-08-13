import java.util.*;

public class removeDuplicateWordFromSentence{
	public static void main(String[] args) {
		System.out.println("Remove Duplicate Words From Sentence in Java");

		String sentence = "Hello Faizan Hello World Faizan Bhai";
		String words[] = sentence.split(" ");

		Set<String> newWord = new HashSet<>();
		
		for(String word :  words){
			// System.out.println(word);
			newWord.add(word);
		}

		String result = String.join(" ",newWord);
		System.out.println("Result : "+result);
	}
}