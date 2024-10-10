package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        maison.ajouterPiece(new Chambre(20, 1));
        maison.ajouterPiece(new Cuisine(15, 0));
        maison.ajouterPiece(new Salon(25, 0));
        maison.ajouterPiece(new WC(2, 0));
        maison.ajouterPiece(new SalleDeBain(15, 1));

        System.out.println(maison.getSuperficieTotal());
        System.out.println(maison.getSuperficiePiece("Cuisine"));



    }
}
