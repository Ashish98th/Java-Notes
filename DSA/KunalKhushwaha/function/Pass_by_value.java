package KunalKhushwaha.function;

public class Pass_by_value {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";

        change(name);
    }

    static void change(String naam){
        System.out.println(naam);
    }
}
