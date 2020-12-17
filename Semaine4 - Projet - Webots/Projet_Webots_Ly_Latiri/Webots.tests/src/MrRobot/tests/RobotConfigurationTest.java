/**
 */
package MrRobot.tests;

import MrRobot.MrRobotFactory;
import MrRobot.RobotConfiguration;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Robot Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotConfigurationTest extends TestCase {

	/**
	 * The fixture for this Robot Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RobotConfigurationTest.class);
	}

	/**
	 * Constructs a new Robot Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Robot Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RobotConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Robot Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotConfiguration getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MrRobotFactory.eINSTANCE.createRobotConfiguration());
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

} //RobotConfigurationTest
