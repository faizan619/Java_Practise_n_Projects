class Mobile{
    String brand;
    int price;
    String network = "5G";
    static String name = "unknown";

    public void show(){
        System.out.println(brand+" is bought at "+price+" of name "+name+" with netowrk "+network);
    }

    public static void show1(Mobile obj){
        System.out.println("This is a Static method");

        // Static method support the static variable and doesn't support the non static variable
        System.out.println(obj.brand+" is bought at "+obj.price+" of name "+name+" with netowrk "+obj.network);
    }
}

public class staticvar {
    public static void main(String[] args) {
        System.out.println("Static Variable In Java");
        Mobile mb1 = new Mobile();
        mb1.brand = "Apple";
        mb1.price = 15000;
        // mb1.name = "I Phone Pro 16";

        Mobile mb2 = new Mobile();
        mb2.brand = "Samsung";
        mb2.price = 14300;
        // mb2.name = "Samsung ultra 5G";

        Mobile.name = "Phone";      // static variable should be called with the class name not the object name;
        mb1.show();
        mb2.show();

        Mobile.show1(mb1);

    }
}
