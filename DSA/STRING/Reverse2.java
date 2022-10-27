package STRING;

public class Reverse2 {
    public static void main(String[] args) {
        String name="Ashish";
        String rev="";

        //using caharcater array
        char a[]=name.toCharArray();
        int len=a.length;
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + a[i];
        }
        System.out.println(rev);
    }
}
