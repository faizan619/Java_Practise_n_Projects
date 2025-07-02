class Student{
	private String name;
	public Student(){
		System.out.println("This is Student Constructor");
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}

class School{
	String name = null;
	static String talent;

	static{
		talent = "Coding";
		System.out.println("This is Static BLock");
	}

	public School(){
		System.out.println("Default Constructor");
		System.out.println("talent : "+this.talent);
	}

	public School(String name){
		System.out.println("talent : "+this.talent);
		this.name = name;
		if (this.name != null){
			System.out.println("School Name is Set to "+this.name);
		}
		else{
			System.out.println("School Name is Not Set");
		}	
	}

	public School(Student std1){
		std1.setName("juljula");
		this.name = std1.getName();

		// std1 = new Student();
		System.out.println("talent : "+this.talent);
		System.out.println("School Student Name : "+this.name+" - "+std1.getName());

	}

	public String getSchoolName(){
		return name;
	}

	public void setSchoolName(String name){
		this.name = name;
	}
}
public class Tut4{
	public static void main(String ar[]){
		System.out.println("Practise 4 in Java");

		// Creating Obj of School
		School scl1 = new School();
		School scl2 = new School("baneghar");

		// Setting The name 
		scl2.setSchoolName("Anjuman");
		scl1.setSchoolName("Royal");

		// Getting the School Name
		String school1 = scl1.getSchoolName();
		String school2 = scl2.getSchoolName();

		// printing the School name
		System.out.println("School1 name : "+school1);
		System.out.println("School2 name : "+school2);

		System.out.println("================================");
		Student std1 = new Student();
		School scl3 = new School(std1);
		School scl4 = new School("Zevier");

	}
}