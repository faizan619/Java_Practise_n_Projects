import java.util.Scanner;
public class tutorial1{
	public static void main(String a[]){
		int num = 43;
		// (n%2==0) ? System.out.println("it is even");:System.out.println("it is odd");
		System.out.println((num%2==0)?"It is Even Number":"it is odd number");
	}

	public static void main8(String args[]){
		int num = 10;
		int j = 0;

		while (j <= num){
			System.out.println("New Value : "+j);
			j++;
		}

		do{
			System.out.println("No Val : "+j+"---"+num);
			j++;
		}while(j<num);
		// For Loop
		for(int i =0;i<num;i++){
			System.out.println("Value : "+i);
		}
	}

	public static void main7(String args[]){
		int num1 = 40;
		int num2 = 70;

		for(int i=0;i<=num1;i++){

			if (i == 30){
				System.out.println("This is thirty");
				continue;
			}
			
			if( i % 2 == 0){
				System.out.println("Even");
				continue;
			}

			System.out.println("Value of i :"+i);
		}

		switch(num1){
			case 10:
				System.out.println("Value is 10");
				break;
			case 30:
				System.out.println("Value is 30");
				break;
			case 50:
				System.out.println("Value is 50");
				break;
			case 70:
				System.out.println("Value is 70");
				break;
			case 90:
				System.out.println("Value is 90");
				break;
			default:
				System.out.println("No Value Found!");
				break;

		}
		// if(num1 > num2){
		// 	System.out.println("Num1 is greater than num2");
		// }
		// else if(num1 == num2){
		// 	System.out.println("Num2 is equal to num1");
		// }
		// else{
		// 	System.out.println("Num2 is greater to than num1");
		// }
	}

	public static String admin = "Faizan Alam";

	public static void main6(String args[]){
		System.out.println("Name of Admin : "+tutorial1.admin);
		int ag = 14;
		System.out.println("Age : "+ag);

		ag = 20;
		System.out.println("Age : "+ag);

		final int aa = 22;
		System.out.println("Age : "+aa);

		// aa = 43;				// final keywords act like constant. cannot redeclare the values there.
		// System.out.println("Age : "+aa);

	}

	public static void main5(String args[]){
		// Single Line Comment
		/*
			this 
			is
			multi
			line 
			comment

{@hello}
		*/
		System.out.println("hello World");
	}

	public static void main4(String args[]){
		int num = 56;
		System.out.printf("%d",num);
		// %d  -> for int
		// %f  -> for float
		// %c -> for char
		// %s  -> for string
		String name;
		name = new String("Faizan");
		System.out.printf("%s",name);
		System.out.println("Length : "+name.length());
		System.out.println("Lower : "+name.toLowerCase());
		System.out.println("Upper : "+name.toUpperCase());
	}

	public static void main3(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Num2 : ");
		int num2 = sc.nextInt();
		if(num1==num2){
			System.out.println("Both Value is Equal");
		}
		else if(num1>num2){
			System.out.println("Num1 value is greater than num2");
		}
		else{
			System.out.println("Num2 value is greater than num1");
		}

		if(num1 != 0 || num2 != 0){
			System.out.println("Atleast One Value is Available");
		}
		else if(num1 != 0 && num2 != 0){
			System.out.println("Both Value is present");
		}
		else{
			System.out.println("No Value is Present");
		}

	}


	public static void main2(String args[]){
		System.out.println("Hello");
		char A = 'B';
		A++;
		A++;
		System.out.println(A);
	}

	public static void main1(String args[]){
		Scanner S = new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		int num1 = S.nextInt();
		System.out.print("Enter Num2 : ");
		int num2 = S.nextInt();
		System.out.print("Enter Num3 : ");
		int num3 = S.nextInt();
		int sum = num1+num2+num3;
		System.out.println("The Total of Three Number is : "+sum);
	}
}