package listes;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListeInt {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        System.out.println(liste);
        System.out.println(liste.size());

        int max = liste.get(0);
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i) > max) {
                max = liste.get(i);
            }
        }

        int min = liste.get(0);
        int indexMin = 0;
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i) < min) {
                min = liste.get(i);
                indexMin = i;
            }
        }

        liste.remove(indexMin);
        System.out.println(liste);

        ListIterator<Integer> iter = liste.listIterator();
        while (iter.hasNext()) {
            int currentElement = iter.next();
            if (currentElement < 0) {
                iter.set(-currentElement);
            }
        }

        System.out.println(liste);
    }


}
