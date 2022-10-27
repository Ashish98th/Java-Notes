package KunalKhushwaha.Sorting;

import static KunalKhushwaha.Sorting.Bubblesort.bubble;

public class Bubblesortrevision {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 67, 89};
        bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
        static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
