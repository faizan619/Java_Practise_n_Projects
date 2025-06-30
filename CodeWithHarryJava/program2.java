import java.util.Scanner;
public class program2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Subject 1 Marks : ");
		double sub1 = sc.nextDouble();
		System.out.print("Enter Subject 2 Marks : ");
		double sub2 = sc.nextDouble();
		System.out.print("Enter Subject 3 Marks : ");
		double sub3 = sc.nextDouble();
		System.out.print("Enter Subject 4 Marks : ");
		double sub4 = sc.nextDouble();
		System.out.print("Enter Subject 5 Marks : ");
		double sub5 = sc.nextDouble();

		double sum = sub1+sub2+sub3+sub4+sub5;
		double result  = sum*100/500;
		
		System.out.println("Percentage of 5 Subject : "+result);

	}
}