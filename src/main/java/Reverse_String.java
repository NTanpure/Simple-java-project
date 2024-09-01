public class Reverse_String {

    public static void main(String[] args) {



    String A = "Nilesh";
    String B = " ";

    for (int i =A.length()-1;i>=0; i--){

        B = B + A.charAt(i);
    }
    System.out.println(B);
}}
