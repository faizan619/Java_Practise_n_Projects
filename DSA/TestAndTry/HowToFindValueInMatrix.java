public class HowToFindValueInMatrix{
	public static void main(String[] args) {
		System.out.println("How to find the Value in matrix!");

		int matrix[][] = {
			{1,2,3,4},
			{5,6},
			{4,3,2},
			{1},
			{5,3,6,7,8,9},
			{2,4,6,8}
		};

		int m = matrix.length;
		System.out.println("Length of m : "+m);

		for(int i=0;i<m;i++) {
			int n = matrix[i].length;
			System.out.println("Length of "+(i+1)+" Row is : "+n);
		}
	}
}