public class ReverseInteger{
	public static void main(String[] args) {
		System.out.println("Reverse Integer");

		// int num = -123;
		int num = 1534236469;
		int temp = num;
		int result = 0;
		while(temp!=0) {
			int tt = temp % 10;
			System.out.println("--"+tt+" == "+result);

			if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && tt > 7)) {
                System.out.println("Overflow! Returning 0");
                result = 0; 
                break;
            }
            if (result < Integer.MIN_VALUE / 10 || 
               (result == Integer.MIN_VALUE / 10 && tt < -8)) {
                System.out.println("Underflow! Returning 0");
                result = 0;
                break;
            }


			result = result *10 +tt;
			System.out.println("res : "+result);
			temp /= 10;
		}
		System.out.println("Input : "+num);
		System.out.println("Result : "+result);
	}
}