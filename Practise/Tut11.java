enum Colleague{
	Vikash(5000), Rishu(7000), Abhishek, Janvi, Rachit(4000), Faizan(16000);

	private int salary;

	private Colleague(){};

	private Colleague(int Sal){
		this.salary = Sal;
	};

	public int getSalary(){
		// System.out.println("Salary is : "+this.salary);
		return this.salary;
	};

	public void setSalary(int salary){
		this.salary = salary;
	}
}

enum Planing{
	STUDYING, PRACTISE, INTERVIEW, OFFER
}
public class Tut11{
	public static void main(String ag[]){
		System.out.println("Tutorial 11 in Java");

		// Colleague c1 = Colleague.Rishu;
		// c1.getSalary();

		for(Colleague col: Colleague.values()){
			if(col.getSalary() == 0){
				col.setSalary(3000);
			}
			System.out.println(col+" : "+col.getSalary());
		}

		System.out.println("===============================");





		Planing p1 = Planing.INTERVIEW;
		// System.out.println("planning : "+p1);
		// System.out.println("planning : "+p1.ordinal());

		Planing p2[] = Planing.values();
		for(int i=0;i<p2.length;i++){
			System.out.println(p2[i]+" - "+(p2[i].ordinal() +1)	);
		}

		for(Planing m:p2){
			System.out.println("Value : "+m+" : "+m.ordinal());
		}
	}
}