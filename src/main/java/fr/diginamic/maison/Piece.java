package fr.diginamic.maison;

public abstract class Piece {

    float superficie;
    int etage;
    String piece = "";

    public Piece(float superficie, int etage, String piece) {
        this.superficie = superficie;
        this.etage = etage;
        this.piece = piece;
    }
}
