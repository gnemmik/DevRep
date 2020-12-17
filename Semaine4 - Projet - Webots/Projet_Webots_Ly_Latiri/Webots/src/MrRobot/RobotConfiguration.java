/**
 */
package MrRobot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MrRobot.RobotConfiguration#getRobot <em>Robot</em>}</li>
 *   <li>{@link MrRobot.RobotConfiguration#getMAX_SPEED <em>MAX SPEED</em>}</li>
 *   <li>{@link MrRobot.RobotConfiguration#getTIME_STEP <em>TIME STEP</em>}</li>
 *   <li>{@link MrRobot.RobotConfiguration#getMission <em>Mission</em>}</li>
 * </ul>
 *
 * @see MrRobot.MrRobotPackage#getRobotConfiguration()
 * @model
 * @generated
 */
public interface RobotConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Robot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' containment reference.
	 * @see #setRobot(Robot)
	 * @see MrRobot.MrRobotPackage#getRobotConfiguration_Robot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Robot getRobot();

	/**
	 * Sets the value of the '{@link MrRobot.RobotConfiguration#getRobot <em>Robot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot</em>' containment reference.
	 * @see #getRobot()
	 * @generated
	 */
	void setRobot(Robot value);

	/**
	 * Returns the value of the '<em><b>MAX SPEED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAX SPEED</em>' attribute.
	 * @see #setMAX_SPEED(double)
	 * @see MrRobot.MrRobotPackage#getRobotConfiguration_MAX_SPEED()
	 * @model
	 * @generated
	 */
	double getMAX_SPEED();

	/**
	 * Sets the value of the '{@link MrRobot.RobotConfiguration#getMAX_SPEED <em>MAX SPEED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAX SPEED</em>' attribute.
	 * @see #getMAX_SPEED()
	 * @generated
	 */
	void setMAX_SPEED(double value);

	/**
	 * Returns the value of the '<em><b>TIME STEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TIME STEP</em>' attribute.
	 * @see #setTIME_STEP(int)
	 * @see MrRobot.MrRobotPackage#getRobotConfiguration_TIME_STEP()
	 * @model
	 * @generated
	 */
	int getTIME_STEP();

	/**
	 * Sets the value of the '{@link MrRobot.RobotConfiguration#getTIME_STEP <em>TIME STEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TIME STEP</em>' attribute.
	 * @see #getTIME_STEP()
	 * @generated
	 */
	void setTIME_STEP(int value);

	/**
	 * Returns the value of the '<em><b>Mission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission</em>' containment reference.
	 * @see #setMission(Mission)
	 * @see MrRobot.MrRobotPackage#getRobotConfiguration_Mission()
	 * @model containment="true"
	 * @generated
	 */
	Mission getMission();

	/**
	 * Sets the value of the '{@link MrRobot.RobotConfiguration#getMission <em>Mission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission</em>' containment reference.
	 * @see #getMission()
	 * @generated
	 */
	void setMission(Mission value);

} // RobotConfiguration
