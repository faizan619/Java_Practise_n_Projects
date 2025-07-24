public class Proj4{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		// int arr[] = {-1,-100,3,99};
		int alen = arr.length;
		int k = 3;
		
		System.out.println("before ");
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();

		// right rotate
		for(int i=0;i<k;i++){
			int temp = arr[alen-1];
			for(int j=alen-1;j>0;j--){
				arr[j] = arr[j-1];
			}
			arr[0] = temp;

			System.out.print("Iteration [ "+i+" ] = ");
			for(int n:arr){
				System.out.print(n+" ");	
			}
			System.out.println();
		}

		// left rotate
		// for(int i=0;i<k;i++){
		// 	int temp = arr[0];
		// 	for(int j=1;j<alen;j++){
		// 		arr[j-1] = arr[j];
		// 	}
		// 	arr[alen-1] = temp;

		// 	System.out.print("Iteration [ "+i+" ] = ");
		// 	for(int n:arr){
		// 		System.out.print(n+" ");	
		// 	}
		// 	System.out.println();
		// }

		System.out.println("Rotate An Array By "+k);
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();
	}
}