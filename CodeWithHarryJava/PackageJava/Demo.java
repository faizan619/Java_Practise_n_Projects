package PackageJava;

// import PackageJava.tools.SciCalc;
import PackageJava.tools.*;

public class Demo {
    public static void main(String[] args) {

        System.out.println("Demo In Java");

        // Dynamic Method Dispatch in Java
        Calc cl1 = new SciCalc();   // we can use dynamic dispatch only if the child object is inheriting from parent object. Calc -> AdvCalc -> SciCalc

        int res1 = cl1.sum(10,40);
        System.out.println("Response 1 : "+res1);

        var i = 10;
        System.out.println(i);

    }
}
