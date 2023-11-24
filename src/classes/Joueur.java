package classes;

import java.util.HashMap;

import classes.pieces.Pion;
import enums.CouleurEnum;
import interfaces.Piece;

public class Joueur {
    HashMap<int[], Piece> pieces = new HashMap<int[], Piece>();
    HashMap<int[], Piece> pieces_gagnees = new HashMap<int[], Piece>();
    CouleurEnum couleur;

    public Joueur(CouleurEnum _couleur){
        couleur = _couleur;
    }

    public void setPieces(HashMap<int[], Piece> pieces) {
        this.pieces = pieces;
    }
}
