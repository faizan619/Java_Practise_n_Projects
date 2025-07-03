
// final class Calc{        // it prevent it extends in other class...
class Calc{
    // public final void show(){   // it prevent it to create other same method. or prevent method overriding
    public void show(){   
        System.out.println("In Calc Show");
    }
    public void add(int n1,int n2){
        System.out.println("Add : "+(n1+n2));
    }
}

class AdvCalc extends Calc{
    public void show(){
        System.out.println("In AdvCalc Show");
    }
}

public class FinalKey {
    public static void main(String[] args) {
        System.out.println("Final Keyword in Java");
        final double PIE = 3.14;
        System.out.println("Pie Value : "+PIE);

        Calc obj = new Calc();
        obj.show();
        obj.add(10,40);
    }
}
