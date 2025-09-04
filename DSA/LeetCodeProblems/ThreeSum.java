import java.util.*;
public class ThreeSum{
	public static void main(String[] args) {
		System.out.println("Three Sum LeetCode");

		List<List<Integer>> result = new ArrayList<>();
		int nums[] = {-1, 0, 1, 2, -1, -4};

		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				for(int k=0;k<nums.length;k++) {
					if(nums[i]+nums[j]+nums[k] == 0) {
						List<Integer> tri = new ArrayList<>();
						tri.add(nums[i]);
						tri.add(nums[j]);
						tri.add(nums[k]);
						result.add(tri);
					}
				}
			}
		}

		System.out.println();
		for(int m[] :result) {
			for(int n:m) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		System.out.println();

	}
}