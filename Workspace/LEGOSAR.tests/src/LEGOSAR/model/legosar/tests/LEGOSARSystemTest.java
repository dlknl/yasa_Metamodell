/**
 */
package LEGOSAR.model.legosar.tests;

import LEGOSAR.model.legosar.LEGOSARSystem;
import LEGOSAR.model.legosar.LegosarFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>LEGOSAR System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LEGOSARSystemTest extends TestCase {

	/**
	 * The fixture for this LEGOSAR System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEGOSARSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LEGOSARSystemTest.class);
	}

	/**
	 * Constructs a new LEGOSAR System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEGOSARSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this LEGOSAR System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LEGOSARSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this LEGOSAR System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEGOSARSystem getFixture() {
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
		setFixture(LegosarFactory.eINSTANCE.createLEGOSARSystem());
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

} //LEGOSARSystemTest
