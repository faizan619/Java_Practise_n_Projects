import java.util.Scanner;
public class program1{
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		int num1 = S.nextInt();
		System.out.print("Enter Num2 : ");
		int num2 = S.nextInt();
		System.out.print("Enter Num3 : ");
		int num3 = S.nextInt();
		int sum = num1+num2+num3;
		System.out.println("The Total of All Three number is : "+sum);
	}
}