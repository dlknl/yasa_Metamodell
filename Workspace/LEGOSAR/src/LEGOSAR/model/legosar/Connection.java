/**
 */
package LEGOSAR.model.legosar;

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
 *   <li>{@link LEGOSAR.model.legosar.Connection#getConn_name <em>Conn name</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Connection#getConn_source <em>Conn source</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Connection#getConn_destinations <em>Conn destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Conn name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn name</em>' attribute.
	 * @see #setConn_name(String)
	 * @see LEGOSAR.model.legosar.LegosarPackage#getConnection_Conn_name()
	 * @model
	 * @generated
	 */
	String getConn_name();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Connection#getConn_name <em>Conn name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn name</em>' attribute.
	 * @see #getConn_name()
	 * @generated
	 */
	void setConn_name(String value);

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
	 * @see LEGOSAR.model.legosar.LegosarPackage#getConnection_Conn_source()
	 * @model required="true"
	 * @generated
	 */
	Port getConn_source();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Connection#getConn_source <em>Conn source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn source</em>' reference.
	 * @see #getConn_source()
	 * @generated
	 */
	void setConn_source(Port value);

	/**
	 * Returns the value of the '<em><b>Conn destinations</b></em>' reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn destinations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn destinations</em>' reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getConnection_Conn_destinations()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getConn_destinations();

} // Connection
