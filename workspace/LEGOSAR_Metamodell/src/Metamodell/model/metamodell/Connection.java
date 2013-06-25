/**
 */
package Metamodell.model.metamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.Connection#getConn_source <em>Conn source</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.Connection#getConn_destinations <em>Conn destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Conn source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn source</em>' reference.
	 * @see #setConn_source(Port)
	 * @see Metamodell.model.metamodell.MetamodellPackage#getConnection_Conn_source()
	 * @model required="true"
	 * @generated
	 */
	Port getConn_source();

	/**
	 * Sets the value of the '{@link Metamodell.model.metamodell.Connection#getConn_source <em>Conn source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn source</em>' reference.
	 * @see #getConn_source()
	 * @generated
	 */
	void setConn_source(Port value);

	/**
	 * Returns the value of the '<em><b>Conn destinations</b></em>' reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn destinations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn destinations</em>' reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getConnection_Conn_destinations()
	 * @model type="Metamodell.model.metamodell.Port" required="true"
	 * @generated
	 */
	EList getConn_destinations();

} // Connection
