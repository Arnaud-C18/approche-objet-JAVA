package fr.diginamic.salaire;

public abstract class Intervenant {
    String nom;
    String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract float getSalaire();

    public String afficherDonnees() {
        return nom + " " + prenom;
    }
}
