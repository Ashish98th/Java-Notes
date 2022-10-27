class Main {
    public static void main(String[]args){
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = new String ("ABC");

        if(s1==s3){
            System.out.println("YES");
        }
        else {
            System.out.println("No");
        }
         if (s1.equals(s3)){
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
        }

/*
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3); */
    }
}
