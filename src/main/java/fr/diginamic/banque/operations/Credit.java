package fr.diginamic.banque.operations;

public class Credit extends Operation{

    public Credit(int annee, int mois, int jour, float montant) {
        super(annee, mois, jour, montant);
    }

    public String toString() {
        return  "CREDIT\n" +
                "Date de l'opération: " + jour + "/" + mois + "/" + annee + "\n" +
                "Montant: +" + montant + " €";
    }

    @Override
    public String getType() {
        return "CREDIT";
    };
}
