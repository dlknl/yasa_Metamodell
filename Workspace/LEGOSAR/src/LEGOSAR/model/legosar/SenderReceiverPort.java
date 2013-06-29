/**
 */
package LEGOSAR.model.legosar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sender Receiver Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.SenderReceiverPort#getPort_datatype <em>Port datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getSenderReceiverPort()
 * @model
 * @generated
 */
public interface SenderReceiverPort extends Port {
	/**
	 * Returns the value of the '<em><b>Port datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port datatype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port datatype</em>' attribute.
	 * @see #setPort_datatype(String)
	 * @see LEGOSAR.model.legosar.LegosarPackage#getSenderReceiverPort_Port_datatype()
	 * @model required="true"
	 * @generated
	 */
	String getPort_datatype();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.SenderReceiverPort#getPort_datatype <em>Port datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port datatype</em>' attribute.
	 * @see #getPort_datatype()
	 * @generated
	 */
	void setPort_datatype(String value);

} // SenderReceiverPort
