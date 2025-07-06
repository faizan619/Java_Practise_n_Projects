abstract class Tut8_Car{
    public abstract void driving();
    public abstract void fly();
    public abstract void diving();
    public void test(){
        System.out.println("===============Car is Working Properly");
    }
}

abstract class Tut8_Indica extends Tut8_Car{
    public void driving(){
        System.out.println("Indica is Driving");
    }
}

abstract class Tut8_Tata extends Tut8_Indica{
    public void driving(){
        System.out.println("Tata is Driving");
    }
    public void fly(){
        System.out.println("Tata is Flying");
    }
    public void Test_Tata(){
        System.out.println("-------- Testing Tata Properly");
    }
}

class Tut8_Scuba extends Tut8_Tata{
    // public void driving(){
    //     System.out.println("Scuba is Driving");
    // }
    // public void fly(){
    //     System.out.println("Scuba is Flying");
    // }
    public void diving(){
        System.out.println("Scuba is Diving");
    }
}

class Tut8_Elon{
    public void show(){
        System.out.println("This is Elon Class");
    }

    class Elon_Tata{
        public void show(){
            System.out.println("This is Elon Tata Show");
        }
    }

    static class Elon_Lazy{
        public void show(){
            System.out.println("This is Elon Lazy Show");
        }
    }
}

public class Tut8 {
    public static void main(String[] args) {
        System.out.println("Tutorial 8 in java");

        Tut8_Elon rich = new Tut8_Elon();
        rich.show();

        Tut8_Elon.Elon_Tata rich_car = rich.new Elon_Tata(){
            @Override
            public void show(){
                System.out.println("Override Elon Tata Class show");
            };
        };
        rich_car.show();

        Tut8_Elon.Elon_Lazy rich_lazy = new Tut8_Elon.Elon_Lazy();
        rich_lazy.show();


        System.out.println("=====================================");

        // Tut8_Car car1 = new Tut8_Scuba();
        Tut8_Scuba car1 = new Tut8_Scuba();
        car1.diving();
        car1.fly();
        car1.driving();
        car1.test();
        car1.Test_Tata();

        System.out.println("==================================");
        // Tut8_Car car2 = new Tut8_Car(){
        // Tut8_Tata car2 = new Tut8_Scuba(){
        // Tut8_Tata car2 = new Tut8_Tata() {
        Tut8_Indica car2 = new Tut8_Indica() {
            // As all the method is declared so it is not a ananomous class it is Concrete class
            public void driving(){
                System.out.println("Inner Indica is Driving");
            }
          
            @Override
            public void diving(){
                System.out.println("Inner Indica is diving");
            }

            @Override
            public void fly(){
                System.out.println("Ananomous is Flying");
            }

            // @Override
            // public void Test_Tata(){
            //     System.out.println("Inner Tata - indica is Testing");
            // }
        };

        car2.fly();
        car2.test();
        // car2.Test_Tata();
    }
}
