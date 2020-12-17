/**
 */
package MrRobot.impl;

import MrRobot.Actuator;
import MrRobot.Behavior;
import MrRobot.DistanceSensor;
import MrRobot.Escape;
import MrRobot.Home;
import MrRobot.LeftMotor;
import MrRobot.LightSensor;
import MrRobot.Mission;
import MrRobot.MrRobotFactory;
import MrRobot.MrRobotPackage;
import MrRobot.RightMotor;
import MrRobot.Robot;
import MrRobot.RobotConfiguration;
import MrRobot.Sensor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MrRobotPackageImpl extends EPackageImpl implements MrRobotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass homeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MrRobot.MrRobotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MrRobotPackageImpl() {
		super(eNS_URI, MrRobotFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MrRobotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MrRobotPackage init() {
		if (isInited) return (MrRobotPackage)EPackage.Registry.INSTANCE.getEPackage(MrRobotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMrRobotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MrRobotPackageImpl theMrRobotPackage = registeredMrRobotPackage instanceof MrRobotPackageImpl ? (MrRobotPackageImpl)registeredMrRobotPackage : new MrRobotPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMrRobotPackage.createPackageContents();

		// Initialize created meta-data
		theMrRobotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMrRobotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MrRobotPackage.eNS_URI, theMrRobotPackage);
		return theMrRobotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobot_Name() {
		return (EAttribute)robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobot_Actuators() {
		return (EReference)robotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRobot__GetMotor__String() {
		return robotEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRobot__GetDistanceSensor__String() {
		return robotEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRobot__GetLightSensor__String() {
		return robotEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRobot__GetLeftLight() {
		return robotEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRobot__GetRightLight() {
		return robotEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRobot__GetLeftObstacle() {
		return robotEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRobot__GetRightObstacle() {
		return robotEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistanceSensor() {
		return distanceSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActuator_Name() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActuator__SetPosition__double() {
		return actuatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActuator__SetVelocity__double() {
		return actuatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeftMotor() {
		return leftMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRightMotor() {
		return rightMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobotConfiguration() {
		return robotConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobotConfiguration_Robot() {
		return (EReference)robotConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobotConfiguration_MAX_SPEED() {
		return (EAttribute)robotConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobotConfiguration_TIME_STEP() {
		return (EAttribute)robotConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRobotConfiguration_Mission() {
		return (EReference)robotConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMission_Name() {
		return (EAttribute)missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMission_Finished() {
		return (EAttribute)missionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMission_Behaviors() {
		return (EReference)missionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Name() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSensor__GetValue() {
		return sensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSensor__Enable__double() {
		return sensorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLightSensor() {
		return lightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehavior_Sensors() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBehavior__Display() {
		return behaviorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEscape() {
		return escapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHome() {
		return homeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MrRobotFactory getMrRobotFactory() {
		return (MrRobotFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		robotEClass = createEClass(ROBOT);
		createEAttribute(robotEClass, ROBOT__NAME);
		createEReference(robotEClass, ROBOT__ACTUATORS);
		createEOperation(robotEClass, ROBOT___GET_MOTOR__STRING);
		createEOperation(robotEClass, ROBOT___GET_DISTANCE_SENSOR__STRING);
		createEOperation(robotEClass, ROBOT___GET_LIGHT_SENSOR__STRING);
		createEOperation(robotEClass, ROBOT___GET_LEFT_LIGHT);
		createEOperation(robotEClass, ROBOT___GET_RIGHT_LIGHT);
		createEOperation(robotEClass, ROBOT___GET_LEFT_OBSTACLE);
		createEOperation(robotEClass, ROBOT___GET_RIGHT_OBSTACLE);

		distanceSensorEClass = createEClass(DISTANCE_SENSOR);

		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__NAME);
		createEOperation(actuatorEClass, ACTUATOR___SET_POSITION__DOUBLE);
		createEOperation(actuatorEClass, ACTUATOR___SET_VELOCITY__DOUBLE);

		leftMotorEClass = createEClass(LEFT_MOTOR);

		rightMotorEClass = createEClass(RIGHT_MOTOR);

		robotConfigurationEClass = createEClass(ROBOT_CONFIGURATION);
		createEReference(robotConfigurationEClass, ROBOT_CONFIGURATION__ROBOT);
		createEAttribute(robotConfigurationEClass, ROBOT_CONFIGURATION__MAX_SPEED);
		createEAttribute(robotConfigurationEClass, ROBOT_CONFIGURATION__TIME_STEP);
		createEReference(robotConfigurationEClass, ROBOT_CONFIGURATION__MISSION);

		missionEClass = createEClass(MISSION);
		createEAttribute(missionEClass, MISSION__NAME);
		createEAttribute(missionEClass, MISSION__FINISHED);
		createEReference(missionEClass, MISSION__BEHAVIORS);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__NAME);
		createEOperation(sensorEClass, SENSOR___GET_VALUE);
		createEOperation(sensorEClass, SENSOR___ENABLE__DOUBLE);

		lightSensorEClass = createEClass(LIGHT_SENSOR);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__SENSORS);
		createEOperation(behaviorEClass, BEHAVIOR___DISPLAY);

		escapeEClass = createEClass(ESCAPE);

		homeEClass = createEClass(HOME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		distanceSensorEClass.getESuperTypes().add(this.getSensor());
		leftMotorEClass.getESuperTypes().add(this.getActuator());
		rightMotorEClass.getESuperTypes().add(this.getActuator());
		lightSensorEClass.getESuperTypes().add(this.getSensor());
		escapeEClass.getESuperTypes().add(this.getBehavior());
		homeEClass.getESuperTypes().add(this.getBehavior());

		// Initialize classes, features, and operations; add parameters
		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobot_Name(), ecorePackage.getEString(), "name", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_Actuators(), this.getActuator(), null, "actuators", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRobot__GetMotor__String(), this.getActuator(), "getMotor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRobot__GetDistanceSensor__String(), this.getDistanceSensor(), "getDistanceSensor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRobot__GetLightSensor__String(), this.getLightSensor(), "getLightSensor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRobot__GetLeftLight(), ecorePackage.getEString(), "getLeftLight", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRobot__GetRightLight(), ecorePackage.getEString(), "getRightLight", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRobot__GetLeftObstacle(), ecorePackage.getEString(), "getLeftObstacle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRobot__GetRightObstacle(), ecorePackage.getEString(), "getRightObstacle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(distanceSensorEClass, DistanceSensor.class, "DistanceSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getActuator__SetPosition__double(), null, "setPosition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActuator__SetVelocity__double(), null, "setVelocity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "velocity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(leftMotorEClass, LeftMotor.class, "LeftMotor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rightMotorEClass, RightMotor.class, "RightMotor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(robotConfigurationEClass, RobotConfiguration.class, "RobotConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobotConfiguration_Robot(), this.getRobot(), null, "robot", null, 1, 1, RobotConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotConfiguration_MAX_SPEED(), ecorePackage.getEDouble(), "MAX_SPEED", null, 0, 1, RobotConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotConfiguration_TIME_STEP(), ecorePackage.getEInt(), "TIME_STEP", null, 0, 1, RobotConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotConfiguration_Mission(), this.getMission(), null, "mission", null, 0, 1, RobotConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMission_Name(), ecorePackage.getEString(), "name", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMission_Finished(), ecorePackage.getEBoolean(), "finished", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Behaviors(), this.getBehavior(), null, "behaviors", null, 1, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSensor__GetValue(), ecorePackage.getEDouble(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSensor__Enable__double(), null, "enable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "timeStep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lightSensorEClass, LightSensor.class, "LightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Sensors(), this.getSensor(), null, "sensors", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBehavior__Display(), ecorePackage.getEString(), "display", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(escapeEClass, Escape.class, "Escape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(homeEClass, Home.class, "Home", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MrRobotPackageImpl
