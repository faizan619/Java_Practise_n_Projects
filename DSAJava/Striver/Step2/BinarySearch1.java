import java.util.Scanner;
public class BinarySearch1{
	public static int searching(int arr[],int val){
		int alen = arr.length-1;
		int low = 0;
		while(low<=alen){
			int mid = (low+alen)/2;
			if(arr[mid] == val){
				return mid;
			}
			else if(arr[mid] < val){
				low = mid+1;
			}
			else{
				alen = mid-1;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		int arr[] = {2,4,5,7,9,15,19,22,27,29,33,38,41,47,49};
		// int arr[] = {2,4,5,7,9,15,19};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value to Search : ");
		int val = sc.nextInt();

		int place = searching(arr,val);
		System.out.println(place >= 0 ? val+" is present in index : "+place : "Value Not Present" );

	}
}