package fr.diginamic.recensement;

import fr.diginamic.recensement.services.MenuService;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez entrer le nom de la ville :");
        String nomVille = scanner.nextLine();
        boolean villeTrouvee = false;
        for (Ville ville: recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
                System.out.println("La ville de " + ville.getNomCommune() + " a " + ville.getPopTotale() + " habitants.\n");
                villeTrouvee = true;
                break;
            }
        }
        if (!villeTrouvee) {
            System.out.println("Désolé, la ville de \"" + nomVille + "\" n'a pas été trouvée.\n");
        }
    }
}
