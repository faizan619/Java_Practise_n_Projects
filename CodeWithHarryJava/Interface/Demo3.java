package Interface;

// class - class -> extends
// class - interface -> implements
// intterface - interface -> extends

interface A{
    void showA();
    void configA();
}

interface B{
    void showB();
}

interface Z extends B{
    
}

// unlike class/extends where we can't able to use multi level inheritance. in interface we can achieved multilevel inheritance
// class C implements A,B{
class C implements A,Z{
    public void showA(){}

    // As we implement Z instead of B still we need to implement showB else showing error.
    public void showB(){}

    public void configA(){}


}

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("");

        A obj;
        obj = new B();
        obj.showA();
        obj.configA();

        // but if we try to call showB then it will show error. it doesn't know what is B method.
        // obj.showB();
    }
}
