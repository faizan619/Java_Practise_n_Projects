package Interface;

// A class which only has abstract method. so rather than abstract create an interface
// abstract class A{
interface A{

    int age = 44;        // in interface every variable are by default final and static. so we need to initialize those variable also
    // String area; 
    String area = "Mumbai";
    
    
    // in interface every method is by default 'public abstract ' so if uh dont mention also it will assume it like that only
    
    // public abstract void show();
    void show();
    // public abstract void config();    
    void config();    
}

// interface uses implements to extends its property.. and we need to use all the method present in clas A else class B will be treated as `Abstract class B`
class B implements A{
    public void show(){
        System.out.println("in B Show");
    }

    public void config(){
        System.out.println("in B Config");
    }
}

public class inter {
    public static void main(String[] args) {
        System.out.println("Interface in Java");

        A obj;
        // obj = new A();   // it won't work. because interface cannot be object.
        obj = new B();
        obj.show();
        obj.config();


        // interface variable are final and static... and static variable are called with class and not with object.
        System.out.println("Age : "+A.age);
        System.out.println("Place : "+A.area);
        // System.out.println("Place : "+obj.area);     // this method is not recommended.

        // A.area = "Kolkata";      // it is final also so changes can't be happen

    }
}
