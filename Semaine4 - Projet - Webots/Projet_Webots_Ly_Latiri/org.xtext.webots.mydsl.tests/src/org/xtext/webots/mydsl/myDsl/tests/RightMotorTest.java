/**
 * generated by Xtext 2.22.0
 */
package org.xtext.webots.mydsl.myDsl.tests;

import junit.textui.TestRunner;

import org.xtext.webots.mydsl.myDsl.MyDslFactory;
import org.xtext.webots.mydsl.myDsl.RightMotor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Right Motor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RightMotorTest extends ActuatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RightMotorTest.class);
	}

	/**
	 * Constructs a new Right Motor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightMotorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Right Motor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RightMotor getFixture() {
		return (RightMotor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyDslFactory.eINSTANCE.createRightMotor());
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

} //RightMotorTest