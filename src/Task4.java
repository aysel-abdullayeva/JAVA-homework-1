public class Task4 {
    public static void main(String[] args) {
        int yas = 25;                    // Xəta 1: "Int" deyil, "int"
        String seher = "Baku";           // Xəta 2: mətn dırnaq içində olmalıdır
        double kreditMeblegi = 5000;     // Xəta 3: dəyişən adında boşluq olmaz
        boolean aktiv = true;            // Xəta 4: boolean kiçik hərflə: true
        final int LIMIT = 100;
        // LIMIT = 200;                  // Xəta 5: final sabit dəyişdirilə bilməz
        System.out.println(yas);         // Xəta 6: sətir ; ilə bitməlidir, . ilə yox
    }
}
