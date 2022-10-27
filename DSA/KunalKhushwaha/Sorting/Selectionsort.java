package KunalKhushwaha.Sorting;

public class Selectionsort {
    public static void main(String[] args) {
        int arr[] = {1,4,5,67,89};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void sorting(int []arr){
        for(int i=0;i<arr.length;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    int temp=arr[j];
                    arr[j] = arr[min];
                    arr[min] =temp;
                }
            }

        }
    }
}
