/**
 */
package MrRobot.util;

import MrRobot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MrRobot.MrRobotPackage
 * @generated
 */
public class MrRobotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MrRobotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MrRobotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MrRobotPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MrRobotSwitch<Adapter> modelSwitch =
		new MrRobotSwitch<Adapter>() {
			@Override
			public Adapter caseRobot(Robot object) {
				return createRobotAdapter();
			}
			@Override
			public Adapter caseDistanceSensor(DistanceSensor object) {
				return createDistanceSensorAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter caseLeftMotor(LeftMotor object) {
				return createLeftMotorAdapter();
			}
			@Override
			public Adapter caseRightMotor(RightMotor object) {
				return createRightMotorAdapter();
			}
			@Override
			public Adapter caseRobotConfiguration(RobotConfiguration object) {
				return createRobotConfigurationAdapter();
			}
			@Override
			public Adapter caseMission(Mission object) {
				return createMissionAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseLightSensor(LightSensor object) {
				return createLightSensorAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseEscape(Escape object) {
				return createEscapeAdapter();
			}
			@Override
			public Adapter caseHome(Home object) {
				return createHomeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.DistanceSensor <em>Distance Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.DistanceSensor
	 * @generated
	 */
	public Adapter createDistanceSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.LeftMotor <em>Left Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.LeftMotor
	 * @generated
	 */
	public Adapter createLeftMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.RightMotor <em>Right Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.RightMotor
	 * @generated
	 */
	public Adapter createRightMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.RobotConfiguration <em>Robot Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.RobotConfiguration
	 * @generated
	 */
	public Adapter createRobotConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.LightSensor
	 * @generated
	 */
	public Adapter createLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.Escape <em>Escape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.Escape
	 * @generated
	 */
	public Adapter createEscapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MrRobot.Home <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MrRobot.Home
	 * @generated
	 */
	public Adapter createHomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MrRobotAdapterFactory
