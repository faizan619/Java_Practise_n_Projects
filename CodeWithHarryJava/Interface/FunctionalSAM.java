@FunctionalInterface
interface A{
	void show(int i);
}

// class B implements A{
// 	public void show(){
// 		System.out.println("in B Show");
// 	}
// }

@FunctionalInterface
interface B{
	int add(int n1,int n2);
}

public class FunctionalSAM{
	// functional interface is also know as single Abstract method(SAM) it has only one method.
	public static void main(String a[]){
		System.out.println("Functional Interface in Java");

		// A obj = new B();

		// A obj = new A(){
			// public void show(int i){

		// Given below is an example of lambda expression. it works only with functional interface.
		A obj = (i) -> System.out.println("in A Show : "+i);
		obj.show(55);

		/*B ss = new B(){
			public int add(int i,int j){
				return i+j;
			}
		};*/

		B ss = (i,j) -> i+j;

		int result = ss.add(20,30);
		System.out.println("result : "+result);

	}
}