package KunalKhushwaha.function;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        Swapping(a,b);
        System.out.println(a+" "+b);
    }
    static void Swapping(int a,int b){
        int temp=a;
        b=a;
        b=temp;

    }
}


//public class Swap {
//    public static void main(String[] args) {
//        getsumoftwo(10,20);
//        // System.out.println(sumoftwo);
//    }
//    static void getsumoftwo(int a,int b){
//        int sum =a+b;
//      //  return sum;
//        System.out.println(sum);
//    }
//}