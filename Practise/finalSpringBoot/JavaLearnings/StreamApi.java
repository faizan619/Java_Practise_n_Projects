
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        // List<Integer> nums = Arrays.asList(12,13,15,17,14,16,18,20,22,24,26,28,30);
        List<Integer> nums = List.of(7,5,3,1,2,4,6,8);

        // Creating the Stream
        Stream<Integer> data = nums.stream();

        // Once the Stream is Used We can't reuse the stream again
        Stream<Integer> sortedStream = data.sorted();
        Stream<Integer> findOdd = sortedStream.filter(n -> n%2==1);
        Stream<Integer> maping = findOdd.map(n -> n*2);
        // maping.forEach(n -> System.out.println(n));
        maping.reduce(0, (c,m) -> c+m);
        // final.forEach(n -> System.out.println(n));
        

        System.out.println("======================================");

        nums.stream().filter(n -> n%2 == 1).sorted().map(n -> n*2).reduce(0,(c,m)->c+m);

         


        // data.forEach(n -> System.out.println(n));       // as stream already used so we can't use it again


        // for (Integer n : nums) {
        //     System.out.println("Number : "+n);
        // }
    }
}
