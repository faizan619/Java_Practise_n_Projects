public class QuickSort{
	public static void main(String[] args) {
		int arr[] = {6,3,7,8,2,1,7,4};
		System.out.println("Before :");
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			arr[arr[i]] = arr[i]; 
		}
		System.out.println("After :");
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();
	}
}