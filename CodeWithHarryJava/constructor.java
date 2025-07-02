class Friends{
	public Friends(){
		System.out.println("Friends Object Created");
	}

	public void setMsg(){
		System.out.println("This is the Message for my Friends");
	}
}

class School{
	public String name;

	public School(){
		System.out.println("This is Default Constructor");
	}

	public School(String name){
		System.out.println("Single Value Constructor");
		this.name = name;

		if(this.name != null && !this.name.equals("")){
			System.out.println("Value of Name is Set ");
		}
		else{
			System.out.println("Value of Name is Not Set ");
		}
	}

	public School(String name,int age){
		System.out.println("name : "+name+" : "+age);
	}

	public void setName(String name){
		this.name = name;
	}

	public void tellName(){
		System.out.println("Name : "+name);
	}
}
public class constructor{
	public static void main(String ar[]){
		System.out.println("Constructor In Java");

		School scl1 = new School("faizan",55);
		School scl2 = new School();
		// scl1.setName("faizan");
		scl1.tellName();

		// Ananomous Object
		new Friends();
		new Friends().setMsg();
	}
}