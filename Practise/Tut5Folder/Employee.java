package Tut5Folder;
public class Employee{
	public String name;
	public int rollno;

	private int age;
	private String username;

	public void setAge(int age){
		this.age = age;
	}

	public void getAge(){
		if(age != 0){
			System.out.println("Employee Age is "+age);	
		}
		else{
			System.out.println("No Age is Set");
		}
	}

	public void setUsername(String username){
		this.username = username;
	}	

	public void getUsername(){
		if(username != null){
			System.out.println("Employee Username is : "+this.username);
		}
		else{
			System.out.println("No Username is Set");
		}
	}

	public void show(){
		System.out.println("-------------------");
		System.out.println(name+" : "+rollno);
	}

	public Employee(){
		System.out.println("-------------------");
		System.out.println("This is Default Employee Constructor");
	}

	public Employee(double salary){
		System.out.println("-------------------");
		System.out.println("This is Parametrized Constructor with Salary : "+salary);
	}

	public void test(){
		System.out.println("-------------------");
		System.out.println("This is Testing Method");
	}
}