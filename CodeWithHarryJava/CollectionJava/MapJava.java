import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapJava {
    public static void main(String[] args) {
        System.out.println("Maps in Java");

        // Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>();

        students.put("faizan", 97);
        students.put("aneeza", 94);
        students.put("suja", 97);
        students.put("giridhar", 91);
        students.put("aneeza", 90);

        System.out.println(students.keySet());
        System.out.println(students.values());
        System.out.println(students.size());
        System.out.println(students.containsKey("faizan"));
        System.out.println(students.isEmpty());
        System.out.println(students.replace("suja", 97, 100));
        

        for(String key : students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }

    }
}
