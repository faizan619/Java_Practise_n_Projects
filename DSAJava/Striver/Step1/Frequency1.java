import java.util.Scanner;
public class Frequency1 {
    
    public static void main(String ag[]){
        Scanner sc = new Scanner(System.in);

        int nums[] = {2,4,3,2,5,7,3,2,4,2};

        System.out.print("Enter Search Numebr");
        int searchTerm = sc.nextInt();

        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == searchTerm){
                count++;
            }
        }

        System.out.println(searchTerm+" is repeated : "+count+" times");
 
        // int hash[] = new int[12];
        // for(int i=0;i<nums.length;i++){
        //     hash[nums[i]] += 1;
        // }

        // while(true){
        //     System.out.print("Enter Number ( 0 - Exit ) : ");
        //     int n = sc.nextInt();

        //     if(n==0){   break;  }
        //     System.out.println(hash[n]);
        // }
        

    }
}
