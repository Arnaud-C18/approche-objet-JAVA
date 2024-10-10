package listes;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> liste = new ArrayList<>();
        liste.add(new Ville("Nice", 343000));
        liste.add(new Ville("Carcassonne", 47800));
        liste.add(new Ville("Narbonne", 53400));
        liste.add(new Ville("Lyon", 484000));
        liste.add(new Ville("Foix", 9700));
        liste.add(new Ville("Pau", 77200));
        liste.add(new Ville("Marseille", 850700));
        liste.add(new Ville("Tarbes", 40600));

        Ville ville = liste.get(0);
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i).nbHabitants > ville.nbHabitants) {
                ville = liste.get(i);
            }
        }
        System.out.println(ville.nom + ": " + ville.nbHabitants + " habitants\n");

        int indexMin = 0;
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i).nbHabitants < liste.get(indexMin).nbHabitants) {
                indexMin = i;
            }
        }
        liste.remove(indexMin);

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i).nom);
        }
        System.out.println("\n");

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).nbHabitants > 100000) {
                liste.get(i).nom = liste.get(i).nom.toUpperCase();
            }
        }

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i).nom);
        }
    }
}
