/**
 */
package LEGOSAR.model.legosar;

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
 *   <li>{@link LEGOSAR.model.legosar.Hardware#getHw_bricks <em>Hw bricks</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getHardware()
 * @model
 * @generated
 */
public interface Hardware extends EObject {
	/**
	 * Returns the value of the '<em><b>Hw bricks</b></em>' containment reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.Brick}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw bricks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw bricks</em>' containment reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getHardware_Hw_bricks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Brick> getHw_bricks();

} // Hardware
