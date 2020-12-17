/**
 */
package MrRobot.tests;

import MrRobot.LeftMotor;
import MrRobot.MrRobotFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Left Motor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeftMotorTest extends ActuatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeftMotorTest.class);
	}

	/**
	 * Constructs a new Left Motor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftMotorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Left Motor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LeftMotor getFixture() {
		return (LeftMotor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MrRobotFactory.eINSTANCE.createLeftMotor());
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

} //LeftMotorTest
