import classes.Joueur;
import classes.Partie;
import enums.CouleurEnum;
import interfaces.Piece;

public class App {
    public static void main(String[] args) throws Exception {
        Piece[][] plateau = new Piece[8][8];
        Joueur joueur1 = new Joueur(CouleurEnum.Blanc);
        Joueur joueur2 = new Joueur(CouleurEnum.Noir);

        Partie partie = new Partie();
        partie.initPartie(joueur1, joueur2, plateau);

        partie.show(plateau);
    }
}
