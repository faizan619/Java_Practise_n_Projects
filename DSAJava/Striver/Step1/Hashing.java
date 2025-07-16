import java.util.Scanner;
public class Hashing{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Size of Array : ");
		int arrsize = sc.nextInt();

		int arr[] = new int[arrsize];
		for(int i=0;i<arrsize;i++){
			System.out.print("Enter Number : ");
			arr[i] = sc.nextInt();
			System.out.println();
		}

		int hash[] = new int[14];
		for(int i=0;i<arrsize;i++){
			hash[arr[i]] += 1;
		}


		while(true){	
			System.out.print("What Number count you want to search (0 - exit) : ");
			int searchNum = sc.nextInt();	
			if(searchNum == 0){
				break;
			}
			System.out.println(hash[searchNum]);
		}
	}
}