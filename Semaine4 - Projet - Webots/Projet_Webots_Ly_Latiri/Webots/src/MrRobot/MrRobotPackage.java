/**
 */
package MrRobot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MrRobot.MrRobotFactory
 * @model kind="package"
 * @generated
 */
public interface MrRobotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MrRobot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://robot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MrRobotPackage eINSTANCE = MrRobot.impl.MrRobotPackageImpl.init();

	/**
	 * The meta object id for the '{@link MrRobot.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.RobotImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ACTUATORS = 1;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Motor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___GET_MOTOR__STRING = 0;

	/**
	 * The operation id for the '<em>Get Distance Sensor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___GET_DISTANCE_SENSOR__STRING = 1;

	/**
	 * The operation id for the '<em>Get Light Sensor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___GET_LIGHT_SENSOR__STRING = 2;

	/**
	 * The operation id for the '<em>Get Left Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___GET_LEFT_LIGHT = 3;

	/**
	 * The operation id for the '<em>Get Right Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___GET_RIGHT_LIGHT = 4;

	/**
	 * The operation id for the '<em>Get Left Obstacle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___GET_LEFT_OBSTACLE = 5;

	/**
	 * The operation id for the '<em>Get Right Obstacle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT___GET_RIGHT_OBSTACLE = 6;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link MrRobot.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.SensorImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___GET_VALUE = 0;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___ENABLE__DOUBLE = 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link MrRobot.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.DistanceSensorImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getDistanceSensor()
	 * @generated
	 */
	int DISTANCE_SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The number of structural features of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR___GET_VALUE = SENSOR___GET_VALUE;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR___ENABLE__DOUBLE = SENSOR___ENABLE__DOUBLE;

	/**
	 * The number of operations of the '<em>Distance Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MrRobot.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.ActuatorImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Set Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___SET_POSITION__DOUBLE = 0;

	/**
	 * The operation id for the '<em>Set Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___SET_VELOCITY__DOUBLE = 1;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link MrRobot.impl.LeftMotorImpl <em>Left Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.LeftMotorImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getLeftMotor()
	 * @generated
	 */
	int LEFT_MOTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR__NAME = ACTUATOR__NAME;

	/**
	 * The number of structural features of the '<em>Left Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR___SET_POSITION__DOUBLE = ACTUATOR___SET_POSITION__DOUBLE;

	/**
	 * The operation id for the '<em>Set Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR___SET_VELOCITY__DOUBLE = ACTUATOR___SET_VELOCITY__DOUBLE;

	/**
	 * The number of operations of the '<em>Left Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MOTOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MrRobot.impl.RightMotorImpl <em>Right Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.RightMotorImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getRightMotor()
	 * @generated
	 */
	int RIGHT_MOTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR__NAME = ACTUATOR__NAME;

	/**
	 * The number of structural features of the '<em>Right Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR_FEATURE_COUNT = ACTUATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR___SET_POSITION__DOUBLE = ACTUATOR___SET_POSITION__DOUBLE;

	/**
	 * The operation id for the '<em>Set Velocity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR___SET_VELOCITY__DOUBLE = ACTUATOR___SET_VELOCITY__DOUBLE;

	/**
	 * The number of operations of the '<em>Right Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_MOTOR_OPERATION_COUNT = ACTUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MrRobot.impl.RobotConfigurationImpl <em>Robot Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.RobotConfigurationImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getRobotConfiguration()
	 * @generated
	 */
	int ROBOT_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_CONFIGURATION__ROBOT = 0;

	/**
	 * The feature id for the '<em><b>MAX SPEED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_CONFIGURATION__MAX_SPEED = 1;

	/**
	 * The feature id for the '<em><b>TIME STEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_CONFIGURATION__TIME_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_CONFIGURATION__MISSION = 3;

	/**
	 * The number of structural features of the '<em>Robot Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Robot Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MrRobot.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.MissionImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__FINISHED = 1;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__BEHAVIORS = 2;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MrRobot.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.LightSensorImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getLightSensor()
	 * @generated
	 */
	int LIGHT_SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR___GET_VALUE = SENSOR___GET_VALUE;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR___ENABLE__DOUBLE = SENSOR___ENABLE__DOUBLE;

	/**
	 * The number of operations of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MrRobot.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.BehaviorImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 9;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SENSORS = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___DISPLAY = 0;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link MrRobot.impl.EscapeImpl <em>Escape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.EscapeImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getEscape()
	 * @generated
	 */
	int ESCAPE = 10;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE__SENSORS = BEHAVIOR__SENSORS;

	/**
	 * The number of structural features of the '<em>Escape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE___DISPLAY = BEHAVIOR___DISPLAY;

	/**
	 * The number of operations of the '<em>Escape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCAPE_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MrRobot.impl.HomeImpl <em>Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MrRobot.impl.HomeImpl
	 * @see MrRobot.impl.MrRobotPackageImpl#getHome()
	 * @generated
	 */
	int HOME = 11;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__SENSORS = BEHAVIOR__SENSORS;

	/**
	 * The number of structural features of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Display</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME___DISPLAY = BEHAVIOR___DISPLAY;

	/**
	 * The number of operations of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MrRobot.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see MrRobot.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the attribute '{@link MrRobot.Robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MrRobot.Robot#getName()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MrRobot.Robot#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuators</em>'.
	 * @see MrRobot.Robot#getActuators()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Actuators();

	/**
	 * Returns the meta object for the '{@link MrRobot.Robot#getMotor(java.lang.String) <em>Get Motor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Motor</em>' operation.
	 * @see MrRobot.Robot#getMotor(java.lang.String)
	 * @generated
	 */
	EOperation getRobot__GetMotor__String();

	/**
	 * Returns the meta object for the '{@link MrRobot.Robot#getDistanceSensor(java.lang.String) <em>Get Distance Sensor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Distance Sensor</em>' operation.
	 * @see MrRobot.Robot#getDistanceSensor(java.lang.String)
	 * @generated
	 */
	EOperation getRobot__GetDistanceSensor__String();

	/**
	 * Returns the meta object for the '{@link MrRobot.Robot#getLightSensor(java.lang.String) <em>Get Light Sensor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Light Sensor</em>' operation.
	 * @see MrRobot.Robot#getLightSensor(java.lang.String)
	 * @generated
	 */
	EOperation getRobot__GetLightSensor__String();

	/**
	 * Returns the meta object for the '{@link MrRobot.Robot#getLeftLight() <em>Get Left Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Left Light</em>' operation.
	 * @see MrRobot.Robot#getLeftLight()
	 * @generated
	 */
	EOperation getRobot__GetLeftLight();

	/**
	 * Returns the meta object for the '{@link MrRobot.Robot#getRightLight() <em>Get Right Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Right Light</em>' operation.
	 * @see MrRobot.Robot#getRightLight()
	 * @generated
	 */
	EOperation getRobot__GetRightLight();

	/**
	 * Returns the meta object for the '{@link MrRobot.Robot#getLeftObstacle() <em>Get Left Obstacle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Left Obstacle</em>' operation.
	 * @see MrRobot.Robot#getLeftObstacle()
	 * @generated
	 */
	EOperation getRobot__GetLeftObstacle();

	/**
	 * Returns the meta object for the '{@link MrRobot.Robot#getRightObstacle() <em>Get Right Obstacle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Right Obstacle</em>' operation.
	 * @see MrRobot.Robot#getRightObstacle()
	 * @generated
	 */
	EOperation getRobot__GetRightObstacle();

	/**
	 * Returns the meta object for class '{@link MrRobot.DistanceSensor <em>Distance Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Sensor</em>'.
	 * @see MrRobot.DistanceSensor
	 * @generated
	 */
	EClass getDistanceSensor();

	/**
	 * Returns the meta object for class '{@link MrRobot.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see MrRobot.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link MrRobot.Actuator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MrRobot.Actuator#getName()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Name();

	/**
	 * Returns the meta object for the '{@link MrRobot.Actuator#setPosition(double) <em>Set Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Position</em>' operation.
	 * @see MrRobot.Actuator#setPosition(double)
	 * @generated
	 */
	EOperation getActuator__SetPosition__double();

	/**
	 * Returns the meta object for the '{@link MrRobot.Actuator#setVelocity(double) <em>Set Velocity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Velocity</em>' operation.
	 * @see MrRobot.Actuator#setVelocity(double)
	 * @generated
	 */
	EOperation getActuator__SetVelocity__double();

	/**
	 * Returns the meta object for class '{@link MrRobot.LeftMotor <em>Left Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Motor</em>'.
	 * @see MrRobot.LeftMotor
	 * @generated
	 */
	EClass getLeftMotor();

	/**
	 * Returns the meta object for class '{@link MrRobot.RightMotor <em>Right Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Motor</em>'.
	 * @see MrRobot.RightMotor
	 * @generated
	 */
	EClass getRightMotor();

	/**
	 * Returns the meta object for class '{@link MrRobot.RobotConfiguration <em>Robot Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Configuration</em>'.
	 * @see MrRobot.RobotConfiguration
	 * @generated
	 */
	EClass getRobotConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link MrRobot.RobotConfiguration#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Robot</em>'.
	 * @see MrRobot.RobotConfiguration#getRobot()
	 * @see #getRobotConfiguration()
	 * @generated
	 */
	EReference getRobotConfiguration_Robot();

	/**
	 * Returns the meta object for the attribute '{@link MrRobot.RobotConfiguration#getMAX_SPEED <em>MAX SPEED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAX SPEED</em>'.
	 * @see MrRobot.RobotConfiguration#getMAX_SPEED()
	 * @see #getRobotConfiguration()
	 * @generated
	 */
	EAttribute getRobotConfiguration_MAX_SPEED();

	/**
	 * Returns the meta object for the attribute '{@link MrRobot.RobotConfiguration#getTIME_STEP <em>TIME STEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TIME STEP</em>'.
	 * @see MrRobot.RobotConfiguration#getTIME_STEP()
	 * @see #getRobotConfiguration()
	 * @generated
	 */
	EAttribute getRobotConfiguration_TIME_STEP();

	/**
	 * Returns the meta object for the containment reference '{@link MrRobot.RobotConfiguration#getMission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mission</em>'.
	 * @see MrRobot.RobotConfiguration#getMission()
	 * @see #getRobotConfiguration()
	 * @generated
	 */
	EReference getRobotConfiguration_Mission();

	/**
	 * Returns the meta object for class '{@link MrRobot.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see MrRobot.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the attribute '{@link MrRobot.Mission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MrRobot.Mission#getName()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Name();

	/**
	 * Returns the meta object for the attribute '{@link MrRobot.Mission#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see MrRobot.Mission#isFinished()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Finished();

	/**
	 * Returns the meta object for the containment reference list '{@link MrRobot.Mission#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see MrRobot.Mission#getBehaviors()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Behaviors();

	/**
	 * Returns the meta object for class '{@link MrRobot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see MrRobot.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link MrRobot.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MrRobot.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for the '{@link MrRobot.Sensor#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see MrRobot.Sensor#getValue()
	 * @generated
	 */
	EOperation getSensor__GetValue();

	/**
	 * Returns the meta object for the '{@link MrRobot.Sensor#enable(double) <em>Enable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enable</em>' operation.
	 * @see MrRobot.Sensor#enable(double)
	 * @generated
	 */
	EOperation getSensor__Enable__double();

	/**
	 * Returns the meta object for class '{@link MrRobot.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see MrRobot.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link MrRobot.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see MrRobot.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link MrRobot.Behavior#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see MrRobot.Behavior#getSensors()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Sensors();

	/**
	 * Returns the meta object for the '{@link MrRobot.Behavior#display() <em>Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display</em>' operation.
	 * @see MrRobot.Behavior#display()
	 * @generated
	 */
	EOperation getBehavior__Display();

	/**
	 * Returns the meta object for class '{@link MrRobot.Escape <em>Escape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escape</em>'.
	 * @see MrRobot.Escape
	 * @generated
	 */
	EClass getEscape();

	/**
	 * Returns the meta object for class '{@link MrRobot.Home <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home</em>'.
	 * @see MrRobot.Home
	 * @generated
	 */
	EClass getHome();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MrRobotFactory getMrRobotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MrRobot.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.RobotImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__ACTUATORS = eINSTANCE.getRobot_Actuators();

		/**
		 * The meta object literal for the '<em><b>Get Motor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOT___GET_MOTOR__STRING = eINSTANCE.getRobot__GetMotor__String();

		/**
		 * The meta object literal for the '<em><b>Get Distance Sensor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOT___GET_DISTANCE_SENSOR__STRING = eINSTANCE.getRobot__GetDistanceSensor__String();

		/**
		 * The meta object literal for the '<em><b>Get Light Sensor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOT___GET_LIGHT_SENSOR__STRING = eINSTANCE.getRobot__GetLightSensor__String();

		/**
		 * The meta object literal for the '<em><b>Get Left Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOT___GET_LEFT_LIGHT = eINSTANCE.getRobot__GetLeftLight();

		/**
		 * The meta object literal for the '<em><b>Get Right Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOT___GET_RIGHT_LIGHT = eINSTANCE.getRobot__GetRightLight();

		/**
		 * The meta object literal for the '<em><b>Get Left Obstacle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOT___GET_LEFT_OBSTACLE = eINSTANCE.getRobot__GetLeftObstacle();

		/**
		 * The meta object literal for the '<em><b>Get Right Obstacle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOT___GET_RIGHT_OBSTACLE = eINSTANCE.getRobot__GetRightObstacle();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.DistanceSensorImpl <em>Distance Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.DistanceSensorImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getDistanceSensor()
		 * @generated
		 */
		EClass DISTANCE_SENSOR = eINSTANCE.getDistanceSensor();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.ActuatorImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__NAME = eINSTANCE.getActuator_Name();

		/**
		 * The meta object literal for the '<em><b>Set Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTUATOR___SET_POSITION__DOUBLE = eINSTANCE.getActuator__SetPosition__double();

		/**
		 * The meta object literal for the '<em><b>Set Velocity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTUATOR___SET_VELOCITY__DOUBLE = eINSTANCE.getActuator__SetVelocity__double();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.LeftMotorImpl <em>Left Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.LeftMotorImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getLeftMotor()
		 * @generated
		 */
		EClass LEFT_MOTOR = eINSTANCE.getLeftMotor();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.RightMotorImpl <em>Right Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.RightMotorImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getRightMotor()
		 * @generated
		 */
		EClass RIGHT_MOTOR = eINSTANCE.getRightMotor();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.RobotConfigurationImpl <em>Robot Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.RobotConfigurationImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getRobotConfiguration()
		 * @generated
		 */
		EClass ROBOT_CONFIGURATION = eINSTANCE.getRobotConfiguration();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_CONFIGURATION__ROBOT = eINSTANCE.getRobotConfiguration_Robot();

		/**
		 * The meta object literal for the '<em><b>MAX SPEED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_CONFIGURATION__MAX_SPEED = eINSTANCE.getRobotConfiguration_MAX_SPEED();

		/**
		 * The meta object literal for the '<em><b>TIME STEP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_CONFIGURATION__TIME_STEP = eINSTANCE.getRobotConfiguration_TIME_STEP();

		/**
		 * The meta object literal for the '<em><b>Mission</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_CONFIGURATION__MISSION = eINSTANCE.getRobotConfiguration_Mission();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.MissionImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__NAME = eINSTANCE.getMission_Name();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__FINISHED = eINSTANCE.getMission_Finished();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__BEHAVIORS = eINSTANCE.getMission_Behaviors();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.SensorImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR___GET_VALUE = eINSTANCE.getSensor__GetValue();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR___ENABLE__DOUBLE = eINSTANCE.getSensor__Enable__double();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.LightSensorImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.BehaviorImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__SENSORS = eINSTANCE.getBehavior_Sensors();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BEHAVIOR___DISPLAY = eINSTANCE.getBehavior__Display();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.EscapeImpl <em>Escape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.EscapeImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getEscape()
		 * @generated
		 */
		EClass ESCAPE = eINSTANCE.getEscape();

		/**
		 * The meta object literal for the '{@link MrRobot.impl.HomeImpl <em>Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MrRobot.impl.HomeImpl
		 * @see MrRobot.impl.MrRobotPackageImpl#getHome()
		 * @generated
		 */
		EClass HOME = eINSTANCE.getHome();

	}

} //MrRobotPackage
