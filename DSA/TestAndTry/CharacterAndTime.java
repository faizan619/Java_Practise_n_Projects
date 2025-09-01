import java.time.*;
public class CharacterAndTime{


	public static void main(String[] args) {

		String name = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<name.length();i++) {
				System.out.print(name.charAt(i)+" - "+Character.getNumericValue(name.charAt(i)));
			if(Character.getNumericValue(name.charAt(i)) == 10) {
				System.out.print(" - it is Not Alphabet");
			}
			System.out.println();
		}	
	}


	public static void main1(String[] args) {
		System.out.println("Character and Time in Java");

		String name = "Faizanalam@#123`";
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i)+" ");
			if(Character.isUpperCase(name.charAt(i))){
				System.out.print(" - Its Upper Case");
			}
			else if(Character.isLowerCase(name.charAt(i))) {
				System.out.print(" - Its Lower Case");
			}
			else if(Character.isWhitespace(name.charAt(i))) {
				System.out.print(" - Its WhileSpace");
			}
			else if(Character.isDigit(name.charAt(i))) {
				System.out.print(" - Its Digit");
			}
			else if(Character.isSurrogate(name.charAt(i))) {
				System.out.print(" - Its Symbol");
			}
			else if(Character.isTitleCase(name.charAt(i))) {
				System.out.print(" - Is Title Case");
			}
			else if(Character.isAlphabetic(name.charAt(i))) {
				System.out.print(" - It is Alphabetic");
			}
			System.out.print(" - Numeric Value : "+Character.getNumericValue(name.charAt(i)));
			System.out.println();
		}
	}
}