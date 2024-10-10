package listes;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Nice");
        liste.add("Carcassonne");
        liste.add("Narbonne");
        liste.add("Lyon");
        liste.add("Foix");
        liste.add("Pau");
        liste.add("Marseille");
        liste.add("Tarbes");

        String plusLong = liste.get(0);
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i).length() > plusLong.length()) {
                plusLong = liste.get(i);
            }
        }
        System.out.println(plusLong);

        for (int i = 0; i < liste.size(); i++) {
            liste.set(i,liste.get(i).toUpperCase());
        }
        System.out.println(liste);

        ListIterator<String> iter = liste.listIterator();
        while (iter.hasNext()) {
            Character premier = iter.next().charAt(0);
            if (premier == 'N') {
                iter.remove();
            }
        }
        System.out.println(liste);
    }
}
