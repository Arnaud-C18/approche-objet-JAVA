package fichier;

public class Commune {
    String nom;
    String codeDepartement;
    String nomRegion;
    String popTotale;

    public Commune(String nom, String codeDepartement, String nomRegion, String popTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.popTotale = popTotale;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public String getPopTotale() {
        return popTotale;
    }
}
