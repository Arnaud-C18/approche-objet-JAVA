package fr.diginamic.operations;

public class CalculMoyenne {

    double[] tableau = new double[10];
    int index = 0;
    double total = 0;

    public void ajout(double nvNombre) {
        if (index == tableau.length) {
            double[] tableauProvisoire = new double[tableau.length + 10];
            for (int i = 0; i < tableau.length; i++) {
                tableauProvisoire[i] = tableau[i];
            }
            tableau = tableauProvisoire;
        }
        tableau[index] = nvNombre;
        index++;
    }

    public double moyenne() {
        if (index == 0) {
            return 0;
        }
        total = 0;
        for (int i = 0; i < index; i++) {
            total += tableau[i];
        }
        return total / index;
    }
}