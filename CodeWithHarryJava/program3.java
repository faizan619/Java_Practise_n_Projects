import java.util.Scanner;
public class program3{
	public static void main(String args[]){
		// WAP to greet user with their Name
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name : ");
		String name = sc.nextLine();
		System.out.println("Welcome to Java programming mr/ms : "+name);
	}
}