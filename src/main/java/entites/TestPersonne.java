package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        Personne personne1 = new Personne("Doe", "Jhon");

        AdressePostale adresse = new AdressePostale(2,"rue de mont",37000,"Tours");
        personne1.setAdresse(adresse);

        personne1.AfficherNomPrenom();

        String adresseVerifie = personne1.getAdresse().toString();
    }
}
