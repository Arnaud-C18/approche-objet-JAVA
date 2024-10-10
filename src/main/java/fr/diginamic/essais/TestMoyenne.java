package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne calcul = new CalculMoyenne();

        calcul.ajout(10);
        calcul.ajout(15);

        double moyenneActuelle = calcul.moyenne();
        System.out.println(moyenneActuelle);

        calcul.ajout(12);
        calcul.ajout(20);

        moyenneActuelle = calcul.moyenne();
        System.out.println(moyenneActuelle);
    }
}
