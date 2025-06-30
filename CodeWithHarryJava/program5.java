import java.util.Scanner;

public class program5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Integer Number : ");
		Integer num = sc.nextInt();

		if (num instanceof Integer){
			System.out.println("num is a integer");
		}
		else{
			System.out.println("it is not an integer");
		}
	}
}