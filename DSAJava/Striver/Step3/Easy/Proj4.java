public class Proj4{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int alen = arr.length;
		int k = 3;
		
		System.out.println("before ");
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();

		for(int i=0;i<k+1;i++){
			int temp = arr[0];
			for(int j=1;j<alen;j++){
				arr[j-1] = arr[j];
			}
			arr[alen-1] = temp;

			System.out.print("Iteration [ "+i+" ] = ");
			for(int n:arr){
				System.out.print(n+" ");	
			}
			System.out.println();
		}

		System.out.println("Rotate An Array By "+k);
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();
	}
}