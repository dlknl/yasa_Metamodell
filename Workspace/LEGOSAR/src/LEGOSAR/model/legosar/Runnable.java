/**
 */
package LEGOSAR.model.legosar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.Runnable#getRunnable_name <em>Runnable name</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Runnable#getRunnable_events <em>Runnable events</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.Runnable#getRunnable_task <em>Runnable task</em>}</li>
 * </ul>
 * </p>
 *
 * @see LEGOSAR.model.legosar.LegosarPackage#getRunnable()
 * @model
 * @generated
 */
public interface Runnable extends EObject {
	/**
	 * Returns the value of the '<em><b>Runnable name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable name</em>' attribute.
	 * @see #setRunnable_name(String)
	 * @see LEGOSAR.model.legosar.LegosarPackage#getRunnable_Runnable_name()
	 * @model
	 * @generated
	 */
	String getRunnable_name();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Runnable#getRunnable_name <em>Runnable name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runnable name</em>' attribute.
	 * @see #getRunnable_name()
	 * @generated
	 */
	void setRunnable_name(String value);

	/**
	 * Returns the value of the '<em><b>Runnable events</b></em>' reference list.
	 * The list contents are of type {@link LEGOSAR.model.legosar.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable events</em>' reference list.
	 * @see LEGOSAR.model.legosar.LegosarPackage#getRunnable_Runnable_events()
	 * @model
	 * @generated
	 */
	EList<Event> getRunnable_events();

	/**
	 * Returns the value of the '<em><b>Runnable task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable task</em>' reference.
	 * @see #setRunnable_task(Task)
	 * @see LEGOSAR.model.legosar.LegosarPackage#getRunnable_Runnable_task()
	 * @model required="true"
	 * @generated
	 */
	Task getRunnable_task();

	/**
	 * Sets the value of the '{@link LEGOSAR.model.legosar.Runnable#getRunnable_task <em>Runnable task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runnable task</em>' reference.
	 * @see #getRunnable_task()
	 * @generated
	 */
	void setRunnable_task(Task value);

} // Runnable
