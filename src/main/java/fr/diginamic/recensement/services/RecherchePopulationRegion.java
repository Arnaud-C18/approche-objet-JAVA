package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez entrer le nom ou le code de la région :");
        String nomOuCodeRegion = scanner.nextLine();
        int populationRegion = 0;
        boolean regionTrouvee = false;
        for (Ville ville: recensement.getVilles()) {
            if ((ville.getNomRegion().equalsIgnoreCase(nomOuCodeRegion) || ville.getCodeRegion().equals(nomOuCodeRegion))) {
                populationRegion += Integer.parseInt(ville.getPopTotale().replace(" ", ""));
                regionTrouvee = true;
            }
        }
        if (regionTrouvee) {
            System.out.println("Il y a " + populationRegion + " habitants dans cette région.");
        } else {
            System.out.println("Désolé, la région \"" + nomOuCodeRegion + "\" n'a pas été trouvée.");
        }
    }
}
