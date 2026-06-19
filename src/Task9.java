public class Task9 {
    public static void main(String[] args) {
        int say = 583;

        int yuzler = say / 100;
        int onlar = (say % 100) / 10;
        int birler = say % 10;
        int cem = yuzler + onlar + birler;

        System.out.println("Ədəd: " + say);
        System.out.println("Yüzlər: " + yuzler);
        System.out.println("Onlar:  " + onlar);
        System.out.println("Birlər: " + birler);
        System.out.println("Cəm:    " + cem);

        System.out.println();


        int say2 = 907;

        int yuzler2 = say2 / 100;
        int onlar2 = (say2 % 100) / 10;
        int birler2 = say2 % 10;
        int cem2 = yuzler2 + onlar2 + birler2;

        System.out.println("Ədəd: " + say2);
        System.out.println("Yüzlər: " + yuzler2);
        System.out.println("Onlar:  " + onlar2);
        System.out.println("Birlər: " + birler2);
        System.out.println("Cəm:    " + cem2);
    }
}