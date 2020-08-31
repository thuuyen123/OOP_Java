public class CooPoint {
    private int x;
    private int y;

    public CooPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CooPoint() {
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

    @Override
    public String toString() {
        return "robot1.CooPoint{" +
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
    public Direction dir(Direction d, EMove e) {
        if ((d == Direction.POS_X && e == EMove.T_LEFT) || (d == Direction.NEG_X && e == EMove.T_RIGHT)||
                (d == Direction.POS_Y && e == EMove.AHEAD)) {
            return Direction.POS_Y;
        }
        else if ((d == Direction.POS_X && e == EMove.AHEAD) || (d == Direction.NEG_Y && e == EMove.T_LEFT) ||
                (d == Direction.POS_Y && e == EMove.T_RIGHT)){
            return Direction.POS_X;
        }
        else if ((d == Direction.NEG_Y && e == EMove.AHEAD) || (d == Direction.POS_X && e == EMove.T_RIGHT) ||
                (d == Direction.NEG_X && e == EMove.T_LEFT)){
            return Direction.NEG_Y;
        }
        else if ((d == Direction.NEG_X && e == EMove.AHEAD) || (d == Direction.POS_Y && e == EMove.T_LEFT) ||
                (d == Direction.NEG_Y && e == EMove.T_RIGHT)) {
            return Direction.NEG_X;
        }
        else {
            return null;
        }
    }
}
