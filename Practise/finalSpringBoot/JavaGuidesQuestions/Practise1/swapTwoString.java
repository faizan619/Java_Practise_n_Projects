public class swapTwoString{
	public static void main(String[] args) {
		System.out.println("Swap Two String in Java");
		String n1 = "faizan";
		String n2 = "salman";
		String temp;

		System.out.println("Name1 : "+n1+" | Name2 : "+n2);
		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("Name1 : "+n1+" | Name2 : "+n2);
	}
}