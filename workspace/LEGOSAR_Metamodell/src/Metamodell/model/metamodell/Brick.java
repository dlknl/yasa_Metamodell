/**
 */
package Metamodell.model.metamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.Brick#getBrick_peripherals <em>Brick peripherals</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.Brick#getBrick_osek <em>Brick osek</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.Brick#getBrick_swcs <em>Brick swcs</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.Brick#isBrick_isMaster <em>Brick is Master</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.Brick#getBrick_bluetoothAddress <em>Brick bluetooth Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getBrick()
 * @model
 * @generated
 */
public interface Brick extends EObject {
	/**
	 * Returns the value of the '<em><b>Brick peripherals</b></em>' reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.Peripheral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick peripherals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick peripherals</em>' reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getBrick_Brick_peripherals()
	 * @model type="Metamodell.model.metamodell.Peripheral"
	 * @generated
	 */
	EList getBrick_peripherals();

	/**
	 * Returns the value of the '<em><b>Brick osek</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick osek</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick osek</em>' containment reference.
	 * @see #setBrick_osek(OSEKSystem)
	 * @see Metamodell.model.metamodell.MetamodellPackage#getBrick_Brick_osek()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OSEKSystem getBrick_osek();

	/**
	 * Sets the value of the '{@link Metamodell.model.metamodell.Brick#getBrick_osek <em>Brick osek</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brick osek</em>' containment reference.
	 * @see #getBrick_osek()
	 * @generated
	 */
	void setBrick_osek(OSEKSystem value);

	/**
	 * Returns the value of the '<em><b>Brick swcs</b></em>' reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.SWC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick swcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick swcs</em>' reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getBrick_Brick_swcs()
	 * @model type="Metamodell.model.metamodell.SWC"
	 * @generated
	 */
	EList getBrick_swcs();

	/**
	 * Returns the value of the '<em><b>Brick is Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick is Master</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick is Master</em>' attribute.
	 * @see #setBrick_isMaster(boolean)
	 * @see Metamodell.model.metamodell.MetamodellPackage#getBrick_Brick_isMaster()
	 * @model
	 * @generated
	 */
	boolean isBrick_isMaster();

	/**
	 * Sets the value of the '{@link Metamodell.model.metamodell.Brick#isBrick_isMaster <em>Brick is Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brick is Master</em>' attribute.
	 * @see #isBrick_isMaster()
	 * @generated
	 */
	void setBrick_isMaster(boolean value);

	/**
	 * Returns the value of the '<em><b>Brick bluetooth Address</b></em>' attribute list.
	 * The list contents are of type {@link byte}[].
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick bluetooth Address</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick bluetooth Address</em>' attribute list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getBrick_Brick_bluetoothAddress()
	 * @model upper="255"
	 * @generated
	 */
	EList getBrick_bluetoothAddress();

} // Brick
