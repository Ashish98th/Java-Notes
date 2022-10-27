package KunalKhushwaha.Sorting;

public class Insertionsort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 67, 89};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp){
                arr[i]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
