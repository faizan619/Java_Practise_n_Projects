public class Palindrome{
	public static void main(String[] args) {
		System.out.println("Question No 9: Palindrome Number");
		Palindrome p = new Palindrome();
		int x = 121;

		// reversNumber(x);
		int xx = reversNumber(x);
		// System.out.println(xx);

		System.out.print("Given Number "+x+" is Palindrome : ");
		System.out.print(p.isPalindrome(x));
		System.out.println();
	}

	static int reversNumber(int n)
    {
        int reversed_n = 0;
        while (n > 0) {
        	// System.out.println("Reversed_n : "+reversed_n*10);
        	// System.out.println("n : "+n%10);
            reversed_n = reversed_n * 10 + n % 10;
            // System.out.println(reversed_n);
            n = n / 10;
        }
        return reversed_n; 
    }

	public boolean isPalindrome(int x) {
		int a = Palindrome.reversNumber(x);
		if (a == x){
			return true;
		}
		return false;
	}
}