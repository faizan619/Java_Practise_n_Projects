interface Computer {
    void code();    
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding in laptop");
    };
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding in Desktop");
    }
}

class Phone implements Computer{
    public void code(){
        System.out.println("Coding in Phone");
    }
}

class Developer{
    public void devOps(Computer lap){
        lap.code();

    }
}

public class Tut9{
    public static void main(String[] args) {
        System.out.println("Interface in Java");

        Computer cml = new Laptop();
        Computer cmd = new Desktop();
        Computer cmp = new Phone();

        Developer faizan = new Developer();
        faizan.devOps(cml);

    }
}