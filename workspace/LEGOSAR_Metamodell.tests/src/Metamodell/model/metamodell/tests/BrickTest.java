/**
 */
package Metamodell.model.metamodell.tests;

import Metamodell.model.metamodell.Brick;
import Metamodell.model.metamodell.MetamodellFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrickTest extends TestCase {

	/**
	 * The fixture for this Brick test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Brick fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BrickTest.class);
	}

	/**
	 * Constructs a new Brick test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrickTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Brick test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Brick fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Brick test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Brick getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(MetamodellFactory.eINSTANCE.createBrick());
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

} //BrickTest
