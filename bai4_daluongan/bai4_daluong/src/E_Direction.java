import java.util.Random;

public enum E_Direction {
    POS_X,
    POS_Y,
    NEG_X,
    NEG_Y,
    NONE;

    public static E_Direction getRandomDirection(){
        Random rd = new Random();
        int pick = rd.nextInt(E_Direction.values().length - 1);
        return E_Direction.values()[pick];
    }
}
