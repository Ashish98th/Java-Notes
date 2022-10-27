package KunalKhushwaha.Array;

public class Sliding_Window {
    public static void main(String[] args) {
        int arr[]={1,9,-1,-2,7,3,-1,2};
        int k=4;
        int max=function(arr,k);
        System.out.println(max);
    }
    static int function(int arr[],int k){
        int maxSum=0,windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        for(int end=k;end<arr.length;end++) {
            windowSum += arr[end] - arr[end - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;

    }
}
