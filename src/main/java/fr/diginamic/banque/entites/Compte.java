package fr.diginamic.banque.entites;

public class Compte {
    protected String numeroCompte;
    protected float soldeCompte;

    public Compte(String numeroCompte, float soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Numéro de compte: " + numeroCompte + "\n" +
                "Solde du compte: " + soldeCompte + " €";
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSoldeCompte(float soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}
