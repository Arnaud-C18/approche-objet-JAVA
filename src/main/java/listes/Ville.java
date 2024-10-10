package listes;

public class Ville implements Comparable<Ville>{
    String nom;
    int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    //    @Override
//    public int compareTo(Ville autreVille) {
//        if (this.nom.compareTo(autreVille.nom) > 0) {
//            return 1;
//        } else if (this.nom.compareTo(autreVille.nom) < 0) {
//            return -1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Ville autreVille) {
        if (this.nbHabitants > autreVille.nbHabitants) {
            return 1;
        } else if (this.nbHabitants < autreVille.nbHabitants) {
            return -1;
        }
        return 0;
    }
}
