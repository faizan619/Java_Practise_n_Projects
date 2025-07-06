import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {
    public static void main(String[] args) {
        System.out.println("Set in Java");

        // Set<Integer> nums = new HashSet<Integer>();     // this doesn't give sorted value.. to get sorted value use TreeSet
        // Set<Integer> nums = new TreeSet<Integer>(); 
        Collection<Integer> nums = new TreeSet<Integer>(); 
        nums.add(10);
        nums.add(30);
        nums.add(35);
        nums.add(40);
        nums.add(45);
        nums.add(30);

        // System.out.println("Index of 35 : "+nums.indexOf(35));       // set dont have index value so this will give error

        Iterator<Integer> values =   nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }
        values.remove();
        System.out.println(nums);

        // System.out.println(nums);
        // for(int n:nums){
        //     System.out.println("number : "+n);
        // }
    }
}
