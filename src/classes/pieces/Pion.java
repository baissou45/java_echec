package classes.pieces;

import java.util.List;

import classes.Position;
import interfaces.Piece;

public class Pion implements Piece {
    int[] position = new int[2];

    // public Pion(int[] _position){
    public Pion(){
        // position = _position;
    }

    @Override
    public void setPosition(int[] position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPosition'");
    }

    @Override
    public List<Position> deplacements(Position position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deplacements'");
    }

}
