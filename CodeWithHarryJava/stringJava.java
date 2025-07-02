public class stringJava {
    public static void main(String[] args) {
        System.out.println("String in Java");

        // String name = new String("faizan"); // it works
        String name = "faizan";
        System.out.println("Name : "+name);
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" alam"));

        String n1 = "faizan";
        String n2 = "faizan";

        System.out.println(n1==n2);


        // String buffer 
        StringBuffer sb = new StringBuffer("Faizan");
        System.out.println("Stirng buffer Capacity : "+sb.capacity());
        System.out.println("Stirng buffer length : "+sb.length());
        sb.append(" alam");
        System.out.println("Append : "+sb);

        sb.deleteCharAt(2);
        System.out.println("Delete : "+sb);

        sb.insert(0, "Java");
        System.out.println("insert : "+sb);
        sb.insert(5, "deltasoft");
        System.out.println("insert 2 : "+sb);

        String str = sb.toString();
        System.out.println("Str : "+str);
    }
}
