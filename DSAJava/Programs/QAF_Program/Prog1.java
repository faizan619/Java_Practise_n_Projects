class Record{
	int num = 0;
	String allTopics[] = new String[100];
	public void topic(String title){
		allTopics[num] = title;
		num++;
		System.out.println();
		System.out.println("------------------- [ "+num+" ] - "+title+"-------------------");
	}

	public void getResult(){
		System.out.println("Total Topic Learn : "+num);
		for(String name:allTopics){
			if(name!= null){
				System.out.println("Topic : "+name);
			}
		}
	}
}

public class Prog1{
	public static void main(String[] args) {
		System.out.println("Program to Swap two Number With and Without using third Variable.");
		Record line = new Record();

		line.topic("Swaping using Third Variable");
		int a1 = 43;
		int a2 = 54;

		System.out.println("Before : Value of A1 : A2 = "+a1+" : "+a2);
		int swap = 0;
		swap = a1;
		a1 = a2;
		a2 = swap;
		System.out.println("After : Value of A1 :A2 = "+a1+" : "+a2);


		line.topic("Swaping without using Third Variable");
		int a3 = 37;
		int a4 = 75;

		System.out.println("Before : Value of A3 : A4 = "+a3+" :"+a4);
		a3 = a3+a4;
		a4 = a3-a4;
		a3 = a3-a4;
		System.out.println("After : Value of A3 : A4 = "+a3+" : "+a4);


		line.topic("Swaping without using Third Variable and Arithmetic Operator");
		int a5 = 6;
		int a6 = 9;

		System.out.println("Before : Value of A5 : A6 = "+a5+" :"+a6);
		a5 = a5^a6;
		a6 = a5^a6;
		a5 = a5^a6;
		System.out.println("After : Value of A5 : A6 = "+a5+" : "+a6);

		line.topic("Check is Number is Even or odd");
		int a7 = 53;
		if(a7%2==0){ System.out.println(a7+" is a Even Number."); }
		else{ System.out.println(a7+" is a Odd Number");}

		line.topic("Check is the Number is prime number or Not");
		int a8 = 23;
		boolean cc = false;
		for(int i=2;i<a8/2;i++){
			if(a8%i!=0){ cc = true; }
		}
		if(cc){ System.out.println(a8+" is a  Prime Number");}
		else{System.out.println(a8+" is not a Prime Number");}


		line.topic("Find the Factorial Of Number");
		int a9 = 3;
		System.out.println(a9+" factorial is : "+factorial(a9));

		line.topic("Find the Fibonacci series");
		int a10 = 10;
		int arr[] = fibonacci(a10);
		System.out.println("Fibonacci Series Upto "+a10);
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();

		line.topic("find the Armstrong Number");
		int a11 = 153, result = 0,rem;
		int temp = a11;
		while(a11>0){
			rem = a11%10;						// 153 % 10 = 3,	15/10 = 5,	 1%10 = 1
			a11 = a11/10;						// 153 / 10 = 15,	15/10 = 1,	 1/10 = 0
			result = result+(rem*rem*rem);		// 0+(3*3*3),		27+(5*5*5),	 152+(1*1*1) = 153
		}
		if(result == temp){ System.out.println(temp+" is a armstrong number");}
		else{ System.out.println(temp+" is not a Armstrong number");}

		line.topic("Find Duplication Element in Aray");
		System.out.println("Duplication Numbers are : ");
		int arr1[] = {3,5,2,3,7,4,5,4,2,9,6,4};
		for(int i=0;i<arr1.length;i++){
			for(int j=i+1;j<arr1.length;j++){
				if(arr1[i] == arr1[j]){
					System.out.print(arr1[j]+" , ");
				}
			}
		}
		System.out.println();

		line.topic("Reverse an Array");
		int arr2[] = {2,4,6,8,10};
		for(int i=arr2.length-1;i>=0;i--){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();

		line.topic("Count Total Number of Characters");
		String name = "faizan";
		int len1 = name.length();
		System.out.println(len1);

		line.topic("Program to reverse a String");

		String str1 = "faizan";
		// Manual way
		for(int i=str1.length()-1;i>=0;i--){
			System.out.print(str1.charAt(i)+" ");
		}
		System.out.println();

		// String Function
		StringBuilder sb = new StringBuilder(str1);
		sb.reverse();
		System.out.println(sb);
	}





	public static int factorial(int n){
		if(n<=0){ return 1;}
		return n*factorial(n-1);
	}

	public static int[] fibonacci(int n){
		int a = 0;
		int b = 1;
		int arr[] = new int[n];
		arr[0] = a;
		arr[1] = b;
		for(int i=2;i<n;i++){
			arr[i] = a+b;
			a = b;
			b = arr[i];
		}
		return arr;
	}
}