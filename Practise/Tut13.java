import java.util.ArrayList;
// import java.util.List;
import java.util.Collection;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;
import java.util.Hashtable;
import java.util.Map;

public class Tut13{
	public static void main(String ag[]){
		Map<String,Integer> faizan = new Hashtable<>();
		faizan.put("English",98);
		faizan.put("Maths",99);
		faizan.put("Hindi",91);
		faizan.put("History",90);
		System.out.println("keySet() : "+faizan.keySet());
		System.out.println("values() : "+faizan.values());
		for(String key:faizan.keySet()){
			System.out.println(key+" : "+faizan.get(key));
		}


        System.out.println(faizan.keySet());
        System.out.println(faizan.values());
        System.out.println(faizan.size());
        System.out.println(faizan.containsKey("faizan"));
        System.out.println(faizan.isEmpty());
        System.out.println(faizan.replace("suja", 97, 100));

	}

	public static void main_Set(String ag[]){
		System.out.println("Tutorial 13 in Java");
		// Collection<String> fruits = new TreeSet<String>();
		// Collection<String> fruits = new HashSet<String>();
		Set<String> fruits = new HashSet<String>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("papaya");
		fruits.add("mango");

		System.out.println("All fruit set : "+fruits);

	}

	public static void main_Array(String ag[]){
		System.out.println("Tutorial 13 in Java");

		// Array List in Java

		// List<String> fruits = new ArrayList<String>();
		// Collection<String> fruits = new ArrayList<String>();
		Collection<String> fruits = new ArrayList<String>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("papaya");

		System.out.println("All Element in Fruits : "+fruits);
		System.out.println("Size of Fruit Array : "+fruits.size());
		for(String m: fruits){
			System.out.println("fruit : "+m);
		}
		System.out.println("Fruits contain mango ? : "+fruits.contains("mango"));
		System.out.println("Fruits contain apple ? : "+fruits.contains("apple"));
		System.out.println("is the Fruits is empty? : "+fruits.isEmpty());



		fruits.clear();
		System.out.println("All Element in Fruits : "+fruits);
		System.out.println("is the Fruits is empty? : "+fruits.isEmpty());
	}
}