/**
 * generated by Xtext 2.22.0
 */
package org.xtext.webots.mydsl.myDsl.tests;

import junit.textui.TestRunner;

import org.xtext.webots.mydsl.myDsl.Home;
import org.xtext.webots.mydsl.myDsl.MyDslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HomeTest extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HomeTest.class);
	}

	/**
	 * Constructs a new Home test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Home test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Home getFixture() {
		return (Home)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyDslFactory.eINSTANCE.createHome());
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

} //HomeTest
