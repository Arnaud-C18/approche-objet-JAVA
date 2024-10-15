package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();

//        StringBuilder nombres = new StringBuilder();
//        for (int i = 1; i < 100001; i++) {
//            nombres.append(i);
//        }

        String nombres = "";
        for (int i = 1; i < 100001; i++) {
            nombres += i;
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
    }
}
