/**
 */
package LEGOSAR.model.legosar;

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
 *   <li>{@link LEGOSAR.model.legosar.Brick#getBrick_name <em>Brick name</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Brick#isBrick_isMaster <em>Brick is Master</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Brick#getBrick_bt_addr <em>Brick bt addr</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Brick#getBrick_peripherals <em>Brick peripherals</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Brick#getBrick_osek <em>Brick osek</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Brick#getBrick_swcs <em>Brick swcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getBrick()
 * @model
 * @generated
 */
public interface Brick extends EObject {
	/**
	 * Returns the value of the '<em><b>Brick name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick name</em>' attribute.
	 * @see #setBrick_name(String)
	 * @see LEGOSAR.model.legosar.LegosarPackage#getBrick_Brick_name()
	 * @model required="true"
	 * @generated
	 */
	String getBrick_name();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Brick#getBrick_name <em>Brick name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brick name</em>' attribute.
	 * @see #getBrick_name()
	 * @generated
	 */
	void setBrick_name(String value);

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
	 * @see LEGOSAR.model.legosar.LegosarPackage#getBrick_Brick_isMaster()
	 * @model required="true"
	 * @generated
	 */
	boolean isBrick_isMaster();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Brick#isBrick_isMaster <em>Brick is Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brick is Master</em>' attribute.
	 * @see #isBrick_isMaster()
	 * @generated
	 */
	void setBrick_isMaster(boolean value);

	/**
	 * Returns the value of the '<em><b>Brick bt addr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick bt addr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick bt addr</em>' attribute list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getBrick_Brick_bt_addr()
	 * @model unique="false" lower="7" upper="7"
	 * @generated
	 */
	EList<Integer> getBrick_bt_addr();

	/**
	 * Returns the value of the '<em><b>Brick peripherals</b></em>' containment reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.Peripheral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick peripherals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick peripherals</em>' containment reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getBrick_Brick_peripherals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Peripheral> getBrick_peripherals();

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
	 * @see LEGOSAR.model.legosar.LegosarPackage#getBrick_Brick_osek()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OSEKSystem getBrick_osek();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Brick#getBrick_osek <em>Brick osek</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brick osek</em>' containment reference.
	 * @see #getBrick_osek()
	 * @generated
	 */
	void setBrick_osek(OSEKSystem value);

	/**
	 * Returns the value of the '<em><b>Brick swcs</b></em>' reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.SWC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick swcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick swcs</em>' reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getBrick_Brick_swcs()
	 * @model
	 * @generated
	 */
	EList<SWC> getBrick_swcs();

} // Brick
