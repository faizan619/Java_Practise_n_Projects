// ENUM is a class but unlike other class it cannot be extended to child class.
enum Status{
	Running, Failed, Pending, Success
}

public class enumj{
	public static void main(String ar[]){
		System.out.println("Enum in Java");

		Status s1 = Status.Success;
		// Status s2 = Statuc.Running;		// it's showing error
		System.out.println("Status : "+s1);
		// System.out.println("Status : "+s2);
		System.out.println(s1.ordinal());



		// Fetching All Data using normal loop
		Status[] s3 = Status.values();
		for(int i =0;i<s3.length;i++){
			System.out.println(s3[i]);
		}

		// Fetching All Data using Enhanced loop
		for(Status m:s3){
			System.out.println(m+" : "+m.ordinal() );
		}

		// If else if and else using ENUM
		if(s1 == Status.Running){
			System.out.println("User is Running");
		}
		else if(s1 == Status.Pending){
			System.out.println("User is Pending");
		}
		else if(s1 == Status.Success){
			System.out.println("User is Success");
		}
		else if(s1 == Status.Failed){
			System.out.println("User is Failed");
		}
		else{
			System.out.println("Noting from Status");
		}

		// Switch case with ENUM
		switch(s1){
			case Running:
				System.out.println("User is Running");
				break;
			case Pending:
				System.out.println("User is Pending");
				break;
			case Failed:
				System.out.println("User is Failed");
				break;
			case Success:
				System.out.println("User is Success");
				break;
			default:
				System.out.println("Nothing from status");

		}


		System.out.println(s1.getClass());
		System.out.println(s1.getClass().getSuperclass());
	}
}