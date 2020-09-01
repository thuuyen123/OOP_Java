import java.util.Random;

public enum E_Move {
    AHEAD,
    T_LEFT,
    T_RIGHT;

    public static E_Move getRandomMove() {
        Random rd = new Random();
        int pick = rd.nextInt(E_Move.values().length);
        return E_Move.values()[pick];
    }
}

