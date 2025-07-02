import java.util.Scanner;

class Calculator{
    public double add(double n1,double n2){
        return n1+n2;
    }

    public double add(double n1,double n2,double n3){
        return n1+n2+n3;
    }

    public double sub(double n1,double n2){
        return n1-n2;
    }

    public double mul(double n1,double n2){
        return n1*n2;
    }

    public double mul(double n1,double n2,double n3){
        return n1*n2*n3;
    }

    public double div(double n1,double n2){
        return n1/n2;
    }

}

class Computer{
    public void playMusic(){
        System.out.println("Playing Music");
    }

    public String getMePen(int cost){
        if(cost>10){
            return "Pen";
        }
        else{
            return "no pen";
        }
    }
}

public class Tut2 {
    String name;
    int age;

    public Tut2(String n,int a){
        this.name = n;
        this.age = a;
    }

    public void getName(){
        System.out.println("Your Name is : "+name);
    }

    public int getAge(){
        return age;
    }

    public static void main(String args[]){
        System.out.println("Tutorial 2 In Java"); 

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        Tut2 tt = new Tut2(name,age);
        tt.getName();

        int umar = tt.getAge();
        System.out.println("Age : "+umar);

        // System.out.println("Your Name is "+name+" and age is "+age);

        System.out.print("Enter Num1 Value : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Num2 Value : ");
        double num2 = sc.nextDouble();

        Calculator cal1 = new Calculator();
        double res1 = cal1.add(num1, num2);
        System.out.println("Addition of Num1 and Num2 = "+res1);

        double sub = cal1.sub(num1, num2);
        System.out.println("Subtraction of Num1 and Num2 : "+sub);

        double mul = cal1.mul(num1, num2);
        System.out.println("Multiplication of Num1 and Num2 : "+mul);

        double div = cal1.div(num1, num2);
        System.out.println("Division of Num1 and Num2 : "+div);
        
        Computer com = new Computer();

        com.playMusic();
        String rr = com.getMePen(20);
        System.out.println("Pen : "+rr);

        sc.close();

    }
}
