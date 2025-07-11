package Step1;

import base.Record;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class JavaCollection{
	public static void main(String ag[]){
		System.out.println("Collections in Java");

		Record line = new Record();
		line.topic("List Collection in Java");

		// // List<String> fruits = new ArrayList<String>();
		// Collection<String> fruits = new ArrayList<String>();
		// fruits.add("banana");
		// fruits.add("mango");
		// fruits.add("grapes");
		// fruits.add("orange");
		// fruits.add("papaya");
		// System.out.println(fruits);

		// for(String m: fruits){
		// 	System.out.println("Fruit : "+m);
		// }		

		// Map<String,Integer> names = new HashMap<String,Integer>();
		Map<String,Integer> names = new Hashtable<>();
		names.put("faizan",23);
		names.put("aneeza",21);
		names.put("rishu",20);
		names.put("janvi",24);
		System.out.println(names);
		System.out.println(names.keySet());
		System.out.println(names.values());

	}
}