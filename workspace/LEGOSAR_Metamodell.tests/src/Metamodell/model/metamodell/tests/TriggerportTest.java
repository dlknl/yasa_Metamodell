/**
 */
package Metamodell.model.metamodell.tests;

import Metamodell.model.metamodell.MetamodellFactory;
import Metamodell.model.metamodell.Triggerport;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Triggerport</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggerportTest extends PortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TriggerportTest.class);
	}

	/**
	 * Constructs a new Triggerport test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Triggerport test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Triggerport getFixture() {
		return (Triggerport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(MetamodellFactory.eINSTANCE.createTriggerport());
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

} //TriggerportTest
