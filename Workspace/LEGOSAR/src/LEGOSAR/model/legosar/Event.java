/**
 */
package LEGOSAR.model.legosar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.Event#getEvent_name <em>Event name</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Event name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event name</em>' attribute.
	 * @see #setEvent_name(String)
	 * @see LEGOSAR.model.legosar.LegosarPackage#getEvent_Event_name()
	 * @model
	 * @generated
	 */
	String getEvent_name();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Event#getEvent_name <em>Event name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event name</em>' attribute.
	 * @see #getEvent_name()
	 * @generated
	 */
	void setEvent_name(String value);

} // Event
