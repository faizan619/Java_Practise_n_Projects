public class ConcatinationOfArrays{
	public static void main(String[] args) {
		System.out.println("Concatination of Arrays");
		int arr[] = {1,2,3};

		for(int i=0;i<arr.length;i++) {
			arr[arr.length+i] = arr[i];
		}


		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();

	}
	public static void main1(String[] args) {
		System.out.println("Concatination of Arrays");
		int arr[] = {1,2,3};
		int len = arr.length*2;

		int ar[] = new int[len];

		for(int i=0;i<len;i++) {
			if(i<arr.length) {
				ar[i] = arr[i];
				System.out.println("Before : "+ar[i]);
			}
			else{
				ar[i] = arr[i-arr.length];
			}
		}

		for(int m:ar){
			System.out.print(m+" ");
		}
		System.out.println();
	}
}