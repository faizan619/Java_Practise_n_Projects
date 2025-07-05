public class Except1{
	public static void main(String ap[]){
		System.out.println("Exception Handling in Java");

		int i =2;
		int j = 0;
		int nums[] = new int[3];

		try{
			j = 20/i;	
		}
		catch(Exception e){
			System.out.println("Something Went Wrong : "+e);
		}

		// ---------------------------------------------------------------------------------\

		String str = null;
		try{
			j = 20/i;	
			System.out.println("nums[2] : "+nums[2]);
			System.out.println("nums[4] : "+nums[4]);

			System.out.println("Length : "+str.length());
		}
		catch(ArithmeticException e){
			System.out.println("Cannot Divide by Zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Calling Value out of limit");
		}
		catch(Exception e){
			System.out.println("Something Went Wrong"+e);
		}

		System.out.println("Result : "+j);
		
	}
}