import java.util.*;

public class Robot {

    CooPoint current_position;
    Direction cur_dir;
//    Map<CooPoint, Integer> mapCooPoint;

    public Robot() {
        this.current_position = new CooPoint();
        cur_dir = getRandomDirection();
//        mapCooPoint = new HashMap<>();
    }

    public EMove getRandomEmove(){
        Random rd = new Random();
        int pick = rd.nextInt(EMove.values().length);
        return EMove.values()[pick];
    }

    public Direction getRandomDirection(){
        Random rd = new Random();
        int pick = rd.nextInt(Direction.values().length);
        return Direction.values()[pick];
    }

    public int getRandomDis(){
        Random rd = new Random();
        int max = 10000000;
        int min = 10;
        return rd.nextInt(max-min)+min;
    }

    public void randomCoo(){
        Random rd = new Random();
        int max = 2000000000;
        int min = -2000000000;
        current_position.setX(rd.nextInt(max -min)+min);
        current_position.setX(rd.nextInt(max-min)+min);
    }
    public void rmove(){
        EMove move = getRandomEmove();
        int distance = getRandomDis();
        move(move,distance);

    }
    public void move(EMove movee, int distance) {
        Direction newDir = current_position.dir(cur_dir, movee);
        int newX = current_position.getX();
        int newY = current_position.getY();

        if (newDir == Direction.POS_X) {
            newX += distance;
            while (Math.abs(newX)==2000000000 || Math.abs(newY) == 2000000000 ){
                movee = getRandomEmove();
                move(movee,distance);
            }
        }
        else if (newDir == Direction.NEG_X) {
            newX -= distance;
            while (Math.abs(newX)==2000000000 || Math.abs(newY) == 2000000000 ){
                movee = getRandomEmove();
                move(movee,distance);
            }
        }
        else if (newDir == Direction.POS_Y) {
            newY += distance;
            while (Math.abs(newX)==2000000000 || Math.abs(newY) == 2000000000 ){
                movee = getRandomEmove();
                move(movee,distance);
            }
        }
        else if (newDir == Direction.NEG_Y) {
            newY -= distance;
            while (Math.abs(newX)==2000000000 || Math.abs(newY) == 2000000000 ){
                movee = getRandomEmove();
                move(movee,distance);
            }
        }
        current_position = new CooPoint(newX, newY);
        cur_dir = getRandomDirection();
//        if (!mapCooPoint.containsKey(current_position)) {
//            mapCooPoint.put(current_position, 1);
//        } else {
//            mapCooPoint.put(current_position, mapCooPoint.get(current_position)+1);
//        }
    }

    public CooPoint getCurrentPosition() {
        return current_position;
    }

//    public Map<CooPoint, Integer> getMapCooPoint() {
//        return mapCooPoint;
//    }

//    public Set<CooPoint> getMultiPoints() {
//        Set<CooPoint> sc = new HashSet<>();
//        for (Map.Entry<CooPoint, Integer> mape : mapCooPoint.entrySet()) {
//            if (mape.getValue() > 1) sc.add(mape.getKey());
//        }
//        return sc;
//    }


}
