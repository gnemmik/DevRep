import com.cyberbotics.webots.controller.Robot;

// Added a new include file
import com.cyberbotics.webots.controller.Motor;

public class EPuckGoForward {

 public static void main(String[] args) {

   int TIME_STEP = 64;

   Robot robot = new Robot();

   // get the motor devices
   Motor leftMotor = robot.getMotor("left wheel motor");
   Motor rightMotor = robot.getMotor("right wheel motor");
   // set the target position of the motors
   leftMotor.setPosition(10.0);
   rightMotor.setPosition(10.0);

   while (robot.step(TIME_STEP) != -1);
 }
}