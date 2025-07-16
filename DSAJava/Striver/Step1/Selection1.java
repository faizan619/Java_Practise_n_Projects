public class Selection1{
	public static void main(String[] args) {
		
		int arr[] = {13,46,24,52,20,9};
		int arrsize = arr.length;
		System.out.println("Size of array : "+arrsize);


		System.out.println();
		System.out.print("Arrays Before : ");
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();


		for(int i=0;i<arrsize;i++){

			for(int j=1;j<arrsize-i;j++){

				int temp = 0;
				if(arr[i] > arr[arrsize-j]){
					System.out.println();
					System.out.println(arr[i]+" > "+arr[arrsize-j]);
					System.out.println("---------- Swap -----------");
					temp = arr[i];
					arr[i] = arr[arrsize-j];
					arr[arrsize-j] = temp;



					System.out.println("iteration (i): "+i);
					for(int m:arr){
						System.out.print(m+" ");
					}
					System.out.println();

				}

			}

		}


		System.out.print("Final : ");
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();
	}
}