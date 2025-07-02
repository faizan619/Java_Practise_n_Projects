class Mobile{
	String brand;
	int price;
	static String name;


	public void show(){
		System.out.println(brand+" : "+price+" : "+name);
	}


	public Mobile(){
		brand = "iphone";
		price = 24903;
		System.out.println("in Constructor");
	}


// This is a static block. it is used to load the static variable. and it is initiated onl once.
	static {
		name = "phone";
		System.out.println("Static block");
	}

}

public class staticblock{
	public static void main(String[] ar) throws ClassNotFoundException{
		// Mobile mb = new Mobile();
		// Mobile mb1 = new Mobile();

		Class.forName("Mobile");

	}
}