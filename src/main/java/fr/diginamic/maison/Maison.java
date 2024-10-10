package fr.diginamic.maison;

public class Maison {

    public Piece[] maison = new Piece[10];
    int index = 0;

    public void ajouterPiece(Piece piece) {
        if (piece != null && piece.superficie > 0 && piece.etage >= 0) {
            if (index == maison.length) {
                Piece[] tableauProvisoire = new Piece[maison.length + 10];
                for (int i = 0; i < maison.length; i++) {
                    tableauProvisoire[i] = maison[i];
                }
                maison = tableauProvisoire;
            }
            maison[index] = piece;
            index++;
        } else {
            System.out.println("Données incorrect, impossible de créer cette piéce");
        }
    }

    public float getSuperficieTotal() {
        float superficieTotal = 0;
        for (int i = 0; i < index; i++) {
            superficieTotal += maison[i].superficie;
        }
        return superficieTotal;
    }

    public float getSuperficieEtage(int etage) {
        float superficieEtage = 0;
        for (int i = 0; i < index; i++) {
            if (maison[i].etage == etage) {
                superficieEtage += maison[i].superficie;
            }
        }
        return superficieEtage;
    }

    public float getSuperficiePiece(String piece) {
        float superficiePiece = 0;
        for (int i = 0; i < index; i++) {
            if (maison[i].piece == piece) {
                superficiePiece += maison[i].superficie;
            }
        }
        return superficiePiece;
    }

    public float getNombrePiece(String piece) {
        float nombrePiece = 0;
        for (int i = 0; i < index; i++) {
            if (maison[i].piece == piece) {
                nombrePiece += 1;
            }
        }
        return nombrePiece;
    }
}
