package search;
import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the target:");
        int target = sc.nextInt();
        boolean isFound = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                isFound=true;

            }
        }
        if (isFound==true){
            System.out.println("target is found");
        }
        else{
            System.out.println("target not found");
        }
    }
}
