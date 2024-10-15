package fr.diginamic.recensement;

import fr.diginamic.recensement.services.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) throws IOException {
        ArrayList<Ville> villes = new ArrayList<>();
        Path path = Path.of("C:/Users/Travail/Downloads/recensement.csv");

        // Lire toutes les lignes du fichier
        List<String> lignes = Files.readAllLines(path);

        // Parcourir les lignes à partir de la 2ème (ignorer la première ligne d'en-tête)
        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i);
            // Séparer les données par des virgules
            String[] donnees = ligne.split(";");

            // Créer un objet Ville avec les données extraites
            Ville ville = new Ville(
                    donnees[0], //Code de la region
                    donnees[1], //Nom Region
                    donnees[2], // Code du departement
                    donnees[5], // Code de la commune
                    donnees[6], // Nom de la commune
                    donnees[9]// Population totale
            );

            // Ajouter l'objet Ville à la liste
            villes.add(ville);
        }

        // Créer l'objet Recensement avec la liste des villes
        Recensement recensement = new Recensement(villes);

        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        System.out.println(
                "1: Population d’une ville donnée\n" +
                "2: Population d’un département donné\n" +
                "3: Population d’une région donnée\n" +
                "4: Afficher les 10 régions les plus peuplées\n" +
                "5: Afficher les 10 départements les plus peuplés\n" +
                "6: Afficher les 10 villes les plus peuplées d’un département\n" +
                "7: Afficher les 10 villes les plus peuplées d’une région\n" +
                "8: Afficher les 10 villes les plus peuplées de France\n" +
                "9: Sortir\n"
        );

        while (menu != 9) {
            System.out.println("Veuillez entrer un chiffre :");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    RecherchePopulationVille recherchePopVille = new RecherchePopulationVille();
                    recherchePopVille.traiter(recensement, scanner);
                    break;
                case 2:
                    RecherchePopulationDepartement recherchePopDepartement = new RecherchePopulationDepartement();
                    recherchePopDepartement.traiter(recensement, scanner);
                    break;
                case 3:
                    RecherchePopulationRegion recherchePopRegion = new RecherchePopulationRegion();
                    recherchePopRegion.traiter(recensement, scanner);
                    break;
                case 4:
                    Recherche10RegionPlusPeuple recherche10RegionPlusPeuple = new Recherche10RegionPlusPeuple();
                    recherche10RegionPlusPeuple.traiter(recensement, scanner);
                    break;
                case 5:
                  Recherche10DepartementPlusPeuple recherche10DepartementPlusPeuple = new Recherche10DepartementPlusPeuple();
                  recherche10DepartementPlusPeuple.traiter(recensement, scanner);
                  break;
                case 6:
                  Recherche10VillePlusPeupleDepartement recherche10VillePlusPeupleDepartement = new Recherche10VillePlusPeupleDepartement();
                  recherche10VillePlusPeupleDepartement.traiter(recensement, scanner);
                  break;
                case 7:
                  Recherche10VillePlusPeupleRegion recherche10VillePlusPeupleRegion = new Recherche10VillePlusPeupleRegion();
                  recherche10VillePlusPeupleRegion.traiter(recensement, scanner);
                  break;
                case 8:
                  Recherche10VillePlusPeuple recherche10VillePlusPeuple = new Recherche10VillePlusPeuple();
                  recherche10VillePlusPeuple.traiter(recensement, scanner);
                  break;
                default:
                    break;
            }
        }
    }
}

