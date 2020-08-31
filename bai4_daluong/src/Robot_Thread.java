

public class Robot_Thread extends Thread {


    Robot robot;

    public Robot_Thread(Robot robot) {
        this.robot = robot;
    }

    public Robot_Thread() {
    }

    
    public static void main(String[] args) {
        Robot_Thread rt1 = new Robot_Thread();
        Robot_Thread rt2 = new Robot_Thread();
        Robot_Thread rt3 = new Robot_Thread();
        Robot_Thread rt4 = new Robot_Thread();
        Robot_Thread rt5 = new Robot_Thread();
        Robot_Thread rt6 = new Robot_Thread();
        Robot_Thread rt7 = new Robot_Thread();
        Robot_Thread rt8 = new Robot_Thread();
        Robot_Thread rt9 = new Robot_Thread();
        Robot_Thread rt10 = new Robot_Thread();
        rt1.robot.randomCoo();
        rt2.robot.randomCoo();
        rt3.robot.randomCoo();
        rt4.robot.randomCoo();
        rt5.robot.randomCoo();
        rt6.robot.randomCoo();
        rt7.robot.randomCoo();
        rt8.robot.randomCoo();
        rt9.robot.randomCoo();
        rt10.robot.randomCoo();

        rt1.start();



        }
}


