import java.util.Scanner;
import java.lang.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        int numberOfDigits = String.valueOf(number).length();
        
        int sum = 0;
        int temp = number;
        while(temp>0){
            int digit = temp%10;
            sum += Math.pow(digit,numberOfDigits);
            temp /= 10;
        }

        if(sum == number){
            System.out.println("it is a armstrong number");
        }
        else{
            System.out.println("it is not a armstrong number");
        }

    }
}
