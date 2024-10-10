package entites;

public class Theatre {

    String nom = "Le grand Theatre";
    int capaciteMax = 200;
    public int totalClients = 0;
    public float recette = 0;

    public void inscrire(int nbClients, float prixPlace) {
        if (nbClients <= (capaciteMax-totalClients)) {
            totalClients += nbClients;
            recette += nbClients * prixPlace;
        } else {
            System.out.println("Il n'y a plus assez de places dans le theatre");
        }
    }
}
