import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class SumDistanceRobot {
    public static double sumDistance(Robot mainRobot, List<Robot> otherRobots) {
        double sum = 0;
        CooPoint mainPos = mainRobot.cur_position;
        for (int i = 0; i < otherRobots.size(); i++) {
            CooPoint ortherPos = otherRobots.get(i).cur_position;
            sum += CooPoint.distance(mainPos,ortherPos);
        }
        return sum;
    }
}
