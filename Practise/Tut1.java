import java.util.Scanner;
// Variables in Java
public class Tut1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Loops in Java");
		System.out.print("Enter iterations value : ");
		int num1 = sc.nextInt();
		int a = 1;
		while(a<=num1){
			System.out.println("While : "+a);
			a++;
		}
		System.out.println("Plane Iteraiton ");
		for(int i=1;i<=num1;i++){
			System.out.println("loop : "+i);
		}

		System.out.println("Even Iterations");
		for(int i=1;i<=num1;i++){
			if(i%2==0){
				System.out.println("even :"+i);
			}
		}

		System.out.println("Odd Iterations");
		for(int i =1;i<=num1;i++){
			if(i%2!=0){
				System.out.println("Odd : "+i);
			}
		}

		System.out.println("Multiple of 3");
		for(int i =1;i<=num1;i++){
			if(i%3==0){
				System.out.println("3* : "+i);
			}
		}
		System.out.println("==========================================");
		int d=10;
		do{
			System.out.println("Do : "+d);
			d++;
		}while(d<num1);



	}

	public static void main3(String[] ab){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num1 Value : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Num2 Value : ");
		int num2 = sc.nextInt();


		System.out.println("Switch Cases in Java");
		switch (num1){
		case 10:
			System.out.println("The num1 value is 10");
			break;
		case 20:
			System.out.println("The Num1 value is 20");
			break;
		case 30:
			System.out.println("The num1 value is 30");
			break;
		default:
			System.out.println("The Num1 value is not defined!");
		}

		System.out.println("==============================================");
		System.out.println("If Else in Java");
		

		if(num1>num2){
			System.out.println("num1>num2");

			if(num1>=30 && num1<=60){
				System.out.println("It value is between 30 - 60");
			}
			else if (num1>60){
				System.out.println("It's Value is greater than 60");
			}
			else{
				System.out.println("It's value is smaller than 30");
			}
		}
		else if(num1==num2){
			System.out.println("num1 == num2");
		}
		else{
			System.out.println("num1<num2");

			if(num2>=30 && num2<=60){
				System.out.println("It value is between 30 - 60");
			}
			else if (num2>60){
				System.out.println("It's Value is greater than 60");
			}
			else{
				System.out.println("It's value is smaller than 30");
			}
		}
		System.out.println(num1==num2?"It is equal":"It is not equal");
	}

	public static void mai2(String[] aa){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num1 Value : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Num2 Value : ");
		int num2 = sc.nextInt();

		// Arithematic Operators
		System.out.println("================== Arithematic Operators");
		System.out.println("num1+num2 : "+(num1+num2));
		System.out.println("num1-num2 : "+(num1-num2));
		System.out.println("num1*num2 : "+(num1*num2));
		System.out.println("num1/num2 : "+(num1/num2));

		// Relational Operators
		System.out.println("================== Relational Operators");
		System.out.println("num1 == num2 : "+(num1==num2));
		System.out.println("num1 != num2 : "+(num1!=num2));
		System.out.println("num1 >= num2 : "+(num1>=num2));
		System.out.println("num1 <= num2 : "+(num1<=num2));

		// Logical Operators
		System.out.println("================== Logical Operators");
		if (num1!=0 && num2!=0){
			System.out.println("num1 && num2");
		}
		else if (num1!=0 || num2!=0){
			System.out.println("num1 || num2");
		}
	}

	public static void main1(String a[]){
		System.out.println("Practise 1");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		
		System.out.print("Enter your Name : ");
		String name = sc.next();
		
		System.out.print("Enter Your Salary : ");
		double salary = sc.nextDouble();

		char cc = 'F';



		System.out.println("Your Name is "+name+" and Age is "+age+" with salary of "+salary+" and has favourite char "+cc);

	}
}