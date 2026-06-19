public class Task8 {
    public static void main(String[] args) {
        int c1 = 0, c2 = 100, c3 = 37;


        double intleBolme1 = c1 * 9 / 5 + 32;
        double intleBolme2 = c2 * 9 / 5 + 32;
        double intleBolme3 = c3 * 9 / 5 + 32;


        double DoubleBolme1 = c1 * 9.0 / 5 + 32;
        double DoubleBolme2 = c2 * 9.0 / 5 + 32;
        double DoubleBolme3 = c3 * 9.0 / 5 + 32;

        System.out.println("int bölmə");
        System.out.println(c1 + "°C = " + intleBolme1 + "°F");
        System.out.println(c2 + "°C = " + intleBolme2 + "°F");
        System.out.println(c3 + "°C = " + intleBolme3 + "°F");

        System.out.println();
        System.out.println("double bölmə");
        System.out.println(c1 + "°C = " + DoubleBolme1 + "°F");
        System.out.println(c2 + "°C = " + DoubleBolme2 + "°F");
        System.out.println(c3 + "°C = " + DoubleBolme3 + "°F");
    }
}