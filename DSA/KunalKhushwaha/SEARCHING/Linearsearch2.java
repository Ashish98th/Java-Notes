
package KunalKhushwaha.SEARCHING;

public class Linearsearch2 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 2, 3, 4, 5};
        int target = 8  ;
        int ans = linearsearch(arr,target);
        System.out.println(ans);
    }
    static int linearsearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

}

