package OOPs.packagefile;

public class Example {
    public static void main(String[] args) {
        Abc ex = new Abc();

        //setting attributes
        ex.x =100;
        System.out.println(ex.x);

        Def ex2 = new Def();
        ex2.y =99;
        System.out.println(ex2.y);
    }
}

class Abc{
    int x;  //properties\Attributes of class Abc
}
