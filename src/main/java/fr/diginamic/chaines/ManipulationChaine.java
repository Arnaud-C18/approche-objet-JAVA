package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {
    static String chaine = "Durand;Marcel;2 523.5";

    public static void main(String[] args) {

        System.out.println(chaine.charAt(0));
        System.out.println(chaine.length());
        System.out.println(chaine.indexOf(";"));
        String nomDeFamille = chaine.substring(0,chaine.indexOf(";"));
        System.out.println(nomDeFamille);
        System.out.println(nomDeFamille.toUpperCase());
        System.out.println(nomDeFamille.toLowerCase());

        String[] personne = chaine.split(";");
        for (int i = 0; i < personne.length; i++) {
            System.out.println(personne[i]);
        }

        double salaire = Double.parseDouble(personne[2].replace(" ", ""));

        Salarie salarie1 = new Salarie(personne[0], personne[1], salaire);
    }
}
