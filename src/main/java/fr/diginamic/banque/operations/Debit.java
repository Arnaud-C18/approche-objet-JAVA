package fr.diginamic.banque.operations;

public class Debit extends Operation{

    public Debit(int annee, int mois, int jour, float montant) {
        super(annee, mois, jour, montant);
    }

    public String toString() {
        return  "DEBIT\n" +
                "Date de l'opération: " + jour + "/" + mois + "/" + annee + "\n" +
                "Montant: -" + montant + " €";
    }

    @Override
    public String getType() {
        return "DEBIT";
    };
}
