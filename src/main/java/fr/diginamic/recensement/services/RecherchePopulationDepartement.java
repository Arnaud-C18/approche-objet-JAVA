package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez entrer code du département :");
        String codeDepartement = scanner.nextLine();
        int populationRegion = 0;
        boolean departementTrouvee = false;
        for (Ville ville: recensement.getVilles()) {
            if ((ville.getCodeDepartement().equals(codeDepartement))) {
                populationRegion += Integer.parseInt(ville.getPopTotale().replace(" ", ""));
                departementTrouvee = true;
            }
        }
        if (departementTrouvee) {
            System.out.println("Il y a " + populationRegion + " habitants dans ce département.");
        } else {
            System.out.println("Désolé, le département \"" + codeDepartement + "\" n'a pas été trouvée.");
        }
    }
}
