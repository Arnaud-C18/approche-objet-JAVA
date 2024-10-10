package fr.diginamic.jdr;

public abstract class Entites {
    int force;
    protected int pointsDeVie;

    public Entites(int forceMin, int forceMax, int pointsDeVieMin, int pointsDeVieMax) {
        this.force = (int)(Math.random() * (forceMax - forceMin + 1)) + forceMin;
        this.pointsDeVie = (int)(Math.random() * (pointsDeVieMax - pointsDeVieMin + 1)) + pointsDeVieMin;
    }

    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }
}
