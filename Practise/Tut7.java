class T7{
    public void show(){
        System.out.println("in T7 show");
    }
}
abstract class Tu7{
    public abstract void show7();
}

class Tu7A extends Tu7{
    public void show7(){
        System.out.println("This is Abstract show 7");
    }
}

public class Tut7 {
    public static void main(String[] args) {
        System.out.println("Tutorial 7 in Java");

        T7 obj0 = new T7(){
            @Override
            public void show(){
                System.out.println("inner T7");
            }
        };
        obj0.show();

        Tu7A obj1 = new Tu7A();
        obj1.show7();

        Tu7 obj2 = new Tu7A(){
            @Override
            public void show7(){
                System.out.println("This is inner ananomous show7");
            }
        };
        obj2.show7();

    }
}
