package KunalKhushwaha.function;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a=90;
        // int a=99;
        {
            int c=100;
            b=100;
            //int b =78;
            System.out.println(a);
            System.out.println(c);
        }
        //System.out.println(c);
        // c=90;
    }

}
