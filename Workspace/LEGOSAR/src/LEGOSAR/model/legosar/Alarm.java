/**
 */
package LEGOSAR.model.legosar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.Alarm#getAlarm_cycletime <em>Alarm cycletime</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getAlarm()
 * @model
 * @generated
 */
public interface Alarm extends EObject {
	/**
	 * Returns the value of the '<em><b>Alarm cycletime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm cycletime</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm cycletime</em>' attribute.
	 * @see #setAlarm_cycletime(int)
	 * @see LEGOSAR.model.legosar.LegosarPackage#getAlarm_Alarm_cycletime()
	 * @model required="true"
	 * @generated
	 */
	int getAlarm_cycletime();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Alarm#getAlarm_cycletime <em>Alarm cycletime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm cycletime</em>' attribute.
	 * @see #getAlarm_cycletime()
	 * @generated
	 */
	void setAlarm_cycletime(int value);

} // Alarm
