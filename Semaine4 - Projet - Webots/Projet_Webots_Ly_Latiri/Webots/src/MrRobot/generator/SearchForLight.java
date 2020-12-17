package MrRobot.generator;

import MrRobot.*;

public class SearchForLight
{
  protected static String nl;
  public static synchronized SearchForLight create(String lineSeparator)
  {
    nl = lineSeparator;
    SearchForLight result = new SearchForLight();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "/* Welcome to the search for light mission. */" + NL;
  protected final String TEXT_2 = NL + "import com.cyberbotics.webots.controller.Robot;" + NL + "import com.cyberbotics.webots.controller.DistanceSensor;" + NL + "import com.cyberbotics.webots.controller.LightSensor;" + NL + "import com.cyberbotics.webots.controller.Motor;" + NL + "" + NL + "public class SearchForLight {" + NL + "" + NL + "\tpublic static void main(String[] args) {" + NL + "\t" + NL + "\t\tRobot robot = new Robot();" + NL + "\t\t" + NL + "\t\tdouble MAX_SPEED = ";
  protected final String TEXT_3 = ";" + NL + "\t\t" + NL + "\t\tint TIME_STEP = ";
  protected final String TEXT_4 = ";" + NL + "\t\t";
  protected final String TEXT_5 = NL + "\t\tDistanceSensor[] ps = new DistanceSensor[";
  protected final String TEXT_6 = "];" + NL + "\t\tString[] psNames = new String[";
  protected final String TEXT_7 = "];" + NL + "\t\t" + NL + "\t\tLightSensor[] ls = new LightSensor[";
  protected final String TEXT_8 = "];" + NL + "\t\tString[] lsNames = new String[";
  protected final String TEXT_9 = "];" + NL + "\t\t\t";
  protected final String TEXT_10 = NL + "\t\tpsNames[";
  protected final String TEXT_11 = "] = \"";
  protected final String TEXT_12 = "\";";
  protected final String TEXT_13 = NL + "\t\tlsNames[";
  protected final String TEXT_14 = "\"; ";
  protected final String TEXT_15 = NL + "\t\t" + NL + "\t\tfor (int i = 0; i < 8; i++) {" + NL + "\t        ps[i] = robot.getDistanceSensor(psNames[i]);" + NL + "\t        ps[i].enable(TIME_STEP);" + NL + "\t      " + NL + "\t        ls[i] = robot.getLightSensor(lsNames[i]);" + NL + "\t        ls[i].enable(TIME_STEP);" + NL + "\t    }" + NL + "\t    ";
  protected final String TEXT_16 = NL + "\t\tMotor leftMotor = robot.getMotor(\"";
  protected final String TEXT_17 = "\");" + NL + "\t    \t";
  protected final String TEXT_18 = NL + "\t    Motor rightMotor = robot.getMotor(\"";
  protected final String TEXT_19 = "\");";
  protected final String TEXT_20 = "   " + NL + "\t\t" + NL + "\t\tleftMotor.setPosition(Double.POSITIVE_INFINITY);" + NL + "\t\trightMotor.setPosition(Double.POSITIVE_INFINITY);" + NL + "\t\tleftMotor.setVelocity(0.0);" + NL + "\t\trightMotor.setVelocity(0.0);" + NL + "\t\t " + NL + "\t\twhile (robot.step(TIME_STEP) != -1) {" + NL + "\t\t\tdouble[] psValues = {0, 0, 0, 0, 0, 0, 0, 0};" + NL + "\t\t \tdouble[] lsValues = {0, 0, 0, 0, 0, 0, 0, 0};" + NL + "\t\t \t" + NL + "\t\t    for (int i = 0; i < 8 ; i++){" + NL + "\t\t        psValues[i] = ps[i].getValue();" + NL + "\t\t        lsValues[i] = ls[i].getValue();" + NL + "\t\t \t}" + NL + "\t\t \t" + NL + "\t\t \tboolean right_obstacle =";
  protected final String TEXT_21 = NL + "\t       \tboolean left_obstacle =";
  protected final String TEXT_22 = NL + "\t\t    boolean right_light =";
  protected final String TEXT_23 = NL + "\t\t    boolean left_light = ";
  protected final String TEXT_24 = NL + "\t\t    double leftSpeed  = 0.5 * MAX_SPEED;" + NL + "    \t\tdouble rightSpeed = 0.5 * MAX_SPEED;" + NL + "    \t\t" + NL + "    \t\tif (left_obstacle || right_obstacle){" + NL + "\t\t    \t";
  protected final String TEXT_25 = NL + "\t\t    }else{" + NL + "\t\t    \t";
  protected final String TEXT_26 = NL + "\t\t\t}" + NL + "\t\t    leftMotor.setVelocity(leftSpeed);" + NL + "    \t\trightMotor.setVelocity(rightSpeed);" + NL + "\t\t }" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     RobotConfiguration config = (RobotConfiguration) argument;
     Robot robot = config.getRobot();
    Behavior escape = config.getMission().getBehaviors().get(0);
    Behavior home = config.getMission().getBehaviors().get(1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append( config.getMAX_SPEED() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( config.getTIME_STEP());
    stringBuffer.append(TEXT_4);
    int size = config.getMission().getBehaviors().get(0).getSensors().size();
    stringBuffer.append(TEXT_5);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_9);
    for (Behavior b : config.getMission().getBehaviors()) { for(int i = 0; i< b.getSensors().size(); i++) {Sensor s = b.getSensors().get(i);if(s instanceof DistanceSensor) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(s.getName());
    stringBuffer.append(TEXT_12);
    }if(s instanceof LightSensor) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(s.getName());
    stringBuffer.append(TEXT_14);
    }}}
    stringBuffer.append(TEXT_15);
    for (Actuator act : config.getRobot().getActuators()) {if(act instanceof LeftMotor) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(act.getName());
    stringBuffer.append(TEXT_17);
    }if(act instanceof RightMotor) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(act.getName());
    stringBuffer.append(TEXT_19);
    }}
    stringBuffer.append(TEXT_20);
    stringBuffer.append(robot.getRightObstacle());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(robot.getLeftObstacle());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(robot.getRightLight());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(robot.getLeftLight());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(escape.display());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(home.display());
    stringBuffer.append(TEXT_26);
    return stringBuffer.toString();
  }
}
