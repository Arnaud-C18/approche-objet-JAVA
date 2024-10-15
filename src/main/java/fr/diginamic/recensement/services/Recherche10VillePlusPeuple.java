package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Recherche10VillePlusPeuple extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        ArrayList<Ville> villesTriees = recensement.getVilles();
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

        // Afficher les 10 villes les plus peuplées
        System.out.println("Les 10 villes les plus peuplées :");
        for (int i = 0; i < 10; i++) {
            System.out.println(villesTriees.get(i).getNomCommune() + " avec " + villesTriees.get(i).getPopTotale() + " habitants.");
        }
        System.out.println("\n");
    }
}
