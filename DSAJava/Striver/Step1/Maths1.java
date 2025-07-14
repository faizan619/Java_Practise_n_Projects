import java.util.Scanner;
public class Maths1{
	public static boolean isPrime(int num){
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}

	public static boolean allPrime(int num){
		for(int i=2;i<num;i++){

		}
	}

	public static void main(String[] args) {
		System.out.println("Finding Prime Number in java");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		System.out.println(num+" is a Prime Number ? "+Maths1.isPrime(num));
	}

	public static void main_count(String[] args) {
		System.out.println("Maths in Java");
		int num = 456956;
		int count = 0;

		int cnc = (int) (Math.log10(num)+1);

		// while(num>count){
		// 	count++;
		// 	num = num%10;
		// }
		// System.out.println("Count : "+count);
		System.out.println(cnc);

	}
}