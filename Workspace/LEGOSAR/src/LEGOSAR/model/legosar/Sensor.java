/**
 */
package LEGOSAR.model.legosar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.Sensor#getSensor_port <em>Sensor port</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Peripheral {
	/**
	 * Returns the value of the '<em><b>Sensor port</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor port</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor port</em>' attribute list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getSensor_Sensor_port()
	 * @model required="true" upper="4"
	 * @generated
	 */
	EList<Integer> getSensor_port();

} // Sensor
