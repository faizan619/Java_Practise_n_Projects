public class Except2{
	public static void main(String ap[]){
		System.out.println("Exception Handling in Java");

		int i =50;
		int j = 0;

		try{
			j = 20/i;	
			if(j == 0){
				throw new ArithmeticException("Value bada hai from top");
			}
		}
		catch(ArithmeticException e){
			System.out.println("Cannot Divide by Zero");
			System.out.println("-----------------"+e+"-------------");
		}
		catch(Exception e){
			System.out.println("Something Went Wrong"+e);
		}

		System.out.println("Result : "+j);
		
	}
}