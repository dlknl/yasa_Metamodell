/**
 */
package LEGOSAR.model.legosar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSEK System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.OSEKSystem#getOsek_tasks <em>Osek tasks</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.OSEKSystem#getOsek_events <em>Osek events</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getOSEKSystem()
 * @model
 * @generated
 */
public interface OSEKSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Osek tasks</b></em>' containment reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osek tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osek tasks</em>' containment reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getOSEKSystem_Osek_tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getOsek_tasks();

	/**
	 * Returns the value of the '<em><b>Osek events</b></em>' containment reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osek events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osek events</em>' containment reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getOSEKSystem_Osek_events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getOsek_events();

} // OSEKSystem
