package maps;

import listes.Ville;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {

        ArrayList<Ville> listeVilles = new ArrayList<>();
        listeVilles.add(new Ville("Nice", 343000));
        listeVilles.add(new Ville("Carcassonne", 47800));
        listeVilles.add(new Ville("Narbonne", 53400));
        listeVilles.add(new Ville("Lyon", 484000));
        listeVilles.add(new Ville("Foix", 9700));
        listeVilles.add(new Ville("Pau", 77200));
        listeVilles.add(new Ville("Marseille", 850700));
        listeVilles.add(new Ville("Tarbes", 40600));

        HashMap<String, Integer> mapVilles = new HashMap<>();

        for (Ville ville: listeVilles) {
            mapVilles.put(ville.getNom(), ville.getNbHabitants());
        }

        String villePlusBassePop = null;
        int plusBassePop = 0;
        for (Map.Entry<String, Integer> ville : mapVilles.entrySet()) {
            if (plusBassePop == 0 || plusBassePop > ville.getValue()) {
                plusBassePop = ville.getValue();
                villePlusBassePop = ville.getKey();
            }
        }

        mapVilles.remove(villePlusBassePop);

        for(String ville: mapVilles.keySet()) {
            System.out.println(ville);
        }
    }
}
