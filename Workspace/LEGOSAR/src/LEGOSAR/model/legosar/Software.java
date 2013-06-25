/**
 */
package LEGOSAR.model.legosar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.Software#getSw_swcs <em>Sw swcs</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Software#getSw_connections <em>Sw connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getSoftware()
 * @model
 * @generated
 */
public interface Software extends EObject {
	/**
	 * Returns the value of the '<em><b>Sw swcs</b></em>' containment reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.SWC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw swcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw swcs</em>' containment reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getSoftware_Sw_swcs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SWC> getSw_swcs();

	/**
	 * Returns the value of the '<em><b>Sw connections</b></em>' containment reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw connections</em>' containment reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getSoftware_Sw_connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getSw_connections();

} // Software
