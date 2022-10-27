package KunalKhushwaha.SEARCHING;

public class Binarysearchrev {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 7;
        int ans =searching(arr,target);
        System.out.println(ans);
    }
    static int searching(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
         while(start<=end){
             int mid = start+(end-start)/2;
             if(target<mid){
                 end=mid-1;
             }else if(target>mid){
                 start=mid+1;
             }else{
                 return mid;
             }
         }
         return -1;
    }
}
