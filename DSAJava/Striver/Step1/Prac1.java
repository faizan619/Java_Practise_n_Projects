package Step1;
import base.Record;

import java.util.Scanner;



public class Prac1{
	public static void main(String ag[]){
		Record line = new Record();
		line.topic("User Input/ Output in Java");
		Scanner sc = new Scanner(System.in);

		// System.out.print("Enter your Name : ");
		// String name = sc.nextLine();
		// System.out.print("Enter your Age : ");
		// int age = sc.nextInt();
		// System.out.println("Welcome to Mr/Ms "+name+" : "+age);

		line.topic("Data Type in Java");

		// byte num = 100;		// store data from -128 to 127
		// System.out.println("Byte : "+num);

		// short num1 = 32766;	// store data from -32767 to 32767
		// System.out.println("Short : "+num1);

		// // same as int and long which store somewhat larger numbers...

		// float num2 = 5.3243f;
		// System.out.println("Float : "+num2);

		// double num3 = 5.324344433;
		// System.out.println("Double : "+num3);

		// boolean isLegal = true;
		// System.out.println("Boolean : "+isLegal);

		// char fav = 'A';
		// System.out.println("Character : "+fav);

		// String name = "Faizan Alam Sajjad";
		// System.out.println("String : "+name);

		line.topic("If Else Statement in Java");
		// System.out.print("Enter your Age : ");
		// int num1 = sc.nextInt();

		// if(num1>18){
		// 	System.out.println("You are Eligible for Voting");
		// }
		// else if(num1==18){
		// 	System.out.println("You Recently got Eligble for Voting");
		// }
		// else{
		// 	System.out.println("You are not Eligible for Voting");
		// }

		line.topic("Switch Case in Java");
		// System.out.print("Enter your Age : ");
		// int num1 = sc.nextInt();
		// switch(num1){
		// 	case 17:
		// 		System.out.println("Your age is 17");
		// 		break;
		// 	case 18:
		// 		System.out.println("Your age is 18");
		// 		break;
		// 	case 19:
		// 		System.out.println("Your age is 19");
		// 		break;
		// 	default:
		// 		System.out.println("You doesn't fall in 17, 18, 19 age criteria");
		// }

		line.topic("For loop & Enhanced For Loop in Java");

		// System.out.print("Enter Total Iterations : ");
		// int num1 = sc.nextInt();
		// for(int i=0;i<num1;i++){
		// 	System.out.println("iteration : "+(i+1));
		// }

		// int nums[] = {10,13,15,17,19,22,24,26,28,31,33,35,37,39};
		// for(int n:nums){
		// 	System.out.println("Value : "+n);
		// }

		line.topic("While Loop in Java");
		// System.out.print("Enter Start Iterations( <20 ) : ");
		// int num1 = sc.nextInt();

		// while(num1<20){
		// 	System.out.println("Num1 : "+num1);
		// 	num1 = num1+1;
		// }

		// do{
		// 	System.out.println("Do Num : "+num1);
		// 	num1++;
		// }while(num1<=21);

		line.topic("String in Java");
		// String name = "faIzAn aLaM";
		// System.out.println("Name : "+name);
		// System.out.println("Name length : "+name.length());
		// System.out.println("Name Lowercase : "+name.toLowerCase());
		// System.out.println("Name Uppercase : "+name.toUpperCase());
		// System.out.println("Name SubString : "+name.substring(5));
		// System.out.println("Name SubString : "+name.substring(3,8));
		// System.out.println("Name Replace : "+name.replace("alam","shaikh"));
		// System.out.println("Name Start with H? : "+name.startsWith("H"));
		// System.out.println("Name Ends With M? : "+name.endsWith("M"));
		// System.out.println("Equals : "+name.equals("faizan alam"));
		// System.out.println("Ignore Cases : "+name.equalsIgnoreCase("faizan alam"));

		line.topic("Methods in Java");

		Prac1 obj = new Prac1();
		// obj.greet(line);

		line.topic("Arrays in Java");

		// String fruits[] = {"mango","apple","pineapple","grapes","orange","litchy","strawberry","carrot"};
		// int nums[] = new int[5];
		// nums[0] = 55;
		// nums[1] = 43;
		// nums[2] = 90;
		// nums[3] = 25;
		// nums[4] = 59;

		// for(int n:nums){
		// 	System.out.println("num : "+n);
		// }

		line.getResult();

	}

	public void greet(Record line1){
		line1.topic("Passing Obj inside Method");
		System.out.println("hello");
	}
}