import java.util.Scanner;
public class numberOfVowel {
    public static void main(String[] args) {
        System.out.println("Find Number of Vowels");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String text = sc.nextLine();
        int numberOfV = 0;
        for(int i=0;i<text.length();i++){
            if(isVowel(text.charAt(i))){
                numberOfV++;
            }
        }
        System.out.println("Total Number of Vowels in String are : "+numberOfV);
    }

    public static Boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u';
    }
}
