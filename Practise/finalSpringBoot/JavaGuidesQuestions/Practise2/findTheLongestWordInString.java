public class findTheLongestWordInString{
	public static void main(String[] args) {
		System.out.println("Find the Longest Word in a String");

		String sentence = "Welcome to the world of Programming Lang";

		String words[] = sentence.split(" ");
		int longestWordint = 0;
		String longestWord = "";
		for(String mm:words){
			if(mm.length() > longestWordint){
				longestWordint = mm.length();
				longestWord = mm;
			}
		}
		System.out.println("Longest Word is : "+longestWord+" with length : "+longestWordint);
	}
}