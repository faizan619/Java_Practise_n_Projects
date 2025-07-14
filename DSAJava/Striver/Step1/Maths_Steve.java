import java.util.Scanner;
public class Maths_Steve{
	public static int[] FindAllPrime(int num){
		boolean prime[] = new boolean[num+1];

		for(int i=0;i<=num;i++){
			prime[i] = true;
		}

		for(int k = 2;k*k<=num;k++){
			if(prime[k]){
				for(int i=k*k;i<=num;i+=k){
					prime[i] = false;
				}
			}
		}

		int count = 0;
		for(int i=2;i<=num;i++){
			if(prime[i]){
				count++;
			}
		}

		int res[] = new int[count];
		int index = 0;
		for(int i=2;i<=num;i++){
			if(prime[i]){
				res[index++] = i;
			}
		}
		return res;
	}

	public static boolean isPrime(int num){
		for(int i=2;i*i<num;i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		// For finding all the prime number 

		// int res[] = Maths_Steve.FindAllPrime(num);
		// System.out.print("All Prime Number between 0 to "+num+" : ");
		// for(int m:res){
		// 	System.out.print(m+" ");
		// }
		// System.out.println();

		// For finding is the number is prime or not
		boolean check = Maths_Steve.isPrime(num);
		if(check){
			System.out.println(num+" is a Prime Numeber");
		}
		else{
			System.out.println(num+" is not a Prime Number");
		}


	}
}