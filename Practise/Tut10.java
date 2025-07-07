interface Tut10_A{
    int age = 22;
    String name = "Admin";
    void Tut10_show();
    void Tut10_config();
}

class Tut10_B implements Tut10_A{

    public void Tut10_show(){
        System.out.println("Tutorial 10 in Show");
    }

    public void Tut10_config(){
        System.out.println("Tutorial 10 in Configuration");
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
        
    }
}
