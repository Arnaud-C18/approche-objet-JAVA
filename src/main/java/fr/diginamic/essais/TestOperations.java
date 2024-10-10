package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {

        Operations operation = new Operations();

        double resultat1 = operation.operation(10,'+',20);
        System.out.println("Résultat de l'opération : " + resultat1);

        double resultat2 = operation.operation(35,'-',15);
        System.out.println("Résultat de l'opération : " + resultat2);

        double resultat3 = operation.operation(11,'*',20);
        System.out.println("Résultat de l'opération : " + resultat3);

        double resultat4 = operation.operation(100,'/',20);
        System.out.println("Résultat de l'opération : " + resultat4);


    }
}
