interface Tut10_A {
    int age = 22;
    String name = "Admin";

    void Tut10_show();

    void Tut10_config();
}

class Tut10_B implements Tut10_A {

    public void Tut10_show() {
        System.out.println("Tutorial 10 in Show");
    }

    public void Tut10_config() {
        System.out.println("Tutorial 10 in Configuration");
    }
}

@FunctionalInterface
interface Tut10_Test1 {
    void Tut10_Test_show();
}

@FunctionalInterface
interface Tut10_Test2 extends Tut10_Test1 {
    // public void Tut10_Test2_show();
}

class Tut10_Test3 implements Tut10_Test2{
    @Override
    public void Tut10_Test_show(){
        System.out.println("------- Testing ---------- show");
    };

    public void showing_Tut10(){
        System.out.println("Other testing -----------------");
    }
}

public class Tut10 {
    public static void main(String[] args) {
        System.out.println("Tutoral 10 in Java");

        Tut10_A obj1 = new Tut10_B();
        System.out.println(Tut10_A.age);
        System.out.println(Tut10_A.name);
        obj1.Tut10_show();
        obj1.Tut10_config();

        // Tut10_Test1 obj2 = new Tut10_Test1() {
        // public void Tut10_Test_show(){
        // System.out.println("This is the Tut10 Test show method");
        // }
        // };

        Tut10_Test1 obj2 = () -> {
            System.out.println("This is the Tut10 Test show method");
        };

        // obj2.Tut10_Test_show();

        // Tut10_Test2 obj3 = new Tut10_Test2() {
        //     @Override
        //     public void Tut10_Test_show() {
        //         System.out.println("This is the Tut10 Test show method");
        //     }
        // };

        Tut10_Test2 obj3 = () -> {
                System.out.println("This is the Tut10 Test show method");
            };

        obj3.Tut10_Test_show();

        Tut10_Test3 obj4 = new Tut10_Test3();
        obj4.Tut10_Test_show();
        obj4.showing_Tut10();

    }
}
