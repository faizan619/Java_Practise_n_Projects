@Deprecated
class A{
	public void showThisMessageinTerminal(){
		System.out.println("in A Show");
	}
}

class B extends A{

	// it checked is the method is implemented from super class. if yes it goes smooothly if no it shows error in runtime.
	@Override
	public void showThisMessageinTerminal(){
		System.out.println("in B Show");
	}
}

public class Anotations{
	public static void main(String a[]){
		B obj = new B();
		obj.showThisMessageinTerminal();
	}
}