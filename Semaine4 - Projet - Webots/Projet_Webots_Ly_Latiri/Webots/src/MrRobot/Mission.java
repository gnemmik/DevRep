/**
 */
package MrRobot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MrRobot.Mission#getName <em>Name</em>}</li>
 *   <li>{@link MrRobot.Mission#isFinished <em>Finished</em>}</li>
 *   <li>{@link MrRobot.Mission#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 *
 * @see MrRobot.MrRobotPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MrRobot.MrRobotPackage#getMission_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MrRobot.Mission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see #setFinished(boolean)
	 * @see MrRobot.MrRobotPackage#getMission_Finished()
	 * @model
	 * @generated
	 */
	boolean isFinished();

	/**
	 * Sets the value of the '{@link MrRobot.Mission#isFinished <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished</em>' attribute.
	 * @see #isFinished()
	 * @generated
	 */
	void setFinished(boolean value);

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link MrRobot.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see MrRobot.MrRobotPackage#getMission_Behaviors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

} // Mission
