import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("User input in Java");

        InputStreamReader in = new  InputStreamReader(System.in);
        BufferedReader bg= new BufferedReader(in);

        // int num = System.in.read();
        int num = Integer.parseInt(bg.readLine());

        System.out.println("You Enter : "+num);
    }
}
