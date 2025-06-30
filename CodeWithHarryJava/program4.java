import java.util.Scanner;
public class program4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Kilometer : ");
		double km = sc.nextDouble();
		double meter = km*1000;
		System.out.println(km+" kilometer is equal to "+meter+" meter");
	}
}