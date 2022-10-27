package CollectionFramework;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> li = new ArrayList<>();
        li.add(6);
        li.add(7);
        li.add(4);
        li.add(0,5);
        li.add(0,1);

        boolean contain=li.contains(27);
        System.out.println(contain);
        System.out.println(li.indexOf(7));
        System.out.println(li.indexOf(10));
        li.set(2,44);
       for(int i=0;i<li.size();i++){
           System.out.println(li.get(i));
       }
    }
}
