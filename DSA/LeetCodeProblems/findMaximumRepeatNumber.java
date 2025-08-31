public class findMaximumRepeatNumber{
	public static void main(String[] args) {
		System.out.println("Find Maximum Repeated Number");
		int nums[] = {2,2,2,1,1,1,1,1,4,4,2,1,1,1,4,4,4};
		// int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};


		int candidate = -1;
		int count = 0;
		for(int m:nums) {
			if(count == 0) {
				candidate = m;
			}
			count += (m==candidate)? 1: -1;
		}

		System.out.println("Candidate : "+candidate);
	}
}