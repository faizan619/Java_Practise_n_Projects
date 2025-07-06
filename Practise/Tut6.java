import TopicLearn.Br;

public class Tut6 {
    public static void main(String[] args) {
        System.out.println("Tutorial 6 in Java");

        Br next = new Br();
        next.seperate("Aarrays in Java");

        String names[] = new String[10];

        names[0] = "faizan";
        names[1] = "vikash";
        names[2] = "rishu";
        names[3] = "abhishek";
        names[4] = "janvi";
        names[5] = "richit";

        // for(String m:names){
        //     System.out.println("Colleague : "+m);
        // }

        int num[][][] = new int[5][4][6];

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                for(int k=0;k<num[i][j].length;k++){
                    num[i][j][k] = (int)(Math.random()*10);
                }
            }
        }

        // for(int n[][]:num){
        //     for(int m[]:n){
        //         for(int o:m){
        //             System.out.print(o+"");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }

        String fruits[] = {"mango","apple","pineapple","litchy","guvawa","orange","custard apple"};

        // for(String fruit:fruits){
        //     System.out.println("Fruit : "+fruit);
        // }

        int n1[][] = new int[3][];
        n1[0] = new int[5];
        n1[1] = new int[2];
        n1[2] = new int[3];

        for(int i =0;i<n1.length;i++){
            for(int j=0;j<n1[i].length;j++){
                n1[i][j] = (int)(Math.random()*10);
            }
        }

        for(int m1[]:n1){
            for(int m:m1){
                System.out.print(m+" ");
            }
            System.out.println();
        }



    }
}
