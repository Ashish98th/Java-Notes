package KunalKhushwaha.SEARCHING;

public class Linear_Search {
    public static void main(String[] args) {
    int[] arr;
        arr = new int[]{1, 2, 3, 4, 5};
        int target = 1;
    int ans = linearsearch(arr,target);
        System.out.println(ans);
    }
    static int linearsearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
        //    int element = arr[index];
            if(target==arr[index]){
                return index;
            }
        }
        return -1;
    }

}
