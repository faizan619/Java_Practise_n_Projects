
@FunctionalInterface
interface A {

    void show();
}

interface B{
    void showB(int a,int b);
}

@FunctionalInterface
interface C{
    int square(int x);
}

@FunctionalInterface
interface Billing{
    double totalPrice(double price,int items);
}

public class JavaLambdaExpression{

    public static void main(String[] args) {
        Billing amount = (double price, int items)->{
            double money = price * items;
            return money;
        };
        double val = amount.totalPrice(10.4,5);
        System.out.println("Total Amount : "+val);
    }

    public static void main1(String[] args) {
        // A name = new A() {
        //     @Override
        //     public void show(){
        //         System.out.println("hello");
        //     }
        // };
        A name = () -> System.out.println("hello");
        name.show();

        // B sums = new B(){
        //     @Override
        //     public void showB(int a,int b){
        //         System.out.println("A+B : "+(a+b));
        //     }
        // };
        B sums = (int a,int b) -> {
                int c = a+b;
                System.out.println("A+B : "+c);
            };
        int a = 10;
        int b = 30;
        sums.showB(a, b);

        C sq = (int h) -> {
            return h*h;
        };
        int val = sq.square(10);
        System.out.println("Square : "+val);
    }
}
