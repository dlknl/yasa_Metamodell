/**
 */
package Metamodell.model.metamodell.tests;

import Metamodell.model.metamodell.MetamodellFactory;
import Metamodell.model.metamodell.SenderReceiverport;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sender Receiverport</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SenderReceiverportTest extends PortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SenderReceiverportTest.class);
	}

	/**
	 * Constructs a new Sender Receiverport test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sender Receiverport test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SenderReceiverport getFixture() {
		return (SenderReceiverport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(MetamodellFactory.eINSTANCE.createSenderReceiverport());
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

} //SenderReceiverportTest
