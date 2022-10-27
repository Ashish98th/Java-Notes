package KunalKhushwaha.SEARCHING;

public class linearsearchrev {
    public static void main(String[] args) {
        int arr[] = {5,4,6,7,8,9};
        int target = 7;
        int index = searching(arr,target);
        System.out.println(index);
    }
    static int searching(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int index =0;index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
