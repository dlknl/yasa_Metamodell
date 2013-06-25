/**
 */
package Metamodell.model.metamodell;

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
 *   <li>{@link Metamodell.model.metamodell.SWC#getSwc_runnables <em>Swc runnables</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.SWC#getSwc_ports <em>Swc ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getSWC()
 * @model
 * @generated
 */
public interface SWC extends EObject {
	/**
	 * Returns the value of the '<em><b>Swc runnables</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc runnables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc runnables</em>' containment reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getSWC_Swc_runnables()
	 * @model type="Metamodell.model.metamodell.Runnable" containment="true" required="true"
	 * @generated
	 */
	EList getSwc_runnables();

	/**
	 * Returns the value of the '<em><b>Swc ports</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc ports</em>' containment reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getSWC_Swc_ports()
	 * @model type="Metamodell.model.metamodell.Port" containment="true"
	 * @generated
	 */
	EList getSwc_ports();

} // SWC
