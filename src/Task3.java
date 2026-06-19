public class Task3 {
    public static void main(String[] args) {
        final int MIN_KREDIT = 300;
        final int MAX_KREDIT = 50000;
        final double ILLIK_FAIZ = 10.9;
        final String BANK_ADI = "ABB";
        final int MAX_MUDDET = 60;

        System.out.println("Min kredit:    " + MIN_KREDIT + " AZN");
        System.out.println("Max kredit:    " + MAX_KREDIT + " AZN");
        System.out.println("İllik faiz:    " + ILLIK_FAIZ + " %");
        System.out.println("Bank:          " + BANK_ADI);
        System.out.println("Max müddət:    " + MAX_MUDDET + " ay");

       // MIN_KREDIT = 500; //cannot assign a value to final variable MIN_KREDIT
       // ILLIK_FAIZ = 10.9; //  cannot assign a value to final variable ILLIK_FAIZ
    }
}