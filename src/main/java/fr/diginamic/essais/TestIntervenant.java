package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {

        Intervenant salarie = new Salarie("Dupond", "Maurice", 1700);
        System.out.println(salarie.getSalaire());
        System.out.println(salarie.afficherDonnees());

        Intervenant pigiste = new Pigiste("Dupont", "Antoine", 10, 150 );
        System.out.println(pigiste.getSalaire());
        System.out.println(pigiste.afficherDonnees());
    }
}
