package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        personne1.nom = "Doe";
        personne1.prenom = "Jhon";
        personne1.adresse = new AdressePostale();
        personne1.adresse.numeroRue = 2;
        personne1.adresse.libelleRue = "Avenue Jean Jaures";
        personne1.adresse.codePostal = 37000;
        personne1.adresse.ville = "Tours";

        Personne personne2 = new Personne();
        personne2.nom = "Brassens";
        personne2.prenom = "Georges";
        personne2.adresse = new AdressePostale();
        personne2.adresse.numeroRue = 1;
        personne2.adresse.libelleRue = "Bd Camille Blanc";
        personne2.adresse.codePostal = 34200;
        personne2.adresse.ville = "Sète";

    }
}
