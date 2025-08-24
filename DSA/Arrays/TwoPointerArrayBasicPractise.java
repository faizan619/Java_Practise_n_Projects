import java.util.*;

public class TwoPointerArrayBasicPractise{
	public static void main(String[] args) {
		System.out.println("Two Pointer Practise");

		TwoPointerArrayBasicPractise a = new TwoPointerArrayBasicPractise();

		a.PairWithTargetSum();

		a.RemoveDuplicateFromArray();

		a.ReverseArray();

	}

	public void ReverseArray() {
		System.out.println();
		System.out.println("Reverse An Array");

		int arr[] = {1,2,3,4,5};
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}
		for(int m:arr) {
			System.out.print(m+" ");
		}
		System.out.println();
	}

	public void RemoveDuplicateFromArray() {
		System.out.println();
		System.out.println("Remove Duplicate From Array!");

		int arr[] = {1,1,2,2,3,3,4,5,5,6};
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[j] != arr[i]) {
				j++;
				arr[j] = arr[i];
			}
		}

		for(int i=0;i<j+1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		// int alen = arr.length;
			// for(int i=0;i<alen;i++) {
			// 	for(int j=i+1;j<alen;j++){
			// 		if(arr[i] == arr[j]){
			// 			int temp = arr[alen-1]; 
			// 			arr[alen-1] = arr[j];
			// 			arr[j] = temp;
			// 			alen--;
			// 		}
			// 	}
			// }

			// for(int i=0;i<alen;i++) {
			// 	System.out.print(arr[i]+" ");
			// }
		// System.out.println();
	}

	public void PairWithTargetSum() {
		System.out.println();
		System.out.println("Pair With Target Sum");
		int arr1[] = {1,2,4,7,11,15};
		int find = 14;
		int left = 0; 
		int right = arr1.length-1;
		System.out.println(right);
		while(left<right) {
			int sum = arr1[left] + arr1[right];
			if(sum == find) {
				System.out.println("Its True");
				break;
			}
			else{
				left++;
				right--;
			}
		}

		// for(int i=0;i<arr1.length;i++) {
			// 	for(int j=i+1;j<arr1.length;j++) {
			// 		int sum = arr1[i] + arr1[j];

			// 		if(sum == find){
			// 			System.out.println("arr1[i] = "+arr1[i]+" | arr1[j] = "+arr1[j]+" = "+find);
			// 			System.out.println("Its True");
			// 		}
			// 	}
		// }
	}
}