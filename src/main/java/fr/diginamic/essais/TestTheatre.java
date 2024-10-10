package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();

        theatre.inscrire(100,10.20f);
        theatre.inscrire(50,15f);
        theatre.inscrire(50,17f);
        theatre.inscrire(20,20f);

        System.out.println("Total de clients: " + theatre.totalClients + "\n" +
                "Recette: " + theatre.recette);
    }
}
