package Latest;

class A{

    @Override
    public String toString() {
        return "A []";
    }
    
}
public class LVTI {
    public static void main(String[] args) {
        System.out.println("LVTI - local Variable type interface");

        // if you use a var keyword then it will be compulsory to declare the value
        var age = 22;

        System.out.println(age);

        int num[] = new int[10];

        // in var we don't need to use [] with variable
        var nums = new int[10];

        A obj1 = new A();
        System.out.println(obj1.toString());
        var obj2 = new A();
        System.out.println(obj2.toString());
    }
}
