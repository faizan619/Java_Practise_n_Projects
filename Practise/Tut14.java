class Tut14_A extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("Hii");
		}
	}
}

class Tut14_B extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("Hello");
		}
	}
}

public class Tut14{
	public static void main(String ag[]){
		System.out.println("Tutorial 14");

		Tut14_A obj1 = new Tut14_A();
		Tut14_B obj2 = new Tut14_B();

		obj1.setPriority(10);

		obj1.start();
		obj2.start();

		System.out.println(obj1.getPriority());

	}
}