class Human{
	private int age ;
	private String name ;

	public Human(){
		System.out.println("This is Human Constructor");
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age,Human man){
		Human man1 = man;
		man1.age = age;
	}

	public void setAge1(int age){
		this.age = age;
	}
}

public class Encapsulation{
	public static void main(String ar[]){
		System.out.println("Encapsulation in Java");
		Human man = new Human();
		man.setName("faizan");
		man.setAge(22,man);
		man.setAge1(22);
		String name = man.getName();
		int age = man.getAge();
		System.out.println(name+" : "+age);

		Human man1 = new Human();

		man1.setName("Aneeza");
		man1.setAge(26,man1);
		man1.setAge1(26);
		String name1 = man1.getName();
		int age1 = man1.getAge();
		System.out.println(name1+" : "+age1);


	}
}