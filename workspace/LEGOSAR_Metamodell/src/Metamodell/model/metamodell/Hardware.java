/**
 */
package Metamodell.model.metamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.Hardware#getHw_bricks <em>Hw bricks</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getHardware()
 * @model
 * @generated
 */
public interface Hardware extends EObject {
	/**
	 * Returns the value of the '<em><b>Hw bricks</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.Brick}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw bricks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw bricks</em>' containment reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getHardware_Hw_bricks()
	 * @model type="Metamodell.model.metamodell.Brick" containment="true" required="true"
	 * @generated
	 */
	EList getHw_bricks();

} // Hardware
