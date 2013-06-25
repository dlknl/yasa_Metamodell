/**
 */
package LEGOSAR.model.legosar.tests;

import LEGOSAR.model.legosar.LegosarFactory;
import LEGOSAR.model.legosar.OSEKSystem;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OSEK System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSEKSystemTest extends TestCase {

	/**
	 * The fixture for this OSEK System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSEKSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSEKSystemTest.class);
	}

	/**
	 * Constructs a new OSEK System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSEKSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this OSEK System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OSEKSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this OSEK System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSEKSystem getFixture() {
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
		setFixture(LegosarFactory.eINSTANCE.createOSEKSystem());
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

} //OSEKSystemTest
