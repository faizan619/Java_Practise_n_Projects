public class Tut3 {
    static String name = "faizan alam";
    public String getName(){
        return name;
    }

    public void getFullName(){
        System.out.println("The User Name is  : "+name);
    }

    public static void getFullName1(){
        System.out.println("The User Name is 1 : "+name);
    }

    public static void main(String[] args) {
        System.err.println("Tutorial 3 in Java");
        Tut3 tt = new Tut3();
        System.out.println("Name : "+tt.getName());
        System.out.println("Idle Name : "+Tut3.name);
        System.out.println("Idle Name 1 : "+name);

        tt.getFullName();
        Tut3.getFullName1();
        getFullName1();

    }
}
