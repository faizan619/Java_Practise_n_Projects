class tut2{
    int age ;
    String name ;
    String color;

    public tut2(int age,String name,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    public static void main(String args[]){
        System.out.println("Classes and Object in Java");
        tut2 luffy = new tut2(20,"rishu","brown");
        System.out.println(luffy.getName());
        System.out.println(luffy.getColor());
    }
}