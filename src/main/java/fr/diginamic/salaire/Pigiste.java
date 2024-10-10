package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

    int totalJours;
    float tauxJournalier;

    public Pigiste(String nom, String prenom, int totalJours, float tauxJournalier) {
        super(nom, prenom);
        this.totalJours = totalJours;
        this.tauxJournalier = tauxJournalier;
    }

    @Override
    public float getSalaire() {
        return totalJours * tauxJournalier;
    }

    @Override
    public String afficherDonnees() {
        super.afficherDonnees();
        return super.afficherDonnees() + "\n" +
                "Salaire mensuel: " +  totalJours * tauxJournalier + "€\n" +
                "Statut: Pigiste";
    }
}
