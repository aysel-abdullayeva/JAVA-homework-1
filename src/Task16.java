public class Task16 {
    public static void main(String[] args) {
        String metn = " Salam, ABB Bank! ";

        System.out.println("Uzunluq (trim-siz): " + metn.length());
        System.out.println("Uzunluq (trim-li):  " + metn.trim().length());
        System.out.println("Böyük hərflə:      " + metn.toUpperCase());
        System.out.println("Kiçik hərflə:      " + metn.toLowerCase());
        //System.out.println(""ABB" var mi?      " + metn.contains("ABB"));
        //System.out.println(""bank" var mi?     " + metn.contains("bank"));
        System.out.println("Əvəz edilmiş:      " + metn.replace("Bank", "Kredit"));
        //System.out.println(" "Salam" ilə başlayır mi? " + metn.trim().startsWith("Salam"));


        System.out.println(metn.contains("ABB"));
        System.out.println(metn.contains("bank"));
        System.out.println(metn.trim().startsWith("Salam"));    }
}