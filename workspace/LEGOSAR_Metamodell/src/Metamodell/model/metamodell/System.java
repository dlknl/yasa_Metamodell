/**
 */
package Metamodell.model.metamodell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.System#getSystem_hw <em>System hw</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.System#getSystem_sw <em>System sw</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>System hw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System hw</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System hw</em>' containment reference.
	 * @see #setSystem_hw(Hardware)
	 * @see Metamodell.model.metamodell.MetamodellPackage#getSystem_System_hw()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hardware getSystem_hw();

	/**
	 * Sets the value of the '{@link Metamodell.model.metamodell.System#getSystem_hw <em>System hw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System hw</em>' containment reference.
	 * @see #getSystem_hw()
	 * @generated
	 */
	void setSystem_hw(Hardware value);

	/**
	 * Returns the value of the '<em><b>System sw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System sw</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System sw</em>' containment reference.
	 * @see #setSystem_sw(Software)
	 * @see Metamodell.model.metamodell.MetamodellPackage#getSystem_System_sw()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Software getSystem_sw();

	/**
	 * Sets the value of the '{@link Metamodell.model.metamodell.System#getSystem_sw <em>System sw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System sw</em>' containment reference.
	 * @see #getSystem_sw()
	 * @generated
	 */
	void setSystem_sw(Software value);

} // System
