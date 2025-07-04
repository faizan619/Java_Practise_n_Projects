import Tut5Folder.Employee;
import TopicLearn.Br;

public class Tut5{
	public static void main(String ar[]){
		System.out.println("Tutorial 5");
		Br line = new Br(); 

		line.seperate("Basic Arrays in Java");

		// Arrays in Java
		String fruits[] = {"mango","apple","banana","grapes","papaya","guwava","strawberry","melon","pineapple"};
		for(int i =0;i<fruits.length;i++){
			System.out.println("Fruit : "+fruits[i]);
		}

		line.seperate("Enhanced For Loop in Java");

		for(String a : fruits){
			System.out.println("Enhanced : "+a);
		}

		line.seperate("(2 * 2) Array in Java");

		int nums[][] = new int[3][5];
		for(int i =0;i<nums.length;i++){
			for(int j =0;j<nums[i].length;j++){
				nums[i][j] = (int)(Math.random()*10);
			}
		}

		for(int n1[]:nums){
			for(int n2:n1){
				System.out.print(n2+" ");
			}
			System.out.println();
		}

		line.seperate("(3 * 3) Array in Java");
		int vals[][][] = new int[3][4][5];

		for(int i =0;i<vals.length;i++){
			for(int j =0;j<vals[i].length;j++){
				for(int k = 0;k<vals[i][j].length;k++){
					vals[i][j][k] = (int)(Math.random()*10);
				}
			}
		}

		for(int a1[][]:vals){
			for(int a2[]:a1){
				for(int a3:a2){
					System.out.print(a3+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

		line.seperate("Package with Array in Java");

		Employee emp1 = new Employee();
		emp1.name = "faizan";
		emp1.rollno = 24;
		
		Employee emp2 = new Employee();
		emp2.name = "asad";
		emp2.rollno = 25;
		
		Employee emp3 = new Employee();
		emp3.name = "giridhar";
		emp3.rollno = 26;
		
		Employee emp4 = new Employee();
		emp4.name = "wasee";
		emp4.rollno = 27;

		Employee emp[] = new Employee[4];
		emp[0] = emp1;
		emp[1] = emp2;
		emp[2] = emp3;
		emp[3] = emp4;

		for(Employee em:emp){
			System.out.println(em.name+" /:/ "+em.rollno);
		}

		line.seperate("Casting in Java");
		
		double salary = 16000.50;
		System.out.println("Salary . Double: "+salary);

		int sal_int = (int) salary;
		System.out.println("Salary .. Int: "+sal_int);

		// double sal_double = (double) sal;
		double sal_double = sal_int;		// both work proprly.
		System.out.println("Salary ... Double: "+sal_double);

		float sal_float1 = sal_int;
		float sal_float2 = (float) sal_double;
		System.out.println("Salary .... Float:"+sal_float1);
		System.out.println("Salary .... Float:"+sal_float2);

		// String sal_string = (String) sal_float1;		// can't be converted even after casting
		// String sal_string = (String) sal_int;			// can't be converted even after casting

		String sal_string = "100";
		// int sal_string_int = (int) sal_string;

		line.seperate("Constructor in Java");

		Employee emp_con = new Employee();
		Employee emp_sal = new Employee(16044.55);

		new Employee();
		new Employee(55.34).test();

		line.seperate("Encapsulation in Java");

		Employee del1 = new Employee();
		// del1.setAge(23);
		del1.setUsername("faizan");
		del1.getUsername();
		del1.getAge();
		// del1.username = "alam";		// it not available becasue its private
		del1.name = "faizan";
		del1.rollno = 24;
		del1.show();

		line.seperate("Final Keyword in Java");

		final double PIE = 3.14;
		System.out.println("Value of PIE : "+PIE);
		// PIE = 33.44;	// value cannot be reassign to final variable.


		line.totalTopicLearn();


	}
}