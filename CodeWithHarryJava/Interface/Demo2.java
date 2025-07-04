package Interface;

// class Computer{
//     public void code(){}
// }

// abstract class Computer{
//     public abstract void code();
// }

interface Computer {
    void code();
}

// class Laptop extends Computer{
class Laptop implements Computer{
    public void code(){
        System.out.println("Code . Compile . Execute");
    }
}

// class Desktop extends Computer{
class Desktop implements Computer{
    public void code(){
        System.out.println("Code . Compile . Execute . Faster");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Need of Interface");

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer faizan = new Developer();
        faizan.devApp(desk);

    }
}
