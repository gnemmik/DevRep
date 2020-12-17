/**
 */
package MrRobot.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>MrRobot</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MrRobotTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MrRobotTests("MrRobot Tests");
		suite.addTestSuite(RobotTest.class);
		suite.addTestSuite(DistanceSensorTest.class);
		suite.addTestSuite(LeftMotorTest.class);
		suite.addTestSuite(RightMotorTest.class);
		suite.addTestSuite(LightSensorTest.class);
		suite.addTestSuite(EscapeTest.class);
		suite.addTestSuite(HomeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MrRobotTests(String name) {
		super(name);
	}

} //MrRobotTests
