public class Tut12{
	public static void main(String ag[]){
		System.out.println("Tutorial 12 in Java");

		int n1 = 42;
		int n2 = 0;

		int res = 0;
		int arr1[] = {22,42,53,64,75,86};
		// try{
		// 	res = n1/n2;
		// }
		// catch(ArithmeticException e1){
		// 	System.out.println("Cannot Divide by Zero");
		// }
		// catch(Exception e){
		// 	System.out.println("Error : "+e);
		// }
		// finally{
		// 	System.out.println("Execution Completed");
		// }




		// try{
		// 	System.out.println(arr1[10]);
		// }
		// catch(IndexOutOfBoundsException e2){
		// 	System.out.println("Cannot Search Out of Array");
		// }
		// catch(Exception e){
		// 	System.out.println("Error : "+e);
		// }
		// finally{
		// 	System.out.println("Execution Completed");
		// }

		try{
			res = n1/n2;
			int res1 = arr1[10];
			System.out.println(res1);
		}
		catch(ArithmeticException e1){
			System.out.println("Cannot Divide by Zero");
		}
		catch(IndexOutOfBoundsException e2){
			System.out.println("Cannot Search Out of Array");
		}
		catch(Exception e){
			System.out.println("Error : "+e);
		}
		// finally{
		// 	System.out.println("Execution Completed");
		// }
	}
}