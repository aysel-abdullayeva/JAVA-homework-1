public class Task14 {
    public static void main(String[] args) {
        int n = 84;

        boolean cut       = (n % 2 == 0);
        boolean musbet    = (n > 0);
        boolean bolunur3  = (n % 3 == 0);
        boolean bolunur7  = (n % 7 == 0);
        boolean hem3hem7  = (n % 3 == 0) && (n % 7 == 0);
        boolean araliq  = (n > 10) && (n < 100);

        System.out.println("n = " + n);
        System.out.println("Cütdürmü?         " + cut);
        System.out.println("Müsbətdirmi?      " + musbet);
        System.out.println("3-ə bölünür?      " + bolunur3);
        System.out.println("7-yə bölünür?     " + bolunur7);
        System.out.println("Həm 3, həm 7?     " + hem3hem7);
        System.out.println("10<n<100?         " + araliq);

        System.out.println();


        int n1 = 105;

        boolean cutn1     = (n1 % 2 == 0);
        boolean musbetn1 = (n1 > 0);
        boolean bolunur3n = (n1 % 3 == 0);
        boolean bolunur7n = (n1 % 7 == 0);
        boolean hem3hem7n = (n1 % 3 == 0) && (n1 % 7 == 0);
        boolean araliqN = (n1 > 10) && (n1 < 100);

        System.out.println("n = " + n1);
        System.out.println("Cütdürmü?         " + cutn1);
        System.out.println("Müsbətdirmi?      " + musbetn1);
        System.out.println("3-ə bölünür?      " + bolunur3n);
        System.out.println("7-yə bölünür?     " + bolunur7n);
        System.out.println("Həm 3, həm 7?     " + hem3hem7n);
        System.out.println("10<n<100?         " + araliqN);
    }
}
