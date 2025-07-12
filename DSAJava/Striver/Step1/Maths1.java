public class Maths1{
	public static void main(String[] args) {
		System.out.println("Maths in Java");
		int num = 456956;
		int count = 0;

		int cnc = (int) (Math.log10(num)+1);

		// while(num>count){
		// 	count++;
		// 	num = num%10;
		// }
		// System.out.println("Count : "+count);
		System.out.println(cnc);

	}
}