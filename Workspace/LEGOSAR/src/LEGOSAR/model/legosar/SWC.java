/**
 */
package LEGOSAR.model.legosar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SWC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.SWC#getSwc_name <em>Swc name</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.SWC#getSwc_ports <em>Swc ports</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.SWC#getSwc_runnables <em>Swc runnables</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getSWC()
 * @model
 * @generated
 */
public interface SWC extends EObject {
	/**
	 * Returns the value of the '<em><b>Swc name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc name</em>' attribute.
	 * @see #setSwc_name(String)
	 * @see LEGOSAR.model.legosar.LegosarPackage#getSWC_Swc_name()
	 * @model required="true"
	 * @generated
	 */
	String getSwc_name();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.SWC#getSwc_name <em>Swc name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swc name</em>' attribute.
	 * @see #getSwc_name()
	 * @generated
	 */
	void setSwc_name(String value);

	/**
	 * Returns the value of the '<em><b>Swc ports</b></em>' containment reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc ports</em>' containment reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getSWC_Swc_ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getSwc_ports();

	/**
	 * Returns the value of the '<em><b>Swc runnables</b></em>' containment reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc runnables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc runnables</em>' containment reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getSWC_Swc_runnables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LEGOSAR.model.legosar.Runnable> getSwc_runnables();

} // SWC
