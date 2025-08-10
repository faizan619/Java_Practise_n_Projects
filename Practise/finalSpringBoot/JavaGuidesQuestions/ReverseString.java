public class ReverseString{
    public static void main(String arg[]){
        System.out.println("Reverse a String");

        String name = "faizan";
        System.out.println("Reverse : "+name);
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
}