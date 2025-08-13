public class findVowelsAndConconent{
	public static void main(String[] args) {
		System.out.println("Count Total Consonent and Vowels in java");

		String name = "FaIZan AlaM$#785#@@";
		int countOfVowel = 0;
		int countOfConsonent = 0;
		for(int i=0;i<name.length();i++){
			if(Character.isLetter(name.charAt(i))){

				if(isVowel(name.charAt(i))){
					countOfVowel++;
				}
				else{
					countOfConsonent++;
				}

			}

		}

		System.out.println("Total Vowel Present in "+name+" are :- Vowels : "+countOfVowel+" | Consonent : "+countOfConsonent);
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