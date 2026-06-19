public class Task10 {
    public static void main(String[] args) {
        int deqiqe1 = 145;
        int deqiqe2 = 90;
        int deqiqe3 = 200;

        int saat1 = deqiqe1 / 60;
        int qaliq1 = deqiqe1 % 60;

        int saat2 = deqiqe2 / 60;
        int qaliq2 = deqiqe2 % 60;

        int saat3 = deqiqe3 / 60;
        int qaliq3 = deqiqe3 % 60;

        System.out.println(deqiqe1 + " dəqiqə = " + saat1 + " saat " + qaliq1 + " dəqiqə");
        System.out.println(deqiqe2 + " dəqiqə = " + saat2 + " saat " + qaliq2 + " dəqiqə");
        System.out.println(deqiqe3 + " dəqiqə = " + saat3 + " saat " + qaliq3 + " dəqiqə");
    }
}