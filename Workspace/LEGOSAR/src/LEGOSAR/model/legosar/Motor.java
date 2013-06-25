/**
 */
package LEGOSAR.model.legosar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.Motor#getMotor_port <em>Motor port</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getMotor()
 * @model
 * @generated
 */
public interface Motor extends Peripheral {
	/**
	 * Returns the value of the '<em><b>Motor port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor port</em>' attribute.
	 * @see #setMotor_port(char)
	 * @see LEGOSAR.model.legosar.LegosarPackage#getMotor_Motor_port()
	 * @model
	 * @generated
	 */
	char getMotor_port();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Motor#getMotor_port <em>Motor port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor port</em>' attribute.
	 * @see #getMotor_port()
	 * @generated
	 */
	void setMotor_port(char value);

} // Motor
