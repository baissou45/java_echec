package interfaces;


import java.util.List;

import classes.Position;

public interface Piece {
    public void setPosition(int[] position);
    public List<Position> deplacements(Position position);

    // test
    public char getType();
}
