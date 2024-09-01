public class Remove_specialchar_from_string {

    public static void main(String[] args) {
        String B = "#Nil*esh@&";

        String c = B.replaceAll("[^a-zA-z0-9]","");

        System.out.println(c);
    }
}
