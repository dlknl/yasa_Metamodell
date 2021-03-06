/**
 */
package Metamodell.model.metamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.Port#getPort_name <em>Port name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Port name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port name</em>' attribute.
	 * @see #setPort_name(String)
	 * @see Metamodell.model.metamodell.MetamodellPackage#getPort_Port_name()
	 * @model
	 * @generated
	 */
	String getPort_name();

	/**
	 * Sets the value of the '{@link Metamodell.model.metamodell.Port#getPort_name <em>Port name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port name</em>' attribute.
	 * @see #getPort_name()
	 * @generated
	 */
	void setPort_name(String value);

} // Port
