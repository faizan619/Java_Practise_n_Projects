class Counter{
    // instance variable
    int count;

    public synchronized void increment(){
        this.count++;
    }

}

public class Thread3{
    public static void main(String ag[]){
        System.out.println("Race  Condition in Java");

        Counter c = new Counter();

        // We need to use Reference of interface and object of a class
        Runnable obj1 = new Runnable(){
            public void run(){
                    for(int i=0;i<1000;i++){
                        // System.out.println("Hello");
                        c.increment();
                    }
                }
        };
        
        Runnable obj2 = new Runnable(){
                public void run(){
                    for(int i=0;i<1000;i++){
                        // System.out.println("Hello");
                        c.increment();
                    }
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println("Error 1 :"+e);
        }


        System.out.println("-----------------------------------------------------Count : "+c.count);
    }
}