/**
 */
package MrRobot.impl;

import MrRobot.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MrRobotFactoryImpl extends EFactoryImpl implements MrRobotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MrRobotFactory init() {
		try {
			MrRobotFactory theMrRobotFactory = (MrRobotFactory)EPackage.Registry.INSTANCE.getEFactory(MrRobotPackage.eNS_URI);
			if (theMrRobotFactory != null) {
				return theMrRobotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MrRobotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MrRobotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MrRobotPackage.ROBOT: return createRobot();
			case MrRobotPackage.DISTANCE_SENSOR: return createDistanceSensor();
			case MrRobotPackage.LEFT_MOTOR: return createLeftMotor();
			case MrRobotPackage.RIGHT_MOTOR: return createRightMotor();
			case MrRobotPackage.ROBOT_CONFIGURATION: return createRobotConfiguration();
			case MrRobotPackage.MISSION: return createMission();
			case MrRobotPackage.LIGHT_SENSOR: return createLightSensor();
			case MrRobotPackage.ESCAPE: return createEscape();
			case MrRobotPackage.HOME: return createHome();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistanceSensor createDistanceSensor() {
		DistanceSensorImpl distanceSensor = new DistanceSensorImpl();
		return distanceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeftMotor createLeftMotor() {
		LeftMotorImpl leftMotor = new LeftMotorImpl();
		return leftMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RightMotor createRightMotor() {
		RightMotorImpl rightMotor = new RightMotorImpl();
		return rightMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobotConfiguration createRobotConfiguration() {
		RobotConfigurationImpl robotConfiguration = new RobotConfigurationImpl();
		return robotConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightSensor createLightSensor() {
		LightSensorImpl lightSensor = new LightSensorImpl();
		return lightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Escape createEscape() {
		EscapeImpl escape = new EscapeImpl();
		return escape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Home createHome() {
		HomeImpl home = new HomeImpl();
		return home;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MrRobotPackage getMrRobotPackage() {
		return (MrRobotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MrRobotPackage getPackage() {
		return MrRobotPackage.eINSTANCE;
	}

} //MrRobotFactoryImpl
