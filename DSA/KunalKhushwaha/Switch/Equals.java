package KunalKhushwaha.Switch;
import java.util.Scanner;
public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        if(fruit.equals("Mango")){
            System.out.println("King of Fruit");
        }
        if(fruit.equals("Apple")){
            System.out.println("A sweet red fruit");
        }
    }
}
