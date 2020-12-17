/**
 */
package MrRobot.impl;

import MrRobot.Mission;
import MrRobot.MrRobotPackage;
import MrRobot.Robot;
import MrRobot.RobotConfiguration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MrRobot.impl.RobotConfigurationImpl#getRobot <em>Robot</em>}</li>
 *   <li>{@link MrRobot.impl.RobotConfigurationImpl#getMAX_SPEED <em>MAX SPEED</em>}</li>
 *   <li>{@link MrRobot.impl.RobotConfigurationImpl#getTIME_STEP <em>TIME STEP</em>}</li>
 *   <li>{@link MrRobot.impl.RobotConfigurationImpl#getMission <em>Mission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotConfigurationImpl extends MinimalEObjectImpl.Container implements RobotConfiguration {
	/**
	 * The cached value of the '{@link #getRobot() <em>Robot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobot()
	 * @generated
	 * @ordered
	 */
	protected Robot robot;

	/**
	 * The default value of the '{@link #getMAX_SPEED() <em>MAX SPEED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAX_SPEED()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMAX_SPEED() <em>MAX SPEED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAX_SPEED()
	 * @generated
	 * @ordered
	 */
	protected double maX_SPEED = MAX_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTIME_STEP() <em>TIME STEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTIME_STEP()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTIME_STEP() <em>TIME STEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTIME_STEP()
	 * @generated
	 * @ordered
	 */
	protected int timE_STEP = TIME_STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMission() <em>Mission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMission()
	 * @generated
	 * @ordered
	 */
	protected Mission mission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MrRobotPackage.Literals.ROBOT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robot getRobot() {
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRobot(Robot newRobot, NotificationChain msgs) {
		Robot oldRobot = robot;
		robot = newRobot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MrRobotPackage.ROBOT_CONFIGURATION__ROBOT, oldRobot, newRobot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRobot(Robot newRobot) {
		if (newRobot != robot) {
			NotificationChain msgs = null;
			if (robot != null)
				msgs = ((InternalEObject)robot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MrRobotPackage.ROBOT_CONFIGURATION__ROBOT, null, msgs);
			if (newRobot != null)
				msgs = ((InternalEObject)newRobot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MrRobotPackage.ROBOT_CONFIGURATION__ROBOT, null, msgs);
			msgs = basicSetRobot(newRobot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrRobotPackage.ROBOT_CONFIGURATION__ROBOT, newRobot, newRobot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAX_SPEED() {
		return maX_SPEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAX_SPEED(double newMAX_SPEED) {
		double oldMAX_SPEED = maX_SPEED;
		maX_SPEED = newMAX_SPEED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrRobotPackage.ROBOT_CONFIGURATION__MAX_SPEED, oldMAX_SPEED, maX_SPEED));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTIME_STEP() {
		return timE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTIME_STEP(int newTIME_STEP) {
		int oldTIME_STEP = timE_STEP;
		timE_STEP = newTIME_STEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrRobotPackage.ROBOT_CONFIGURATION__TIME_STEP, oldTIME_STEP, timE_STEP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mission getMission() {
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMission(Mission newMission, NotificationChain msgs) {
		Mission oldMission = mission;
		mission = newMission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MrRobotPackage.ROBOT_CONFIGURATION__MISSION, oldMission, newMission);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMission(Mission newMission) {
		if (newMission != mission) {
			NotificationChain msgs = null;
			if (mission != null)
				msgs = ((InternalEObject)mission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MrRobotPackage.ROBOT_CONFIGURATION__MISSION, null, msgs);
			if (newMission != null)
				msgs = ((InternalEObject)newMission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MrRobotPackage.ROBOT_CONFIGURATION__MISSION, null, msgs);
			msgs = basicSetMission(newMission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrRobotPackage.ROBOT_CONFIGURATION__MISSION, newMission, newMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MrRobotPackage.ROBOT_CONFIGURATION__ROBOT:
				return basicSetRobot(null, msgs);
			case MrRobotPackage.ROBOT_CONFIGURATION__MISSION:
				return basicSetMission(null, msgs);
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
			case MrRobotPackage.ROBOT_CONFIGURATION__ROBOT:
				return getRobot();
			case MrRobotPackage.ROBOT_CONFIGURATION__MAX_SPEED:
				return getMAX_SPEED();
			case MrRobotPackage.ROBOT_CONFIGURATION__TIME_STEP:
				return getTIME_STEP();
			case MrRobotPackage.ROBOT_CONFIGURATION__MISSION:
				return getMission();
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
			case MrRobotPackage.ROBOT_CONFIGURATION__ROBOT:
				setRobot((Robot)newValue);
				return;
			case MrRobotPackage.ROBOT_CONFIGURATION__MAX_SPEED:
				setMAX_SPEED((Double)newValue);
				return;
			case MrRobotPackage.ROBOT_CONFIGURATION__TIME_STEP:
				setTIME_STEP((Integer)newValue);
				return;
			case MrRobotPackage.ROBOT_CONFIGURATION__MISSION:
				setMission((Mission)newValue);
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
			case MrRobotPackage.ROBOT_CONFIGURATION__ROBOT:
				setRobot((Robot)null);
				return;
			case MrRobotPackage.ROBOT_CONFIGURATION__MAX_SPEED:
				setMAX_SPEED(MAX_SPEED_EDEFAULT);
				return;
			case MrRobotPackage.ROBOT_CONFIGURATION__TIME_STEP:
				setTIME_STEP(TIME_STEP_EDEFAULT);
				return;
			case MrRobotPackage.ROBOT_CONFIGURATION__MISSION:
				setMission((Mission)null);
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
			case MrRobotPackage.ROBOT_CONFIGURATION__ROBOT:
				return robot != null;
			case MrRobotPackage.ROBOT_CONFIGURATION__MAX_SPEED:
				return maX_SPEED != MAX_SPEED_EDEFAULT;
			case MrRobotPackage.ROBOT_CONFIGURATION__TIME_STEP:
				return timE_STEP != TIME_STEP_EDEFAULT;
			case MrRobotPackage.ROBOT_CONFIGURATION__MISSION:
				return mission != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (MAX_SPEED: ");
		result.append(maX_SPEED);
		result.append(", TIME_STEP: ");
		result.append(timE_STEP);
		result.append(')');
		return result.toString();
	}

} //RobotConfigurationImpl
