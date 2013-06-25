/**
 */
package LEGOSAR.model.legosar.tests;

import LEGOSAR.model.legosar.LegosarFactory;
import LEGOSAR.model.legosar.TriggerPort;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trigger Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggerPortTest extends PortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TriggerPortTest.class);
	}

	/**
	 * Constructs a new Trigger Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trigger Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TriggerPort getFixture() {
		return (TriggerPort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LegosarFactory.eINSTANCE.createTriggerPort());
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

} //TriggerPortTest
