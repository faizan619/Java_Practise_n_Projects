public class Recursion{

	public static int buyApple(int money){
		if(money<10){
			return 0;
		}
		else{
			return 1+buyApple(money-10);
		}
	}

	public static void N_to_one_	times(int N){
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

	public static void reverse_array2(int arr[],int n){
		int newarr[] = new int[n];
		for(int i=n-1;i>=0;i--){
			newarr[n-i-1] = arr[i];
		}
		printarr2(newarr,n);
	}

	public static void printarr2(int ar2[],int size){
		System.out.print("Reverse array : ");
		for(int i=0;i<size;i++){
			System.out.print(ar2[i]+" ");
		}
		System.out.println();
	}

	public static boolean isPalindrome(String content){
		int N = content.length();
		for(int i=0;i<N;i++){
			if(content.charAt(i) != content.charAt(N-i-1)) return false;
		}
		return true;
	}


	public static void main(String[] args) {
		System.out.println("Recursion in Java");

		// String name = "faizan";
		// System.out.println(name.charAt(name.length()-1));
		boolean res = isPalindrome("racecar");
		// boolean res = isPalindrome("faizan");
		if(res){
			System.out.println("It is a Palindrome");
		}
		else{
			System.out.println("It is not a Palindrome");
		}


		// String name = "faizan";
		// for(int i=0;i<name.length();i++){
		// 	System.out.print(name.charAt(i)+" ");
		// }
		// System.out.println();


		// int arr[] = {12,14,16,18,22,24,26,28,32,34,36,38,42,44,46,48};
		// reverse_array2(arr,arr.length);

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