class Math_mod {
    static int modAdd(int a, int b, int m){ return ((a % m) + (b % m)) % m;	}

    static int modMul(int a, int b, int m){ return ((a % m) * (b % m)) % m; }

    public static void main(String[] args)
    {
        int a = 10, b = 20, m = 7;
        System.out.println("Modular Addition: "+ modAdd(a, b, m));

        System.out.println("Modular Subtraction: "+ modSub(a, b, m));
    }

}