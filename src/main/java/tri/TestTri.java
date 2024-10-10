package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestTri {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();

        villes.addAll(Arrays.asList(
                new Ville("Nice", 343000),
                new Ville("Carcassonne", 47800),
                new Ville("Narbonne", 53400),
                new Ville("Lyon", 484000),
                new Ville("Foix", 9700),
                new Ville("Pau", 77200),
                new Ville("Marseille", 850700),
                new Ville("Tarbes", 40600)
        ));

        Collections.sort(villes);

        for (Ville v : villes) {
            System.out.println(v.getNom() + " " + v.getNbHabitants());
        }
    }
}
