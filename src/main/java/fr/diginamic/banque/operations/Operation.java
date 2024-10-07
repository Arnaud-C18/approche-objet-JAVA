package fr.diginamic.banque.operations;

import java.time.LocalDate;

public abstract class Operation {

    int jour = 1;
    int mois = 1;
    int annee = 1;

    public float montant;

    LocalDate date = LocalDate.of(annee, mois, jour);

    public Operation(int annee, int mois, int jour, float montant) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
        this.montant = montant;
    }

    @Override
    public abstract String toString();

    public abstract String getType();
}
