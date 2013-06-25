/**
 */
package Metamodell.model.metamodell.tests;

import Metamodell.model.metamodell.MetamodellFactory;
import Metamodell.model.metamodell.Motor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MotorTest extends PeripheralTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MotorTest.class);
	}

	/**
	 * Constructs a new Motor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Motor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Motor getFixture() {
		return (Motor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(MetamodellFactory.eINSTANCE.createMotor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MotorTest
