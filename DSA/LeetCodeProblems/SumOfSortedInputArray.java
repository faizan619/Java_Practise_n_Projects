public class SumOfSortedInputArray{
	public static void main(String[] args) {
		System.out.println("Sum Of Sorted Input Array");

		// int arr[] = {2,7,11,15};
		// int arr[] = {2,3,4};
		// int arr[] = {-1,0};
		int arr[] = {0,0,3,4};

		int target = 0;
		int newarr[] = new int[2];

		int left = 0;
		int right = arr.length-1;
		while(right>=left) {
			if(arr[left] + arr[right] == target) {
				newarr[0] = left+1;
				newarr[1] = right+1;

				for(int m:newarr) {
					System.out.print(m+" ");
				}
				System.out.println();
				break;
			}
			else if(arr[left] + arr[right] > target) {
				right--;
			}
			else{
				left++;
			}
		}
		System.out.println("Not element found with sum "+target);
	}
}