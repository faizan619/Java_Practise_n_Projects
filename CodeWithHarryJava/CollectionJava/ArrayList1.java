import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList1{
    public static void main(String ag[]){
        System.out.println("Collection in Java");

        // the <Integer> are called generics it is use to avoid runtime error. so that error comes in compile time error if any.

        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();      // with list you can fetch value using index number but not in case of collection.
        nums.add(10);
        nums.add(30);
        nums.add(35);
        nums.add(40);
        nums.add(45);
        System.out.println("Value at index 3 : "+nums.get(3));
        System.out.println("Index of 35 : "+nums.indexOf(35));

        System.out.println(nums);
        for(int n:nums){
            System.out.println("number : "+n);
        }
    }
}