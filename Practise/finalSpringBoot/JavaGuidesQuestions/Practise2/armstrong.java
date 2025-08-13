import java.util.*;
public class armstrong{
	public static void main(String[] args) {
		System.out.println("ArmStrong Number");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		// System.out.println("Number : "+num);

		int numOfDigit = String.valueOf(num).length();

		int temp = num;
		int sum = 0;

		while(temp>0){

			int digit = temp % 10;
			sum += Math.pow(digit, numOfDigit);
			temp = temp / 10;
		
		}

		if(sum==num){
			System.out.println("It is a Armstrong Number!");
		}
		else{
			System.out.println("It is not a Armstrong Number");
		}

	}
}