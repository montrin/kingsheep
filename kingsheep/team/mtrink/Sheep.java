package kingsheep.team.mtrink;

import kingsheep.*;

public class Sheep extends UzhShortNameCreature {

    public Sheep(Type type, Simulator parent, int playerID, int x, int y) {
        super(type, parent, playerID, x, y);
    }

    char[] objectives = new char[2];

    protected void think(Type map[][]) {
        int row = this.getY();
        int column = this.getX();
        String sheepID = "SHEEP" + this.getPlayerId();
        objectives[0] = 'r';
        objectives[1] = 'g';

        move = findNearestFood(x, y, map);




//        for(int i = 0; i < map.length; i++) {
//            for(int j = 0; j < map[i].length; j ++) {
//                Type t = map[i][j];
//                if(t.equals('SHEEP2')) {
//                    System.out.println("found my sheep" + t);
//                    System.out.println("found above sheep" + map[i-1][j]);
//                    System.out.println("found below sheep" + map[i+1][j]);
//                }
//            }
//        }
		/*
		TODO

		YOUR SHEEP CODE HERE

		BASE YOUR LOGIC ON THE INFORMATION FROM THE ARGUMENT map[][]

		YOUR CODE NEED TO BE DETERMINISTIC.
		THAT MEANS, GIVEN A DETERMINISTIC OPPONENT AND MAP THE ACTIONS OF YOUR SHEEP HAVE TO BE REPRODUCIBLE

		SET THE MOVE VARIABLE TO ONE TOF THE 5 VALUES
        move = Move.UP;
        move = Move.DOWN;
        move = Move.LEFT;
        move = Move.RIGHT;
        move = Move.WAIT;
		*/
//        move = Move.WAIT;
        System.out.println("MyPos:" + this.getY() + this.getX());
    }

    private Move findNearestFood(int x, int y, Type map[][]) {
            if(y+2 < map.length) {
                if(map[y+2][x].equals(Type.getType(objectives[0])) || map[y+2][x].equals(Type.getType(objectives[1]))) {
                    return Move.DOWN;
                }
            }

            if(y-2 >= 0) {
                if (map[y - 2][x].equals(Type.getType(objectives[0])) || map[y - 2][x].equals(Type.getType(objectives[1]))) {
                    return Move.UP;
                }
            }

            if(x+2 < map[y].length) {
                if (map[y][x + 2].equals(Type.getType(objectives[0])) || map[y][x + 2].equals(Type.getType(objectives[1]))) {
                    return Move.RIGHT;
                }
            }

            if(x-2 >= 0) {
                if (map[y][x - 2].equals(Type.getType(objectives[0])) || map[y][x - 2].equals(Type.getType(objectives[1]))) {
                    return Move.LEFT;
                }
            }


        if(y-2 >= 0) {
            return Move.UP;
        } else if(y+2 < map.length){
            return Move.DOWN;
        } else {
            return Move.LEFT;
        }
    }

}
