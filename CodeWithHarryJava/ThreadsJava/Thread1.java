class A extends Thread{
    // In Every threads we need to have a run method
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hii");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Error : "+e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                // Waiting stage in threads
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Error : "+e);
            }
        }
    }
}

public class Thread1{
    public static void main(String[] args) {
        System.out.println("Threads in Java");

        A obj1 = new A();
        B obj2 = new B();

        // obj2.setPriority(10);
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(Thread.MIN_PRIORITY);


        // in thread we run by using start();
        obj1.start();
        obj2.start();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
    }
}