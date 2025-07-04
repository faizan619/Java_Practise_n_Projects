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

public class AbstractInner {
    public static void main(String[] args) {
        System.out.println("AbstractInner Class in Java");

        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playlist();

    }
}
