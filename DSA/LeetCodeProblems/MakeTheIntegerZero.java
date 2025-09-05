public class MakeTheIntegerZero{
	public static void main(String[] args) {
		System.out.println("Make The Integer Zero");

		int num1 = 3;
		int num2 = -2;

		for (int k = 1; k <= 60; k++) {
            long x = 1L * num1 - 1L * num2 * k;
            if (x < k) {
                return -1;
            }
            if (k >= Long.bitCount(x)) {
                return k;
            }
        }
        return -1;

	}
}