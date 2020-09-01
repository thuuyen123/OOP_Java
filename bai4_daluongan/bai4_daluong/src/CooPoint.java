public class CooPoint {
    private int x;
    private int y;

    public CooPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double distance(CooPoint a, CooPoint b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public String toString() {
        return "CooPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public static E_Direction getNewDirection(E_Direction curDir, E_Move e) {
        if ((curDir == E_Direction.POS_X && e == E_Move.T_LEFT) || (curDir == E_Direction.NEG_X && e == E_Move.T_RIGHT) ||
                (curDir == E_Direction.POS_Y && e == E_Move.AHEAD)) {
            return E_Direction.POS_Y;
        } else if ((curDir == E_Direction.POS_X && e == E_Move.AHEAD) || (curDir == E_Direction.NEG_Y && e == E_Move.T_LEFT) ||
                (curDir == E_Direction.POS_Y && e == E_Move.T_RIGHT)) {
            return E_Direction.POS_X;
        } else if ((curDir == E_Direction.NEG_Y && e == E_Move.AHEAD) || (curDir == E_Direction.POS_X && e == E_Move.T_RIGHT) ||
                (curDir == E_Direction.NEG_X && e == E_Move.T_LEFT)) {
            return E_Direction.NEG_Y;
        } else if ((curDir == E_Direction.NEG_X && e == E_Move.AHEAD) || (curDir == E_Direction.POS_Y && e == E_Move.T_LEFT) ||
                (curDir == E_Direction.NEG_Y && e == E_Move.T_RIGHT)) {
            return E_Direction.NEG_X;
        } else {
            return E_Direction.NONE;
        }
    }
}
