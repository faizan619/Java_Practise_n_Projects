class A{
	public void show1(){
		System.out.println("In A Show");
	}
}

class B extends A{
	public void show2(){
		System.out.println("In B Show");
	}
}

public class Casting{
	public static void main(String ar[]){
		System.out.println("Casting in Java");

		// This Concept is called Type Casting
		double d = 4.5;
		int i = (int) d;
		System.out.println(i);


		// This Concept is Called UpCasting
		A obj = (A) new B();
		obj.show1();


		// This Concept is Called DownCasting
		B obj1 = (B) obj;
		obj1.show2();


		// Wrapper Class in Java

		int num = 7;
		Integer num1 = num;			// auto-boxing

		int num2 = num1;	// auto-unboxing

		System.out.println(num1);


		String str = "12";
		int num3 = Integer.parseInt(str);

		System.out.println(num3);
	}
}