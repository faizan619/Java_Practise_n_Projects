import java.util.*;

public class FindMajorElement{
	public static void main(String[] args) {
		System.out.println("Finding majority 2");

		int nums[] = {5,2,3,2,2,2,2,5,5,5};
		// int nums[] = {1,2};


		System.out.println("nums.length/3 = "+nums.length/3);

		List<Integer> newnum = new ArrayList<>();

		int candidate1 = Integer.MIN_VALUE;
		int candidate2 = Integer.MIN_VALUE;
		int count1 = 0;
		int count2 = 0;

		for(int m:nums) {
			System.out.println("Loop : "+m);
			if(m==candidate1){
				count1++;
			}
			else if(m==candidate2){
				count2++;
			}
			else if(count1 == 0){
				candidate1 = m;
				count1++;
				System.out.println("Candidate1 Value Putted in Loop");
			}
			else if(count2 == 0){
				candidate2 = m;
				count2++;
				System.out.println("Candidate2 Value Putted in Loop");
			}
			else{
				count1--;
				count2--;
			}
		}

		System.out.println("Candidate1 = "+candidate1);
		System.out.println("Candidate2 = "+candidate2);



		count1 = 0;
		count2 = 0;
		for(int n:nums){
			if(n == candidate1) count1++;
			else if(n == candidate2) count2++;
		}

		System.out.println("Count1 = "+count1+" | Count2 = "+count2);
		int threshold = nums.length/3;
		if(count1>threshold){
			newnum.add(candidate1);
			System.out.println("Candidate1 Added");
		}
		if(count2>threshold){
			newnum.add(candidate2);
			System.out.println("Candidate2 Added");
		}

		for(int o:newnum) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
}