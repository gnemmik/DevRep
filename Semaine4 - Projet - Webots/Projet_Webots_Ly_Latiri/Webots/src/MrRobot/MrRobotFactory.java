/**
 */
package MrRobot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MrRobot.MrRobotPackage
 * @generated
 */
public interface MrRobotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MrRobotFactory eINSTANCE = MrRobot.impl.MrRobotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Distance Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Sensor</em>'.
	 * @generated
	 */
	DistanceSensor createDistanceSensor();

	/**
	 * Returns a new object of class '<em>Left Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Motor</em>'.
	 * @generated
	 */
	LeftMotor createLeftMotor();

	/**
	 * Returns a new object of class '<em>Right Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Motor</em>'.
	 * @generated
	 */
	RightMotor createRightMotor();

	/**
	 * Returns a new object of class '<em>Robot Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot Configuration</em>'.
	 * @generated
	 */
	RobotConfiguration createRobotConfiguration();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Sensor</em>'.
	 * @generated
	 */
	LightSensor createLightSensor();

	/**
	 * Returns a new object of class '<em>Escape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escape</em>'.
	 * @generated
	 */
	Escape createEscape();

	/**
	 * Returns a new object of class '<em>Home</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Home</em>'.
	 * @generated
	 */
	Home createHome();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MrRobotPackage getMrRobotPackage();

} //MrRobotFactory
