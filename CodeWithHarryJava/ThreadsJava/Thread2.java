class A implements Runnable{
    // In Every threads we need to have a run method
    public void run(){
        for(int i=0;i<5;i++){
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

// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("Hello");
//             try{
//                 // Waiting stage in threads
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 System.out.println("Error : "+e);
//             }
//         }
//     }
// }


public class Thread2 {
    public static void main(String[] args) {
        System.out.println("Runnable vs Threads in Java");
        
        // A obj1 = new A();
        // B obj2 = new B();
        
        // We need to use Reference of interface and object of a class
        Runnable obj1 = new A();
        // Runnable obj2 = new B();
        
        Runnable obj2 = new Runnable(){
                public void run(){
                    for(int i=0;i<5;i++){
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
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
