// Inheritance is used to avoid redunduncy and avoid repeating the same code

// In Java multiple inheritance is not supported.
class Calculator{
	public int sum(int n1,int n2){
		return n1+n2;
	}
	public int sub(int n1,int n2){
		return n1-n2;
	}
}

class AdvCalc extends Calculator{
	public int mul(int n1,int n2){
		return n1*n2;
	}
	public int div(int n1,int n2){
		return n1/n2;
	}
}

class SciCalc extends AdvCalc{
	public int radiusOfCircle(int r){
		return r*r;
	}
}

public class Inheritance{
	public static void main(String ar[]){
		System.out.println("Inheritance In Java");
		AdvCalc ad1 = new AdvCalc();
		int res1 = ad1.sum(10,20);
		System.out.println("Sum : "+res1);
		int res2 = ad1.mul(10,10);
		System.out.println("Mul : "+res2);

		SciCalc sc1 = new SciCalc();
		int res3 = sc1.sum(40,60);
		System.out.println("res 3 : "+res3);


	}
}