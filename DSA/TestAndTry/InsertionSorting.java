public class InsertionSorting{
	public static void main(String[] args) {
		System.out.println("InSertion Sort");

		// int[] nums={10,9,1,1,1,2,3,1};
		// [110, 100, 0]
		int nums[] = {110,100,0};
		for(int i=0;i<nums.length;i++) {
			int j=i;


			System.out.println();
		System.out.println("------------------ I : "+i);
		for(int m:nums) {
			System.out.print(m+" ");
		}
		System.out.println();


			while(j>0 && nums[j-1] > nums[j]) {
				int swap = nums[j-1];
				nums[j-1] = nums[j];
				nums[j] = swap;


				System.out.println();
				System.out.println("In While of J : "+j);
				for(int m:nums) {
					System.out.print(m+" ");
				}
				System.out.println();


				j--;
			}
		}

		System.out.println();
		for(int m:nums) {
			System.out.print(m+" ");
		}
		System.out.println();
	}
}