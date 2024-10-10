package fr.diginamic.jdr;

public class Personnage extends Entites{

    int score;

    public Personnage() {
        super(12, 18, 20, 50);
        this.score = 0;
    }

    public void deces() {
        System.out.println("Votre personnage est décédé. Il a obtenu le score de " + score + " point(s).\n" +
                "Veuillez créer un nouveau personnage");
    }

    public void setScore(int score){
        this.score += score;
    }

    public int getScore() {
        return score;
    }
}
