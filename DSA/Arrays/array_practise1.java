public class array_practise1{

	// Printing all the element
	public static void main(String[] args) {
		System.out.println("Array Practise in Java");

		int sarr[] = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};
		int uarr[] = {21,29,7,9,13,17,19,27,1,3,11,21,25,5,15};

		array_practise1 topics = new array_practise1();

		topics.printAllElementInArray(uarr);

		topics.findMinAndMaxInUnsortedArray(uarr);
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