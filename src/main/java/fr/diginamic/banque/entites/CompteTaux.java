package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    protected float tauxRemuneration;

    public CompteTaux(String numeroCompte, float soldeCompte, float tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Taux de rémunération: " + tauxRemuneration + "%";
    }

    public float getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(float tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
