public class HashCall{
    static int HashFunction (int num){
        return num;}
        public static void main(String [] args){
            int arr[] = {7,9,11,12,4,5};
            int HT[] = new int [20];

            //put+

            for(int i =0;i<arr.length;i++){
                int num = arr[i];
                int index = HashFunction(num);
            HT[index]= num;
        }
            //querying or get

            if(HT[5]==5){
                System.out.println("5 is present");

            }
            else{
                System.out.println("5 is not present");
            }
            if(HT[10]==10){
                System.out.println("10 is present");

            }
            else{
                System.out.println("10 is not present");
        }
    }


}