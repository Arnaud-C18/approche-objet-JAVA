package fr.diginamic.salaire;

public class Salarie extends Intervenant {

    float salaireMensuel;

    public Salarie(String nom, String prenom, float salaireMensuel) {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    public float getSalaire() {
        return salaireMensuel;
    }

    @Override
    public String afficherDonnees() {
        return super.afficherDonnees() + "\n" +
                "Salaire mensuel: " +  salaireMensuel + "€\n" +
                "Statut: Salarié";
    }
}
