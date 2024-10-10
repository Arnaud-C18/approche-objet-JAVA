package fr.diginamic.operations;

public class Operations {

    double resultat;

    public double operation(double a, char signe, double b) {
        if (signe == '+') {
            resultat = a +b;
        } else if (signe == '-') {
            resultat = a - b;
        } else if (signe == '*') {
            resultat = a * b;
        } else if (signe == '/' && b != 0) {
            resultat = a / b;
        }
        return resultat;
    }
}
