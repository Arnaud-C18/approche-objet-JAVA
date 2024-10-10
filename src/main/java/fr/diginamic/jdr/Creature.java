package fr.diginamic.jdr;

public class Creature extends Entites{

    String nom;

    public Creature(int forceMin, int forceMax, int pointsDeVieMin, int pointsDeVieMax, String nom) {
        super(forceMin, forceMax, pointsDeVieMin, pointsDeVieMax);;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
