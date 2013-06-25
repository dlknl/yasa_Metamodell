/**
 */
package Metamodell.model.metamodell;

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
 *   <li>{@link Metamodell.model.metamodell.OSEKSystem#getOsek_tasks <em>Osek tasks</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.OSEKSystem#getOsek_events <em>Osek events</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getOSEKSystem()
 * @model
 * @generated
 */
public interface OSEKSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Osek tasks</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osek tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osek tasks</em>' containment reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getOSEKSystem_Osek_tasks()
	 * @model type="Metamodell.model.metamodell.Task" containment="true"
	 * @generated
	 */
	EList getOsek_tasks();

	/**
	 * Returns the value of the '<em><b>Osek events</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osek events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osek events</em>' containment reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getOSEKSystem_Osek_events()
	 * @model type="Metamodell.model.metamodell.Event" containment="true"
	 * @generated
	 */
	EList getOsek_events();

} // OSEKSystem
