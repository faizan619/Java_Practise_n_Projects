class Record{
	int num = 0;
	String allTopics[] = new String[100];
	public void topic(String title){
		allTopics[num] = title;
		num++;
		System.out.println("------------------- [ "+num+" ] - "+title+"-------------------");
		System.out.println();
	}
	public void getResult(){
		System.out.println("Total Topic Learn : "+num);
		for(String name:allTopics){
			if(name!= null){
				System.out.println("Topic : "+name);
			}
		}
	}
}

public class Prog1{
	public static void main(String[] args) {
		System.out.println("Working with Arrays in Java");
		Record line = new Record();

		// int arr[] = {2,5,8,12,53,73,45,77,82,81,62,83,27,29,36,58,59};
		int arr[] = {2,8,4,6,3,7};

		line.topic("Finding Largest Element in an Array!");
		int largest = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest = arr[i];
			}
		}
		System.out.println("Largest Number is : "+largest);

		line.topic("Find Second Largest Element in an Array!");
		int largest1 = 0;
		int secondlargest1 = largest1;
		int smallest = arr.length;
		int secondsmallest = smallest;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest1){
				// System.out.println("if Condition "+arr[i]+" > "+largest1);
				secondlargest1 = largest1;
				largest1 = arr[i];
				// System.out.println("largest : "+largest1+" second largest : "+secondlargest1);
			}
			else if(arr[i] > secondlargest1 && arr[i] != largest){
				// System.out.println("Second largest : "+arr[i]+" > "+secondlargest1);
				secondlargest1 = arr[i];
			}

			if(arr[i] <smallest){
				secondsmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i]<secondsmallest && arr[i]!= smallest){
				secondsmallest = arr[i];
			}
		}
		System.out.println("Second Largest Element : "+secondlargest1);
		System.out.println("Second Smallest Element : "+secondsmallest);

		line.topic("Check if the Array is Sorted or not");
		boolean isSorted = true;

		int arr1[] = {1,2,3,4,5,6,7};
		for(int m:arr1){
			System.out.print(m+" ");
		}
		System.out.println();
		int prev = 0;
		for(int i=0;i<arr1.length;i++){
			// System.out.println(arr1[i]+" : "+prev);
			if(arr1[i]>prev){	prev = arr1[i] ;	}
			else{	isSorted = false;	break;	}
		}
		if(isSorted){
			System.out.println("Array is Sorted");
		}
		else{
			System.out.println("Array is not sorted");
		}


		int arr2 = {2,3,4,1};
		for(int i =0;i<arr2;i++){
			arr2[i] = arr[i+1];
		}

	}
}