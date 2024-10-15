package fr.diginamic.recensement;

public class Ville {
    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nomCommune;
    private String popTotale;

    public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune, String popTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.popTotale = popTotale;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public String getPopTotale() {
        return popTotale;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }
}
