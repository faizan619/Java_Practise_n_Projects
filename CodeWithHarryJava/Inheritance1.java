class A{
	public A(){
		super();
		System.out.println("Default A Constructor");
	}
	public A(int num){
		super();
		System.out.println("Parametrized A Constructor");
	}
}

// Super keyword execute the constructor of parent class
// this keyword execute the constructor of the same class
class B extends A{
	public B(){
		super(5);
		System.out.println("Default B Constructor");
	}
	public B(int num){
		this();
		// super(num);
		System.out.println("Parametrized B Constructor");
	}
}

class C{
	public void show(){
		System.out.println("in C Show");
	}
	public void config(){
		System.out.println("in C Config");
	}
}

class D extends C{
	public void show(){
		System.out.println("in D Show");
	}
}

class Inheritance1{
	public static void main(String[] ag){
		System.out.println("Inheritance1 in Java");
		B o1 = new B(10);

		D d1 = new D();
		d1.show();
		d1.config();

	}
}