public class power{

	private static double powHelper(double x, int n) {
        if (n == 0) return 1;
        double half = powHelper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;  // If n is even
        } else {
            return half * half * x;  // If n is odd
        }
    }

	public static void main(String[] args) {
		System.out.println("Power");

		double x = 2.00;
		int n = -20;

		
		if (n == 0){
			System.out.println("Its 1");
			return;
		}  // Any number to the power of 0 is 1

        if (n < 0) {
            x = 1 / x;  // If the exponent is negative, invert the base
            n = -n;  // Make the exponent positive
        }

        double hh =  power.powHelper(x, n);
        System.out.println(hh);
        System.out.println("Finish");

		// // System.out.println(0.25*2);
		// x = 0.25*2;
		// System.out.println(1/x);
		// return;

		// double temp = x;

		// if(n>1){
        //     while(n>1) {
        //         x = x*temp;

        //         n--;
        //         System.out.println("If - x : "+x+" | "+"n : "+n);
        //     }
        // }
        // else if(n<0){
        //     while(n<1) {
        //     	x = x*temp;
        //         x = 1/x;
        //         n++;
        //         System.out.println("Else - x : "+x+" | "+"n : "+n);
        //     }
        // }

		// System.out.println("Power : "+x);

	}
}