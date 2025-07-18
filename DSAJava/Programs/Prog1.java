public class Prog1{
	public static void main(String[] args) {
		// System.out.println("Program to find largest number in array");
		// int arr[] = {4,7,2,3,9,1,8};
		// int num = 0;
		// for(int i=0;i<arr.length;i++){
		// 	if(arr[i] > num){
		// 		num = arr[i];
		// 	}
		// }
		// System.out.println("Largest Number is : "+num);

		System.out.println("Program to find Smallest number in array");
		int arr[] = {4,7,2,3,9,8};
		int num = arr.length;
		for(int i=0;i<arr.length;i++){
			if(arr[i] < num){
				num = arr[i];
			}
		}
		System.out.println("Smallest Number is : "+num);
	}
}