package KunalKhushwaha.Sorting;

public class InsertionsortK {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        insertionk(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void insertionk(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }

}
