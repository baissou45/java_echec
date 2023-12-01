package classes.pieces;

import java.util.List;

import classes.Position;
import interfaces.Piece;

public class Pion implements Piece {
    int[] position = new int[2];
    char type;

    public Pion(){
        // position = _position;
    }

    public Pion(char _type){
        type = _type;
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public char getType() {
        return type;
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
