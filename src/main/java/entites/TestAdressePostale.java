package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 2;
        adresse1.libelleRue = "Avenue Jean Jaures";
        adresse1.codePostal = 37000;
        adresse1.ville = "Tours";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 21;
        adresse2.libelleRue = "Rue Saint-Etienne";
        adresse2.codePostal = 33000;
        adresse2.ville = "Bordeaux";
    }
}
