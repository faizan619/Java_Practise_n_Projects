public class calculateSumOfDigitOfNumber{
	public static void main(String[] args) {
		System.out.println("Calculate Sum of Digit of Numbers!");

		int num = 43923;
		int temp = num;
		int sum = 0;

		while(temp>0){
			int lastDigit = temp %10;
			sum += lastDigit;
			temp /= 10;
		}
		System.out.println(num+" total Sum is : "+sum);
	}
}