/**
 */
package Metamodell.model.metamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peripheral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.Peripheral#getPeripheral_port <em>Peripheral port</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getPeripheral()
 * @model abstract="true"
 * @generated
 */
public interface Peripheral extends EObject {
	/**
	 * Returns the value of the '<em><b>Peripheral port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peripheral port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripheral port</em>' attribute.
	 * @see #setPeripheral_port(String)
	 * @see Metamodell.model.metamodell.MetamodellPackage#getPeripheral_Peripheral_port()
	 * @model
	 * @generated
	 */
	String getPeripheral_port();

	/**
	 * Sets the value of the '{@link Metamodell.model.metamodell.Peripheral#getPeripheral_port <em>Peripheral port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peripheral port</em>' attribute.
	 * @see #getPeripheral_port()
	 * @generated
	 */
	void setPeripheral_port(String value);

} // Peripheral
