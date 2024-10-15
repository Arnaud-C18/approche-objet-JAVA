package fr.diginamic.recensement;

import java.util.ArrayList;

public class Recensement {

    private ArrayList<Ville> villes;

    public Recensement(ArrayList<Ville> villes) {
        this.villes = villes;
    }

    public ArrayList<Ville> getVilles() {
        return villes;
    }
}
