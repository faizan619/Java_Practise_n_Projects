public class Proj5{
	public static void main(String[] args) {
		// int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
		// int arr[] = {0};
		int arr[] = {0,1,0,3,12};
		int alen = arr.length;
		putZerosinLast(arr,alen);
	}

	static void putZerosinLast(int arr[],int alen){
		int temp[] = new int[alen];
		int tempInc = 0;
		for(int i=0;i<alen;i++){
			if(arr[i] != 0){
				temp[tempInc] = arr[i];
				tempInc++;
			}
		}
		for(int m:temp){
			System.out.print(m+" ");
		}
		System.out.println();
	}
}