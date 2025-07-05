enum Laptop{
	Macbook(3000), XPS(2000), Surface, Thinkpad(4300);

	private int price;

	private Laptop(){
		
	}

	private Laptop(int price){
		this.price = price;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}
}

public class enum2{
	public static void main(String ag[]){
		System.out.println("Enum 2 in Java");

		Laptop lap = Laptop.Macbook;
		System.out.println(lap+" - "+lap.getPrice());

		// Laptop
		for(Laptop lap1: Laptop.values()){
			System.out.println(lap1+" : "+lap1.getPrice());
		}
	}
}