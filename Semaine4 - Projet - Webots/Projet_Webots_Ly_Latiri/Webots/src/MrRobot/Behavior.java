/**
 */
package MrRobot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MrRobot.Behavior#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @see MrRobot.MrRobotPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link MrRobot.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see MrRobot.MrRobotPackage#getBehavior_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String display();

} // Behavior
