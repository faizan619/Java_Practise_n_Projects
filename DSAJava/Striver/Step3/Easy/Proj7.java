public class Proj7{
	public static void main(String[] args) {
		// int arr[] = {1,2,3,4,5};
		// int arr[] = {1,3,4,3,5,4,-2};
		int arr[] = {-100};
		uniqueSum(arr);
	}

	static void uniqueSum(int nums[]){
		int alen = nums.length;
		int temp[] = new int[alen];
		for(int i=0;i<alen-1;i++){
			for(int j=i+1;j<alen;j++){
				if(nums[i] == nums[j] && nums[j] != 0){
					nums[j] = 0;
				}
			}
		}
		for(int m:nums){
			System.out.print(m+" ");
		}
		System.out.println();

		int sum = 0;
		for(int i=0;i<alen;i++){
			sum = sum+nums[i];
		}
		System.out.println(sum);
	}
}