import java.util.*;

public class CollectionFramework{

	public static void main(String[] args) {
		System.out.println();
		ArrayListTopic();	
		System.out.println();
	}

	static void ArrayListTopic(){
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
		// List<String> favourite = List.of("Apple","Mango","Banana","Grapes","Orange","litchy","papaya");
		// List<String> fruits = new ArrayList<String>(favourite);

		List<String> fruits = new ArrayList<>(Arrays.asList("Apple","AMango","Banana","AGrapes","Orange","Alitchy","papaya"));
		System.out.println("Fruits : "+fruits);

		// Accessing Element
		// System.out.println("Checking the fruits List is Empty or Not : "+(fruits.isEmpty() ? "fruits List is Empty":"Fruits List is not Empty"));
		// System.out.println("Size of Fruit List : "+fruits.size());
		// System.out.println("Value of fruit in index 3 : "+fruits.get(2));

		// Removing Element
		// fruits.remove(0);
		// System.out.println("Fruits After Removing index  0 : "+fruits);

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
		// 	System.out.print(fruits.get(i)+" ");
		// }
		// System.out.println();

		// for(String m:fruits){
		// 	System.out.println(m+" ");
		// }

		// Searching for Elements
		// System.out.println("Index of Mango : "+fruits.indexOf("AMango"));
		// System.out.println("last Index of Mango : "+fruits.lastIndexOf("AMango"));
		// System.out.println("does List contain Orange ? "+fruits.contains("Orange"));
		// System.out.println("does List contain Jack ? "+fruits.contains("Jack"));


		List<Person> users = new ArrayList<>();
		users.add(new Person("faizan",23));
		users.add(new Person("aneeza",22));

		List<Person> newUser = Arrays.asList(new Person("shifa",24),new Person("Salman",21),new Person("Maroof",25));

		users.addAll(newUser);
		System.out.println("Users : "+users);
	}
}

class Person{
		private String name;
		private int age;
		public Person(String name,int age){
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString(){
			return "[ Name : "+name+" , Age : "+age+" ]";
		}
	}