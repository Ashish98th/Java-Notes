package SORTING;

public class Selectionsort {
    public static void main(String[] args) {
        int arr[] = {38,52,9,18,6,62,13};
        sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void sorting(int arr[]){
         for(int i=0;i<arr.length;i++){
             int min =i;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<arr[min]){
                     min =j;
                 }
             }
             int temp= arr[min];
             arr[min] = arr[i];
             arr[i] = temp;
         }
    }
}
