package classes;

import java.util.HashMap;

import classes.pieces.Pion;
import enums.CouleurEnum;
import interfaces.Piece;

public class Partie {

    public void initPartie(Joueur joueur1, Joueur joueur2, Piece[][] plateau){
        HashMap<int[], Piece> pieces_joueur_1 = new HashMap<int[], Piece>();
        HashMap<int[], Piece> pieces_joueur_2 = new HashMap<int[], Piece>();

        plateau[0][0] = new Pion(); // Initialisation des Tours
        plateau[0][7] = new Pion(); // Initialisation des Tours
        plateau[7][0] = new Pion(); // Initialisation des Tours
        plateau[7][7] = new Pion(); // Initialisation des Tours

        plateau[0][1] = new Pion(); // Initialisation des chevaliers
        plateau[0][6] = new Pion(); // Initialisation des chevaliers
        plateau[7][1] = new Pion(); // Initialisation des chevaliers
        plateau[7][6] = new Pion(); // Initialisation des chevaliers

        plateau[0][2] = new Pion(); // Initialisation des fous
        plateau[0][5] = new Pion(); // Initialisation des fous
        plateau[7][2] = new Pion(); // Initialisation des fous
        plateau[7][5] = new Pion(); // Initialisation des fous

        plateau[0][3] = new Pion(); // Initialisation des Rennes
        plateau[7][3] = new Pion(); // Initialisation des Rennes

        plateau[0][4] = new Pion(); // Initialisation des Rois
        plateau[7][4] = new Pion(); // Initialisation des Rois

        for (int i = 0; i < 8; i++) {
            plateau[1][i] = new Pion(); // Initialisation des Pions du joueur 1
            plateau[6][i] = new Pion(); // Initialisation des Pions du joueur 2
        }

        for (int i = 0; i < 8; i++) {
            // Positionnement des pieces du joueur 1
            int[] position = {0, i};
            Piece piece = plateau[0][i];
            pieces_joueur_1.put(position, piece);

            int[] position_2 = {1, i};
            Piece piece_2 = plateau[1][i];
            pieces_joueur_1.put(position_2, piece_2);

            // Positionnement des pieces du joueur 2
            int[] position_joueur2 = {6, i};
            Piece piece_joueur2 = plateau[0][i];
            pieces_joueur_2.put(position_joueur2, piece_joueur2);

            int[] position_2_joueur2 = {7, i};
            Piece piece_2_joueur2 = plateau[1][i];
            pieces_joueur_2.put(position_2_joueur2, piece_2_joueur2);

            joueur1.setPieces(pieces_joueur_1);
            joueur2.setPieces(pieces_joueur_2);
        }
    }

    public void show(Piece[][] plateau){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(plateau[i][j] == null ? " - " : " # ");
            }
            System.out.print("\n");
        }
    }
}
