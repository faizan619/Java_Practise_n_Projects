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

class Classes{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public int add(int n1,int n2){
        return n1+n2;
    }

    public double add(double n1,double n2){
        return n1+n2;
    }
}
public class tut4 {
    public static void main(String[] args) {
        System.out.println("Methods in Java");

        Classes cls = new Classes();
        int res1 = cls.add(10,20,30);
        System.out.println("Result 1 : "+res1);
        int res2 = cls.add(100,200);
        System.out.println("Result 2 : "+res2);
        double res3 = cls.add(1.1,2.2);
        System.out.println("Result 3 : "+res3);
    }
}
