import java.util.Random;

public enum Direction {
    POS_X,
    POS_Y,
    NEG_X,
    NEG_Y;
    public Direction getRandomDirection(){
        Random rd = new Random();
        int pick = rd.nextInt(Direction.values().length);
        return Direction.values()[pick];
    }
}
