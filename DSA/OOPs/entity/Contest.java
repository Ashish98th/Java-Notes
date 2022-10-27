package OOPs.entity;

public class Contest{
    public static void main(String args[]){
    int arr[] = {5,7,8,4,9};


    bubble(arr);
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    }

    static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    }

}
