package fr.diginamic.banque;

import fr.diginamic.banque.operations.Credit;
import fr.diginamic.banque.operations.Debit;
import fr.diginamic.banque.operations.Operation;

public class TestOperation {
    public static void main(String[] args) {

        float montantGlobal = 0;

        Operation[] tableauOperations = {
                new Debit(2020, 10, 20, 19.70f),
                new Debit(2022, 5, 18, 107.76f),
                new Credit(2023, 11, 2, 205.63f),
                new Credit(2024, 6, 29, 50.75f)
        };

        for (int i = 0; i < tableauOperations.length; i++) {
            System.out.println(tableauOperations[i] + "\n");
            if (tableauOperations[i].getType() == "DEBIT") {
                montantGlobal -= tableauOperations[i].montant;
            } else if (tableauOperations[i].getType() == "CREDIT") {
                montantGlobal += tableauOperations[i].montant;
            }
        }

        String signe = "+";
        if (montantGlobal >= 0) {
            signe = "+";
        } else if (montantGlobal < 0) {
            signe = "-";
        }
        
        System.out.println("Montant global des opérations: " + signe + montantGlobal + " €");
    }
}
