/**
 */
package LEGOSAR.model.legosar.tests;

import LEGOSAR.model.legosar.LegosarFactory;
import LEGOSAR.model.legosar.SenderReceiverPort;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sender Receiver Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SenderReceiverPortTest extends PortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SenderReceiverPortTest.class);
	}

	/**
	 * Constructs a new Sender Receiver Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sender Receiver Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SenderReceiverPort getFixture() {
		return (SenderReceiverPort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LegosarFactory.eINSTANCE.createSenderReceiverPort());
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

} //SenderReceiverPortTest
