package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Recherche10VillePlusPeupleDepartement extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Entrez le code du département à vérifier: ");
        String codeDepartement = scanner.nextLine();

        if (codeDepartement.length() == 1 ) {
            codeDepartement = "0" + codeDepartement;
        }

        ArrayList<Ville> villes = recensement.getVilles();
        boolean departementTrouve = false;
        ArrayList<Ville> villesTriees = new ArrayList<>();

        for (Ville ville : villes) {
            if (ville.getCodeDepartement().equals(codeDepartement)) {
                villesTriees.add(ville);
            }
        }
        if (!villesTriees.isEmpty()) {
            for (int i = 0; i < villesTriees.size(); i++) {
                if (!villesTriees.get(i).getCodeDepartement().equals(codeDepartement)) {
                    villesTriees.remove(i);
                }
            }

            Collections.sort(villesTriees, new Comparator<Ville>() {
                @Override
                public int compare(Ville ville1, Ville ville2) {
                    if (Integer.parseInt(ville1.getPopTotale().replace(" ", "")) >
                            Integer.parseInt(ville2.getPopTotale().replace(" ", ""))) {
                        return -1;
                    } else if (Integer.parseInt(ville1.getPopTotale().replace(" ", "")) <
                            Integer.parseInt(ville2.getPopTotale().replace(" ", ""))) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            });

            System.out.println("Les 10 villes les plus peuplées du département " + codeDepartement + " :");
            for (int i = 0; i < 10; i++) {
                System.out.println(villesTriees.get(i).getNomCommune() + " avec " + villesTriees.get(i).getPopTotale() + " habitants.");
            }
            System.out.println("\n");
        } else {
            System.out.println("Aucune ville avec le code département " + codeDepartement + " n'est présente dans la liste.");
        }

    }
}