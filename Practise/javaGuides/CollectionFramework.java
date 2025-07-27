import java.util.*;

public class CollectionFramework {

	public static void main(String[] args) {
		System.out.println();
		// ArrayListTopic();
		System.out.println();
		// LinkListTopic();
		System.out.println();
		// StackTopic();
		System.out.println();
		// VectorTopic();
		System.out.println();
		// HashSetTopic();
		System.out.println();
		// LinkedHashSet();
		System.out.println();
		// TreeSetTopic();
		System.out.println();
		// HashMapTopic();
		System.out.println();
		// LinkedHashMapTopic();
		System.out.println();
		HashTableTopic();
	}

	static void HashTableTopic(){
		Map<String,Integer> table = new Hashtable<>();
		table.put("Apple",1);
		table.put("Banana",2);
		table.put("Grapes",3);
		System.out.println("Fruits : "+table);
		// same as HashMap
	}

	static void LinkedHashMapTopic(){
        Map<String, Integer> map = new LinkedHashMap<>();
		// Same as HashMap
	}

	static void HashMapTopic(){
		Map<String,Integer> prices = new HashMap<>();
		prices.put("Banana",200);
		prices.put("Apple",150);
		prices.put("Litchy",120);
		prices.put("Grapes",160);
		prices.put("guwava",500);
		prices.put("guwava",700);
		System.out.println("Fruits Prices : "+prices);
		System.out.println("Price of Apple : "+prices.get("Apple"));
		prices.remove("Litchy");
		System.out.println("Fruits Prices : "+prices);
		for(String key: prices.keySet()){
            System.out.println(key + ": " + prices.get(key));
		}

		System.out.println("Does the HashMap contain 'Banana'? " + prices.containsKey("Banana"));
		System.out.println("Does the HashMap contain value 3? " + prices.containsValue(160));

	}

	static void TreeSetTopic(){
		Set<String> fruits = new TreeSet<>();
		// Same as ArrayList
	}

	static void LinkedHashSet(){
		Set<String> fruits = new LinkedHashSet<>();
		// Same as ArrayList
	}

	static void HashSetTopic(){
		Set<String> fruits = new HashSet<>();
		// Same as ArrayList
	}

	static void VectorTopic(){
		Vector<String> fruits = new Vector<>();
		// it is same as ArrayList but it is thread safe
	}

	static void StackTopic(){
		Stack<String> users = new Stack<>();
        users.push("Faizan");
        users.push("Salman");
        users.push("Maroof");
        users.push("shifa");
        users.push("zubiya");
        
        System.out.println("Users : "+users);
        
        System.out.println("Peek  user : "+users.peek());
        System.out.println("Removing Element : "+users.pop());
        // System.out.println("Users : "+users);
        for(String m:users){
            System.out.print(m+" ");
        }
        System.out.println();
        
        System.out.println("User Faizan Present : "+users.contains("Faizan"));
        
        System.out.println("shifa Index : "+users.search("shifa"));
        
        System.out.println("Is Empty? ; "+users.isEmpty());
	}

	static void LinkListTopic(){
		List<String> fruits = new LinkedList<>();
		fruits.add("mango");
		fruits.add("pineapple");
		fruits.add("grapes");
		// fruits.add("banana");
		// fruits.add("papaya");
		// fruits.add("lemon");

		List<String> addFruits = Arrays.asList("banana","papaya","lemon","beetroot","guwava","tomato");
		fruits.addAll(addFruits);
		System.out.println("All Fruits : "+fruits);
		List<String> removeFruits = Arrays.asList("papaya","beetroot");
		fruits.removeAll(removeFruits);
		System.out.println("After Removing : "+fruits);
	}

	static void ArrayListTopic() {
		List<Integer> numbers = new ArrayList<>();
		// Adding Element
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(13);
		// System.out.println("Numbers : "+numbers);

		// Adding Element from Other List
		// List<String> favourite =
		// List.of("Apple","Mango","Banana","Grapes","Orange","litchy","papaya");
		// List<String> fruits = new ArrayList<String>(favourite);

		List<String> fruits = new ArrayList<>(
				Arrays.asList("Apple", "AMango", "Banana", "AGrapes", "Orange", "Alitchy", "papaya"));
		// System.out.println("Fruits : " + fruits);

		// Accessing Element
		// System.out.println("Checking the fruits List is Empty or Not :
		// "+(fruits.isEmpty() ? "fruits List is Empty":"Fruits List is not Empty"));
		// System.out.println("Size of Fruit List : "+fruits.size());
		// System.out.println("Value of fruit in index 3 : "+fruits.get(2));

		// Removing Element
		// fruits.remove(0);
		// System.out.println("Fruits After Removing index 0 : "+fruits);

		// List<String> removeFruits = Arrays.asList("Mango","Banana","Grapes");
		// fruits.removeAll(removeFruits);
		// System.out.println("Fruits after Remove All : "+fruits);

		// Removing Element based on the Matching
		// fruits.removeIf(fruit -> fruit.startsWith("A"));
		// System.out.println("Fruits Remove after Matching : "+fruits);

		// fruits.clear();
		// System.out.println("Fruits After Clear : "+fruits);

		// iterating Element using Loop
		// for(int i=0;i<fruits.size();i++){
		// System.out.print(fruits.get(i)+" ");
		// }
		// System.out.println();

		// for(String m:fruits){
		// System.out.println(m+" ");
		// }

		// Searching for Elements
		// System.out.println("Index of Mango : "+fruits.indexOf("AMango"));
		// System.out.println("last Index of Mango : "+fruits.lastIndexOf("AMango"));
		// System.out.println("does List contain Orange ? "+fruits.contains("Orange"));
		// System.out.println("does List contain Jack ? "+fruits.contains("Jack"));

		// List<Person> users = new ArrayList<>();
		// users.add(new Person("faizan",23));
		// users.add(new Person("aneeza",22));

		// List<Person> newUser = Arrays.asList(new Person("shifa",24),new
		// Person("Salman",21),new Person("Maroof",25));

		// users.addAll(newUser);
		// System.out.println("Users : "+users);

		// Collections.sort(fruits);

		// ((ArrayList<String>) fruits ).addFirst("Faizan");
		// ((ArrayList<String>) fruits ).addLast("Alam");

		// System.out.println(fruits);
		List<Task> task = new ArrayList<>();
		
		task.add(new Task("working with spring boot",false));
		task.add(new Task("learning ReactJs",true));
		System.out.println(task);

		List<Task> multiTask = Arrays.asList(new Task("practise mysql",false),new Task("practise php",false),new Task("practise Laravel",true));
		task.addAll(multiTask);
		System.out.println(task);
	}
}

class Task {
	private String task;
	private Boolean isUrgent;

	public Task(String task, Boolean isUrgent) {
		this.task = task;
		this.isUrgent = isUrgent;
	}

	@Override
	public String toString() {
		return "Task : " + task + " - Priority :" + isUrgent;
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[ Name : " + name + " , Age : " + age + " ]";
	}
}