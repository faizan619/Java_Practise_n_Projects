public class array_practise1{

	// Printing all the element
	public static void main(String[] args) {
		System.out.println("Array Practise in Java");

		int sarr[] = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};
		int uarr[] = {21,29,7,9,13,17,19,27,1,3,11,21,25,5,15};

		array_practise1 topics = new array_practise1();

		topics.printAllElementInArray(uarr);

		topics.findMinAndMaxInUnsortedArray(uarr);

		topics.findMinAndMaxInSortedArray(sarr);

		topics.reverseTheUnSortedArray(uarr);

		topics.checkIfTheArrayIsSortedOrNot(uarr);

		topics.sumOfAllElements(uarr);

		topics.findSecondLargestElement(uarr);

		topics.arrayContainsTheSpecificElement(uarr);

		topics.mergeTwoSortedArray();

	}

	public void mergeTwoSortedArray() {
		System.out.println();
		System.out.println("Merge two Array ");
		int arr1[] = {1,3,5,7,9};
		int arr2[] = {2,4,6,8,10};
		int arr1size = arr1.length;
		int arr2size = arr2.length;
		int arr3[] = new int[arr1size+arr2size];

		for(int i=0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i] = arr2[i];
		}
		for(int m:arr3) {
			System.out.print(m+" ");
		}
		System.out.println();
	}

	public void arrayContainsTheSpecificElement(int arr[]) {
		System.out.println();
		System.out.println("Find Specific Element in Array");

		int search = 9;
		Boolean val = false;
		for(int m:arr) {
			if(m==search){
				val = true;
				break;
			}
		}

		System.out.println(val ? "Contains the Element":"Don't not contains the Element");
	}

	public void findSecondLargestElement(int arr[]) {
		System.out.println();
		System.out.println("Finding the Second largest Element");

		int first = 0;
		int second = 0;
		for(int m:arr) {
			if(m>first && m>second) {
				second = first;
				first = m;
			}
			else if(m>second && m<first){
				second = m;
			}
		}
		System.out.println("Second largest Element is : "+second);
	}

	public void sumOfAllElements(int arr[]) {
		System.out.println();
		System.out.println("Sum of All the Element");
		int sum = 0;
		for(int m:arr){
			sum += m;
		}
		System.out.println("Sum of all the element is : "+sum);

	}

	public void checkIfTheArrayIsSortedOrNot(int uarr[]) {
		System.out.println();
		System.out.println("Checking is the given array is sorted or not");
		Boolean isArray = false;
		for(int i=0;i<uarr.length-1;i++) {
			if(uarr[i] < uarr[i+1]) {
				isArray = true;
			}
			else{
				isArray = false;
				break;
			}
		}

		for(int u:uarr) {
			System.out.print(u+" ");
		}
		System.out.println();
		if(isArray) {
			System.out.println("The Given Array is Sorted Array");
		}
		else{
			System.out.println("The Given array is UnSorted Array");
		}
	}

	public void reverseTheUnSortedArray(int uarr[]){
		System.out.println();
		System.out.println("Reverse the Unsorted Array");
		int ulen = uarr.length-1;
		int urev[] = new int[uarr.length];
		int inc = 0;
		System.out.print("Old : ");
		for(int u:uarr) {
			System.out.print(u+" ");
		}

		System.out.println();

		System.out.print("New : ");
		for(int i=ulen;i>=0;i--) {
			
			urev[inc] = uarr[i];
			inc++;
		}

		for(int r:urev) {
			System.out.print(r+" ");
		}
		System.out.println();
	}

	public void findMinAndMaxInSortedArray(int sarr[]){
		System.out.println();
		System.out.println("Finding Min and Max Element in the Array");
		int max = 0;
		int min = sarr.length-1;
		for(int u:sarr){
			if(u>max){
				max = u;
			}
			if(u<min){
				min = u;
			}
		}
		System.out.println("Maximun value is "+max+" and Minimum value is "+min);
	}

	public void findMinAndMaxInUnsortedArray(int uarr[]){
		System.out.println();
		System.out.println("Finding Min and Max Element in the Array");
		int max = 0;
		int min = uarr.length-1;
		for(int u:uarr){
			if(u>max){
				max = u;
			}
			if(u<min){
				min = u;
			}
		}
		System.out.println("Maximun value is "+max+" and Minimum value is "+min);
	}

	public void printAllElementInArray(int uarr[]){
		System.out.println();
		System.out.println("All the Element in the Unsorted List : ");
		for(int u:uarr){
			System.out.print(u+" ");
		}
		System.out.println();
	}
}