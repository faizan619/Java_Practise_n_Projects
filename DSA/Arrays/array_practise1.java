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