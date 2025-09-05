public class MakeTheIntegerZero{
	public static void main(String[] args) {
		System.out.println("Make The Integer Zero");

		int num1 = 3;
		int num2 = -2;

		for(int k=0;k<5;k++) {
			long x = 1L * num1 - 1L * num2 * k;
			System.out.println("X : "+x);

			System.out.println("Long ; "+Long.bitCount(x));
		}

	}
}