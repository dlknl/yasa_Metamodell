/**
 */
package Metamodell.model.metamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.Task#getTask_alarm <em>Task alarm</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.Task#getTask_priority <em>Task priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.model.metamodell.MetamodellPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Task alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task alarm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task alarm</em>' containment reference.
	 * @see #setTask_alarm(Alarm)
	 * @see Metamodell.model.metamodell.MetamodellPackage#getTask_Task_alarm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Alarm getTask_alarm();

	/**
	 * Sets the value of the '{@link Metamodell.model.metamodell.Task#getTask_alarm <em>Task alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task alarm</em>' containment reference.
	 * @see #getTask_alarm()
	 * @generated
	 */
	void setTask_alarm(Alarm value);

	/**
	 * Returns the value of the '<em><b>Task priority</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task priority</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task priority</em>' attribute list.
	 * @see Metamodell.model.metamodell.MetamodellPackage#getTask_Task_priority()
	 * @model upper="20"
	 * @generated
	 */
	EList getTask_priority();

} // Task
