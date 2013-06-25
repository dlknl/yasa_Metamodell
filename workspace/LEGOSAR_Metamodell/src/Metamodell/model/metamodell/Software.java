/**
 */
package Metamodell.model.metamodell;

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
 *   <li>{@link Metamodell.model.metamodell.Software#getSw_connections <em>Sw connections</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.Software#getSw_swcs <em>Sw swcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getSoftware()
 * @model
 * @generated
 */
public interface Software extends EObject {
	/**
	 * Returns the value of the '<em><b>Sw connections</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw connections</em>' containment reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getSoftware_Sw_connections()
	 * @model type="Metamodell.model.metamodell.Connection" containment="true"
	 * @generated
	 */
	EList getSw_connections();

	/**
	 * Returns the value of the '<em><b>Sw swcs</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodell.model.metamodell.SWC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw swcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw swcs</em>' containment reference list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getSoftware_Sw_swcs()
	 * @model type="Metamodell.model.metamodell.SWC" containment="true" required="true"
	 * @generated
	 */
	EList getSw_swcs();

} // Software
