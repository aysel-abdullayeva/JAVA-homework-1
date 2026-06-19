public class Task17 {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        System.out.println(s1.equals(s2));              // true
        System.out.println(s1.equals(s3));              // false boyuk ve kicik
        System.out.println(s1.equalsIgnoreCase(s3));    // true  — Caseni ignor eir
        System.out.println(s1.equals(" test ".trim())); // true  — boslugu goturur

        String s4 = new String("test");
        System.out.println(s1 == s2);   // true
        System.out.println(s1 == s4);   // false ?
    }
}