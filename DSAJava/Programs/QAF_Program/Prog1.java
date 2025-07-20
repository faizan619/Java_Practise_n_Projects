class Record{
	int num = 0;
	String allTopics[] = new String[100];
	public void topic(String title){
		allTopics[num] = title;
		num++;
		System.out.println();
		System.out.println("------------------- [ "+num+" ] - "+title+"-------------------");
	}

	public void getResult(){
		System.out.println("Total Topic Learn : "+num);
		for(String name:allTopics){
			if(name!= null){
				System.out.println("Topic : "+name);
			}
		}
	}
}

public class Prog1{
	public static void main(String[] args) {
		System.out.println("Program to Swap two Number With and Without using third Variable.");
		Record line = new Record();

		line.topic("Swaping using Third Variable");
		int a1 = 43;
		int a2 = 54;

		System.out.println("Before : Value of A1 : A2 = "+a1+" : "+a2);
		int swap = 0;
		swap = a1;
		a1 = a2;
		a2 = swap;
		System.out.println("After : Value of A1 :A2 = "+a1+" : "+a2);


		line.topic("Swaping without using Third Variable");
		int a3 = 37;
		int a4 = 75;

		System.out.println("Before : Value of A3 : A4 = "+a3+" :"+a4);
		a3 = a3+a4;
		a4 = a3-a4;
		a3 = a3-a4;
		System.out.println("After : Value of A3 : A4 = "+a3+" : "+a4);


		line.topic("Swaping without using Third Variable and Arithmetic Operator");
		int a5 = 6;
		int a6 = 9;

		System.out.println("Before : Value of A5 : A6 = "+a5+" :"+a6);
		a5 = a5^a6;
		a6 = a5^a6;
		a5 = a5^a6;
		System.out.println("After : Value of A5 : A6 = "+a5+" : "+a6);

		line.topic("Check is Number is Even or odd");
		int a7 = 53;
		if(a7%2==0){ System.out.println(a7+" is a Even Number."); }
		else{ System.out.println(a7+" is a Odd Number");}

		line.topic("Check is the Number is prime number or Not");
		int a8 = 23;
		boolean cc = false;
		for(int i=2;i<a8/2;i++){
			if(a8%i!=0){ cc = true; }
		}
		if(cc){ System.out.println(a8+" is a  Prime Number");}
		else{System.out.println(a8+" is not a Prime Number");}

	}
}