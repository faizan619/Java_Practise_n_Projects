
import java.util.Scanner;

public class changeToLower {
    public static void main(String[] args) {
        System.out.println("Change It to Lower case");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String text = sc.nextLine();
        System.out.println("Your Text : "+text);

        String lchanges = changeLower(text);
        System.out.println("Lower Changes : "+lchanges);

        String uchanges = changeUpper(text);
        System.out.println("Upper Changes : "+uchanges);
    }

    public static String changeLower(String text){
        return text.toLowerCase();
    }

    public static String changeUpper(String text){
        return text.toUpperCase();
    }
}
