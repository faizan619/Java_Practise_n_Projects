class Laptop{
    String model;
    int price;

    public String toString(){
        return model+" : "+price;
    }

    public boolean equals(Laptop that){
        // if(this.model.equals(that.model) && this.price == that.price){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class EqualToString {
    public static void main(String[] args) {
        Laptop lp = new Laptop();
        lp.model = "dell";
        lp.price = 135656;

        
        Laptop lp1 = new Laptop();
        lp1.model = "dell1";
        lp1.price = 135656;

        boolean res = lp1.equals(lp);
        System.out.println(res);


    }
}
