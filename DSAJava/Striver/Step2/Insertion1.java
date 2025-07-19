public class Insertion1{
	public static void main(String[] args) {
		int arr[] = {9,14,15,12,6,8,13};
		int alen = arr.length;
		for(int i=0;i<alen;i++){
			int j=i;
			while(j>0 && arr[j-1] > arr[j]){
				int swap = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = swap;
				j--;
			}
			System.out.println();
		}

		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();
	}
}