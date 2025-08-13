public class numberOfVowel{
	public static void main(String[] args) {
		System.out.println("Find Number of Vowels in a String");

		String text = "faizan alam";
		int numOfVowel = 0;
		for(int i=0;i<text.length();i++){
			if(isVowel(text.charAt(i))){
				numOfVowel++;
			}
		}
		System.out.println("Total Number of Vowels Present are : "+numOfVowel);
	}

	public static Boolean isVowel(char cc){
		cc = Character.toLowerCase(cc);
		if(cc == 'a' || cc =='e' || cc == 'i' || cc == 'o' || cc == 'u'){
			return true;
		}
		else{
			return false;
		}
	}
}