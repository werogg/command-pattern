import robotcontroller.RobotControllerRemote;
import sdk.IRobot;
import sdk.Robot;

/**
 * Created by ramiz on 11/15/17.
 */
public class Main {
    public static void main(String args[]) {
        IRobot robot = new Robot();
        RobotControllerRemote robotController = new RobotControllerRemote(robot);

        robotController.move();
        robotController.turn();
        robotController.beep();

        System.out.println();
        System.out.println("Replaying");

        robotController.replay();
    }
}
