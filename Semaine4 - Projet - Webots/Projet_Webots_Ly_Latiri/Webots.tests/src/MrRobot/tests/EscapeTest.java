/**
 */
package MrRobot.tests;

import MrRobot.Escape;
import MrRobot.MrRobotFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Escape</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EscapeTest extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EscapeTest.class);
	}

	/**
	 * Constructs a new Escape test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscapeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Escape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Escape getFixture() {
		return (Escape)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MrRobotFactory.eINSTANCE.createEscape());
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

} //EscapeTest
