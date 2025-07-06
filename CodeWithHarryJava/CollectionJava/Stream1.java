import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Stream1 {
    public static void main(String[] args) {
        System.out.println("Stream in Java");

        List<Integer> nums = Arrays.asList(1,9,2,8,3,7,4,6,5);

        // since s1 is used here we can't use this again in foreach now.

        // Stream<Integer> s1 =  nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0,(c,d) -> c+d );

        // or

        int result = nums.stream()
            .filter(n -> n%2 == 0)
            .map(n -> n*2)
            // .sorted()
            .reduce(0,(c,d) -> c+d);



        // stream can only be used one. so if uh try forEach again in this stream s1 then it will show run time error.
        // s3.forEach(n -> System.out.println("Stream : "+n));
        System.out.println("Result : "+result);

        // System.out.println(nums);

        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        // nums.forEach(n -> System.out.println(n));











        // int sum = 0;
        // for(int n:nums){
        //     if(n%2==0){
        //         n = n*2;
        //         sum = sum+n;
        //     }
        // }
        // System.out.println(sum);
    }
}
