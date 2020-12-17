/**
 */
package MrRobot.tests;

import MrRobot.DistanceSensor;
import MrRobot.MrRobotFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Distance Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DistanceSensorTest extends SensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DistanceSensorTest.class);
	}

	/**
	 * Constructs a new Distance Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Distance Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DistanceSensor getFixture() {
		return (DistanceSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MrRobotFactory.eINSTANCE.createDistanceSensor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DistanceSensorTest
