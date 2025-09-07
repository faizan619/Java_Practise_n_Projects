public class NextGreaterElement2{
	public static void main(String[] args) {
		System.out.println("Next Greater Element 2");
		int nums[] = {1,2,1};

		int n[] = new int[nums.length];

		int j = 0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i] > nums[j] && nums[i] == nums[j]+1) {
				n[j] = nums[i];
				j++;
			}
			else if(j==nums.length) {
					n[j] = -1;
				j++;
			
			}
		}
	}
}