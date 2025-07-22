public class Proj3{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int alen = arr.length;
		int temp = arr[0];

		for(int i=0;i<alen-1;i++){
			arr[i] = arr[i+1];
		}
		arr[alen-1] = temp;
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();
	}





	// public static void main(String[] args) {
	// 	int arr[] = {1,2,3,4,5};
	// 	int alen = arr.length;
	// 	rotateD(arr,alen);
	// }

	// static void rotateD(int arr[],int n){
	// 	int temp[] = new int[n];
	// 	for(int i=1;i<n;i++){
	// 		temp[i-1] = arr[i];
	// 	}
	// 	temp[n-1] = arr[0];
	// 	for(int m:temp){
	// 		System.out.print(m+" ");
	// 	}
	// 	System.out.println();
	// }
}