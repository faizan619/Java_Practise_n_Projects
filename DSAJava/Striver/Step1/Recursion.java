public class Recursion{

	public static int buyApple(int money){
		if(money<10){
			return 0;
		}
		else{
			return 1+buyApple(money-10);
		}
	}

	public static void N_to_one_times(int N){
		if(N<=0){
			return;
		}
		else{
			System.out.println("Number : "+N);
			N_to_one_times(N-1);
		}
	}

	public static void one_to_N_times(int i,int N){
		if(i>N){return;}
		else{
			// ("Num : "+i);
			System.out.println("Num :"+i);
			one_to_N_times(i+1,N);
		}
	}

	public static int sum_of_n_num(int num){
		if(num<=0){return 0;}
		else{
			return num+sum_of_n_num(num-1);
		}
	}

	public static int isFactorial(int num){
		if(num<=1){return 1;}
		else{	return num* isFactorial(num-1);	}
	}

	public static void printArray(int newarr[],int n){
		System.out.println("Reversed Array : ");
		for(int i=0;i<n;i++){
			System.out.print(newarr[i]+" ");
		}
		System.out.println();
	}

	public static void reverseArray(int arr[],int size){
		int newarr[] = new int[size];
		for(int i=size-1;i>=0;i--){
			newarr[size-i-1] = arr[i];
		}
		printArray(newarr,size);
	}

	public static void main(String[] args) {
		System.out.println("Recursion in Java");


		// finobacci(5);
		// int n =5;
		// if(n==0){
		// 	System.out.println(0);
		// }
		// int fib[] = new int[n+1];
		// fib[0] = 0;
		// fib[1] = 1;
		// for(int i=2;i<=n;i++){
		// 	fib[i] = fib[i-1] + fib[i-2];
		// }
		// System.out.println("Fibonacci Series upto "+n+" : ");
		// for(int m:fib){
		// 	System.out.print(m);
		// }
		// System.out.println();

		// int arr[] = {12,14,16,18,22,24,26,28,32,34,36,38,42,44,46,48};
		// reverseArray(arr,arr.length);

		// int num = 5;
		// System.out.println("Factorial of "+num+" is "+" : "+isFactorial(num));


		// int num = 9;
		// int res1 = sum_of_n_num(num);
		// System.out.println("Sum of "+num+" natural number : "+res1);

		// one_to_N_times(1,8);

		// N_to_one_times(10);

		// int totalApple = buyApple(56);
		// System.out.println("Total Apple Bought : "+totalApple);
	}
}