// Custom Exception Part 

// class FaizanException extends Exception{
class FaizanException extends RuntimeException {
    public FaizanException(String string) {
        super(string);
    }
}

// throws keyword part
// class A {
// public void show() {
// try {
// Class.forName("Except31");
// } catch (ClassNotFoundException e) {
// System.out.println("Not Able to find the particular class");
// }
// }
// }

class A {
    // it is called ducking exception 
    public void show() throws ClassNotFoundException {
        Class.forName("Except31");
    }
}

public class Except3 {

    static {
        System.out.println("Class Loader");
    }

    public static void main(String[] args) {

        // Custom Exception Part
        int i = 20;
        int j = 0;

        try {
            i = 18 / i;
            if (j == 0)
                throw new FaizanException("Its my own exception");
        } catch (FaizanException e) {
            j = 18 / 1;
            System.out.println("Manual : " + e);
        } catch (Exception e1) {
            System.out.println("Default : " + e1);
        }
        finally{
            System.out.println("Code Executed Completely");
        }

        // throws keyword part

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
