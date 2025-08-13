public class removeAllWhiteSpaceFromSentence{
	public static void main(String[] args) {
		System.out.println("Remove All the White Space from the Sentence!");

		String sentence = "Hello Welcome to the World of programming Language Java!";
		sentence = sentence.replace(" ","");
		System.out.println(sentence);
	}
}