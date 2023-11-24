package interfaces;


import java.util.List;

import classes.Position;

public interface Piece {
    public void setPosition(Position position);
    public List<Position> deplacements(Position position);
}
