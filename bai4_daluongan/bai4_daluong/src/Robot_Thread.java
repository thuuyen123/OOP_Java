import java.time.Duration;
import java.time.Instant;

public class Robot_Thread extends Thread {
    private int idx;
    private int curNumMove;
    private int maxMove;
    private Robot robot;

    public int getIdx() {
        return idx;
    }

    public int getCurNumMove() {
        return curNumMove;
    }

    public int getMaxMove() {
        return maxMove;
    }

    public Robot getRobot() {
        return robot;
    }


    public Robot_Thread(int idx, int curNumMove, Robot robot, int maxMove) {
        this.idx = idx;
        this.curNumMove = curNumMove;
        this.robot = robot;
        this.maxMove = maxMove;

    }

    public Robot_Thread() {
    }

    @Override
    public void run() {
        try {
            Instant start = Instant.now();
            Thread.sleep(3000 * idx);
            boolean moved;
            while (curNumMove < maxMove) {
                System.out.println("Robot " + idx + ", " + "times " + curNumMove + " at " + (Duration.between(start, Instant.now()).toMillis() / 1000) + "s");
                System.out.println("Robot " + idx + ": " + robot);
                // Robot move
                do {

                    E_Move move = E_Move.getRandomMove();
                    int distance = Robot.getRandomDistance();
                    System.out.println("Robot " + idx + ", " +
                            "times " + curNumMove +
                            ",  Move:  " + move +
                            ", Distance: " + distance);
                    moved = robot.move(move, distance);
                    if (!moved) {
                        System.out.println("Move Faileddddddddddddddddddddddddd. Move " + move +
                                ", Distance: " + distance);

                    }
                    System.out.println("Robot " + idx + ": " + robot);
                } while (!moved);
                curNumMove += 1;
                Thread.sleep(5000);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}


