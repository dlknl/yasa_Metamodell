/**
 */
package Metamodell.model.metamodell;

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
 *   <li>{@link Metamodell.model.metamodell.Alarm#getAlarm_cycletime <em>Alarm cycletime</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getAlarm()
 * @model
 * @generated
 */
public interface Alarm extends EObject {
	/**
	 * Returns the value of the '<em><b>Alarm cycletime</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm cycletime</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm cycletime</em>' attribute list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getAlarm_Alarm_cycletime()
	 * @model lower="10" upper="100000"
	 * @generated
	 */
	EList getAlarm_cycletime();

} // Alarm
