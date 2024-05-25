package org.RPS.player;

public class PCPlayer extends Player {

    public PCPlayer(String name) {
        super(name);
    }

    @Override
    public void choiceFigure() {
        setCurrentFigure(Figure.getFigure());
    }
}
