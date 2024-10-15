package listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville villeTest = new Ville("Tours", 120_000);
        Ville ville1 = new Ville("Tours", 120_000);
        Ville ville2 = new Ville("Tours", 110_000);
        Ville ville3 = new Ville("Angers", 105_000);

        if (villeTest.equals(ville1)) {
            System.out.println("Il s'agit de la même ville\n");
        }
        System.out.println("Il s'agit de 2 villes différentes\n");

        if (villeTest.equals(ville2)) {
            System.out.println("Il s'agit de la même ville\n");
        }
        System.out.println("Il s'agit de 2 villes différentes\n");

        if (villeTest.equals(ville3)) {
            System.out.println("Il s'agit de la même ville\n");
        }
        System.out.println("Il s'agit de 2 villes différentes\n");
    }
}
