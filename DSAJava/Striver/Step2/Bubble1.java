public class Bubble1{
	public static void main(String[] args) {
		System.out.println("Bubble Sort in Java");

		int arr[] = {13,46,24,52,20,9};
		int alen = arr.length;
		for(int i=0;i<alen;i++){

			// System.out.println("i = "+i+" alen =  "+alen+" / alen-i = "+(alen-i));

			for(int j=0;j<alen-i-1;j++){
				// System.out.println("j = "+j+" / alen-i-1 = "+(alen-i-1));


				
				for(int m:arr){
					System.out.print(m+" - ");
				}
				System.out.println();
				System.out.println("iteration (j) : "+j+" taking ["+arr[j]+" >> "+arr[j+1]+" ]");

				int swap = 0;
				if(arr[j] > arr[j+1]){
					swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}

			System.out.println("iteration (i) : "+i);
			for(int m:arr){
				System.out.print(m+" - ");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}


		System.out.println();
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();

	}
}