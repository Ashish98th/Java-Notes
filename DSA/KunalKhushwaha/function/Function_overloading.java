package KunalKhushwaha.function;

import org.w3c.dom.ls.LSOutput;

public class Function_overloading {
    public static void main(String[] args) {
        fun(67);fun("Rahul");
    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
