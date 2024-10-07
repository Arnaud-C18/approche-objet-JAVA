package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBanque {
    public static void main(String[] args) {

        Compte[] tableauDeComptes = new Compte[2];
        tableauDeComptes[0] = new Compte("1fqf23", 8593.23F);
        tableauDeComptes[1] = new CompteTaux("25fsx3", 2645.75F, 2F);
        // Ou Compte[] tableauDeComptes = new Compte {new Compte("1fqf23", 8593.23F), new CompteTaux("25fsx3", 2645.75F, 2F)};

        for (int i = 0; i < tableauDeComptes.length ; i++) {
            System.out.println(tableauDeComptes[i] + "\n");
        }
        //Ou System.out.println(Arrays.toString(tableauDeComptes));
    }
}
