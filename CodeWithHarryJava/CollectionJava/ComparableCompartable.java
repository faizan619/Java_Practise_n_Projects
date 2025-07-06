import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}

public class ComparableCompartable {
    public static void main(String[] args) {
        System.out.println("Comparable vs Compartable in Java");

        
        List<Student> nums1 = new ArrayList<>();
        nums1.add(new Student(23, "faizan"));
        nums1.add(new Student(21, "aneeza"));
        nums1.add(new Student(22, "wase"));
        nums1.add(new Student(25, "rishu"));
        nums1.add(new Student(21, "atul"));

        System.out.println("Students : "+nums1);
        for(Student s:nums1){
            System.out.println(s);
        }

        // Comparator<Student> com1 = new Comparator<Student>() {
        //     public int compare(Student i , Student j){
        //         if (i.age > j.age) {
        //             return 1; 
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };
        Comparator<Student> com1 = (Student i , Student j) -> {
                // if (i.age > j.age) {
                //     return 1; 
                // }
                // else{
                //     return -1;
                // }
                return i.age > j.age ? 1:-1;
            };

        Collections.sort(nums1,com1);
        System.out.println("Sorted Students : "+nums1);
        





        // ----------------------------------------------------------------------------------------------



        List<Integer> nums = new ArrayList<>();
        nums.add(14);
        nums.add(41);
        nums.add(28);
        nums.add(53);
        nums.add(36);
        
        System.out.println(nums);

        // the sort function directly sort based on both value. but if we want to sort based on the second digit then Comparator function class is used

        // other challenge. instead of int take string value and sort the string based on the length of the string.
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i , Integer j){
                if (i%10 > j%10) {
                    return 1; 
                }
                else{
                    return -1;
                }
            }
        };
        
        // Collections.sort(nums);
        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
