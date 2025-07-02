class Student{
	int rollno;
	String name;
	int marks;
}
public class Array{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.rollno = 21;
		s1.name = "faizan";
		s1.marks = 99;

		Student s2 = new Student();
		s2.rollno = 22;
		s2.name = "aneeza";
		s2.marks = 96;

		Student s3 = new Student();
		s3.rollno = 23;
		s3.name = "suja";
		s3.marks = 98;

		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for(int i=0;i<students.length;i++){
			System.out.println(students[i].name+" - "+students[i].rollno);
		}

		for(Student stud : students){
			System.out.println(stud.name+" : "+stud.rollno);
		}
	}

	public static void main4(String[] ag){
		int nums [][][] = new int[3][4][5];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				for(int k=0;k<nums[i][j].length;k++){
					nums[i][j][k] = (int)(Math.random()*10);
					// System.out.println(nums[i][j][k]);
				}
			}
		}

		for(int m[][]:nums){
			for(int n[]:m){
				for(int o:n){
					System.out.print(o+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main3(String[] ag){
		int nums[][] = new int[3][];		//jagged Array;

		nums[0] = new int[3];
		nums[1] = new int[4];
		nums[2] = new int[2];

		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				nums[i][j] = (int)(Math.random()*10); 	
			}
		}

		for(int n[]:nums){
			for (int m:n){
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}

	public static void main2(String args[]){
		int nums[][] = new int[3][4];

		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				nums[i][j] = (int)(Math.random()*10); 
				System.out.print("- "+nums[i][j]+" -");
			}
			System.out.println();
		}

		// Enhanced For Loop
		for(int n[] : nums){
			for(int m:n){
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}

	public static void main1(String[] sr){
		System.out.println("Array in Java");
		String fruits[] = {"mango","apple","banana","grapes","papaya","guwava","strawberry","melon","pineapple"};
		System.out.println(fruits[1]);
		// for(int i=0;i<8;i++){
		// 	System.out.println("Fruits : "+fruits[i]);
		// }

		for(String m:fruits){
			System.out.println("Fruit : "+m);
		}

	}
}