/**
 */
package MrRobot.impl;

import MrRobot.Actuator;
import MrRobot.DistanceSensor;
import MrRobot.LightSensor;
import MrRobot.MrRobotPackage;
import MrRobot.Robot;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MrRobot.impl.RobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link MrRobot.impl.RobotImpl#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActuators() <em>Actuators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MrRobotPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrRobotPackage.ROBOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actuator> getActuators() {
		if (actuators == null) {
			actuators = new EObjectContainmentEList<Actuator>(Actuator.class, this, MrRobotPackage.ROBOT__ACTUATORS);
		}
		return actuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator getMotor(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistanceSensor getDistanceSensor(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightSensor getLightSensor(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLeftLight() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return 	"\n "+
				"		        lsValues[4] < 80.0 ||\n" + 
				"		        lsValues[5] < 80.0 ||\n" + 
				"		        lsValues[6] < 80.0 ||\n" + 
				"		        lsValues[7] < 80.0;\n" ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRightLight() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return  "\n" + 
				"		        lsValues[0] < 80.0 ||\n" + 
				"		        lsValues[1] < 80.0 ||\n" + 
				"		        lsValues[2] < 80.0 ||\n" + 
				"		        lsValues[3] < 80.0;\n";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLeftObstacle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return	"\n" + 
				"		        psValues[5] > 80.0 ||\n" + 
				"		        psValues[6] > 80.0 ||\n" + 
				"		        psValues[7] > 80.0;\n";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRightObstacle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return "\n" + 
				"		        psValues[0] > 80.0 ||\n" + 
				"		        psValues[1] > 80.0 ||\n" + 
				"		        psValues[2] > 80.0;\n";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MrRobotPackage.ROBOT__ACTUATORS:
				return ((InternalEList<?>)getActuators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MrRobotPackage.ROBOT__NAME:
				return getName();
			case MrRobotPackage.ROBOT__ACTUATORS:
				return getActuators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MrRobotPackage.ROBOT__NAME:
				setName((String)newValue);
				return;
			case MrRobotPackage.ROBOT__ACTUATORS:
				getActuators().clear();
				getActuators().addAll((Collection<? extends Actuator>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MrRobotPackage.ROBOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MrRobotPackage.ROBOT__ACTUATORS:
				getActuators().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MrRobotPackage.ROBOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MrRobotPackage.ROBOT__ACTUATORS:
				return actuators != null && !actuators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MrRobotPackage.ROBOT___GET_MOTOR__STRING:
				return getMotor((String)arguments.get(0));
			case MrRobotPackage.ROBOT___GET_DISTANCE_SENSOR__STRING:
				return getDistanceSensor((String)arguments.get(0));
			case MrRobotPackage.ROBOT___GET_LIGHT_SENSOR__STRING:
				return getLightSensor((String)arguments.get(0));
			case MrRobotPackage.ROBOT___GET_LEFT_LIGHT:
				return getLeftLight();
			case MrRobotPackage.ROBOT___GET_RIGHT_LIGHT:
				return getRightLight();
			case MrRobotPackage.ROBOT___GET_LEFT_OBSTACLE:
				return getLeftObstacle();
			case MrRobotPackage.ROBOT___GET_RIGHT_OBSTACLE:
				return getRightObstacle();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RobotImpl
