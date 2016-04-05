package kingsheep.team.mtrink2;

import kingsheep.Simulator;
import kingsheep.Type;

public class Wolf extends MTrink2Creature {

    public Wolf(Type type, Simulator parent, int playerID, int x, int y) {
        super(type, parent, playerID, x, y);
    }

    protected void think(Type map[][]) {

        move =  doWolfAction(map);

    }
}
