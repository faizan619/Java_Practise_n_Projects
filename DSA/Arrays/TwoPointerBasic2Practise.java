public class TwoPointerBasic2Practise{
	public static void main(String[] args) {
		System.out.println("Basic Two Pointer Algorithm!");

		TwoPointerBasic2Practise a = new TwoPointerBasic2Practise();

		// a.CheckIfArrayIsPaindromeOrNot();

		// a.findPairWithGivenDifference();

		// a.RemoveDuplicateFromSortedArray();

		// a.MoveZerosToTheEnd();

		// a.FindInteractionOfTwoSortedArray();
	}

	public void FindInteractionOfTwoSortedArray(){
		// Example: arr1=[1,2,4,5,6], arr2=[2,3,5,7] → [2,5]
		System.out.println();
		System.out.println("Find Interaction of Two Sorted Array!");
		System.out.print("[ ");
		int arr1[] = {1,2,4,5,6};
		int arr2[] = {2,3,5,7};

		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++){
				if(arr1[i] == arr2[j]) {
					System.out.print(arr2[j]+" ");
				}
			}
		}
		System.out.print("]");
		System.out.println();
	}

	public void CheckIfArrayIsPaindromeOrNot(){
		// Example: [1, 2, 3, 2, 1] → true
		System.out.println();
		System.out.println("Check if Array is Palindrome or Not");
		int arr[] = {1,2,3,2,1};
		int left = 0,right=arr.length-1;
		while(left<right) {
			if(arr[left] != arr[right]){
				System.out.println(false);
				return;
			}
			left++;
			right--;
		}
		System.out.println(true);
	}

	public void findPairWithGivenDifference(){
		System.out.println();
		System.out.println("Find Pair With Given Difference");
		// Example: [5,20,3,2,5,80], diff=78 → (2,80)
		int arr[] = {5,20,3,2,80};

		int left = 0;
		int right = arr.length-1;

		int find = 23;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				int diff = arr[i] + arr[j];
				if(diff == find) {
					System.out.println("Difference of "+find+" is done with element : "+arr[i]+" | "+arr[j]);
					return;
				}
			}
		}
		System.out.println("Not Difference is Found!");
	}

	public void RemoveDuplicateFromSortedArray(){
		System.out.println();
		System.out.println("Remove Duplicate From the Sorted Array");
		int arr[] = {0,1,2,3,3,4,5,5,6};
		int j=0;
		for(int i=1;i<arr.length;i++) {
			// System.out.println(arr[j]+" | "+arr[i]);

			// for(int m:arr){
			// 	System.out.print((m == arr[i] || m==arr[j]) ? "["+m+"]":m +" ");
			// }
			// System.out.println();
			if(arr[j] != arr[i]) {
				j++;
				arr[j] = arr[i];
			}
		}
		

		System.out.println("Final : ");
		for(int i=0;i<j+1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public void MoveZerosToTheEnd(){
		// Example: [0,1,0,3,12] → [1,3,12,0,0]
		int arr[] = {0,1,0,3,12};
		int nonZero = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[nonZero++] = arr[i];
			}
		}

		for(int i=nonZero;i<arr.length;i++) {
			arr[i] = 0;
		}

		for(int m:arr) {
			System.out.print(m+" ");
		}
		System.out.println();
	}

}