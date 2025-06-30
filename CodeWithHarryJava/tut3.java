class Calculator{

	// int a = 89;

	public int add(int num1,int num2){
		// System.out.println("Add");
		// return a;

		int re = num1+num2;
		return re;
	}
}

public class tut3{
	public static void main(String a[]){
		Calculator s1 = new Calculator();
		int n1 = 10;
		int n2 = 50;
		int res = s1.add(n1,n2);
		System.out.println(res);
		// System.out.println("Classes in Java");
	}
}