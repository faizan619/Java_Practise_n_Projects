public class TwoPointerIntermediatePractise{
	public static void main(String[] args) {
		System.out.println("Two Pointer Intermediate Practise");

		TwoPointerIntermediatePractise a = new TwoPointerIntermediatePractise();

		a.SquareOfSortedArray();

		a.MoveZerosToTheEnd();

	}

	public void SquareOfSortedArray() {
		System.out.println();
		System.out.println("Square of Sorted Array");
		int arr[] = {-4,-1,0,3,10};
		int n = arr.length;
		int result[] = new int[n];
		int left = 0;
		int right = n-1;
		int pos = n-1;
		while(left<right) {
			if(Math.abs(arr[left]) > Math.abs(arr[right])) {
				result[pos] = arr[left] * arr[left];
				left++;
			}
			else{
				result[pos] = arr[right] * arr[right];
				right--;
			}
			pos--;
		}

		for(int m:result) {
			System.out.print(m+" ");
		}
		System.out.println();
		

	}

	public void MoveZerosToTheEnd() {
		System.out.println();
		System.out.println("Moving Zeroes to the End");
		int arr[] = {0,1,0,3,12};
		int nonZero = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[nonZero++] = arr[i];
			}
		}

		while(nonZero<arr.length) {
			arr[nonZero++] = 0;
		}

		for(int m:arr) {
			System.out.print(m+" ");
		}
		System.out.println();
	}
}