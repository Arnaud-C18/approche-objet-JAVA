package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class Recherche10DepartementPlusPeuple extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Créer une HashMap pour stocker le code du département et le nombre d'habitants
        HashMap<String, Integer> departements = new HashMap<>();

        // Boucler sur chaque ville pour ajouter la population au département correspondant
        for (Ville ville : recensement.getVilles()) {
            String codeDepartement = ville.getCodeDepartement();
            int nbHabitantsVille = Integer.parseInt(ville.getPopTotale().replace(" ", ""));

            // Si le département est déjà dans la HashMap, ajouter les habitants de la ville
            if (departements.containsKey(codeDepartement)) {
                departements.put(codeDepartement, departements.get(codeDepartement) + nbHabitantsVille);
            } else {
                // Sinon, ajouter un nouvel enregistrement pour ce département
                departements.put(codeDepartement, nbHabitantsVille);
            }
        }

        // Convertir la HashMap en une List d'entrées (Map.Entry)
        List<Map.Entry<String, Integer>> listeTriee = new ArrayList<>(departements.entrySet());

        // Trier la liste par la valeur (nombre d'habitants) dans l'ordre décroissant
        listeTriee.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        // Afficher les 10 départements les plus peuplés
        System.out.println("Les 10 départements les plus peuplés :");
        for (int i = 0; i < 10 && i < listeTriee.size(); i++) {
            Map.Entry<String, Integer> entry = listeTriee.get(i);
            System.out.println("Département " + entry.getKey() + " : " + entry.getValue() + " habitants");
        }
    }
}