class A{
    public void show(){
        System.out.println("in A show");
    }
}

abstract class B{
    public abstract void showB();
}

// class C extends B{
//     public void showB(){
//         System.out.println("Abstract Extend B.C");
//     }
// }

public class AnanomousJ {
    public static void main(String[] args) {
        System.out.println("Ananomous Class in Java");

        // It is a Inner Class and it create class file without name i.e it is called Ananomous Class.
        A obj1 = new A(){
            public void show(){
                System.out.println("In New Show");
            }
        };
        obj1.show();


        // B obj2 = new C(){
        B obj2 = new B(){
            // If you want to use inner or abstract class only once then use the ananomous inner class.
            public void showB(){
                System.out.println("Inner Abstract show");
            }
        };
        obj2.showB();
    }
}
