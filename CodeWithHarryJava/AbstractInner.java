abstract class Car{
    // A Abstract method can only be used in abstract class but an abstract class can be used without abstract method.
    abstract void drive();

    public abstract void fly();

    public void playlist(){
        System.out.println("Plat Music");
    }
}

abstract class WagonR extends Car{
    // If we are extending an abstract class then it is necessary to define the abstract method
    public void drive(){
        System.out.println("wagonR is Driving");
    }

    // public void fly(){
    //     System.out.println("WajgonR is Flying");
    // }
}

class UpdatedWagonR extends WagonR{         // it is also called as concrete class
    public void fly(){
        System.out.println("Flying..");
    }
}

// We can't make obj of an abstract class 
abstract class Indica extends Car{
    // If you can't able to use all the method of extended abstract class then make it abstract.
    public void drive(){
        System.out.println("Indica is Driving");
    }
}


// Inner Part Start from here
class A{
    int age;

    public void show(){
        System.out.println("in A Class");
    }

    class B{
        public void configB(){
            System.out.println("In A.B Config");
        }
    }

    static class C{
        public void configC(){
            System.out.println("In A.C Config");
        }
    }
}


public class AbstractInner {

    public static void main(String[] args) {
        System.out.println("AbstractInner Class in Java");
        
        // Abstract method code
        System.out.println("Abstract Method-------------");
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playlist();
        
        // Inner Method Code
        System.out.println("Inner Method-------------");
        A obj1 = new A();
        obj1.show();

        A.B obj2 = obj1.new B();
        obj2.configB();

        // below thing only work if the class is declared as Static class else use upper method.
        A.C obj3 = new A.C();
        obj3.configC();

    }
}
