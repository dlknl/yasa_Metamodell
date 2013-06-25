/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.Event;
import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.RunnableImpl#getRunnable_events <em>Runnable events</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.RunnableImpl#getRunnable_task <em>Runnable task</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.RunnableImpl#getRunnable_name <em>Runnable name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunnableImpl extends EObjectImpl implements Metamodell.model.metamodell.Runnable {
	/**
	 * The cached value of the '{@link #getRunnable_events() <em>Runnable events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnable_events()
	 * @generated
	 * @ordered
	 */
	protected EList runnable_events;

	/**
	 * The cached value of the '{@link #getRunnable_task() <em>Runnable task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnable_task()
	 * @generated
	 * @ordered
	 */
	protected Task runnable_task;

	/**
	 * The default value of the '{@link #getRunnable_name() <em>Runnable name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnable_name()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNNABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunnable_name() <em>Runnable name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnable_name()
	 * @generated
	 * @ordered
	 */
	protected String runnable_name = RUNNABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.RUNNABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRunnable_events() {
		if (runnable_events == null) {
			runnable_events = new EObjectResolvingEList(Event.class, this, MetamodellPackage.RUNNABLE__RUNNABLE_EVENTS);
		}
		return runnable_events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getRunnable_task() {
		if (runnable_task != null && runnable_task.eIsProxy()) {
			InternalEObject oldRunnable_task = (InternalEObject)runnable_task;
			runnable_task = (Task)eResolveProxy(oldRunnable_task);
			if (runnable_task != oldRunnable_task) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodellPackage.RUNNABLE__RUNNABLE_TASK, oldRunnable_task, runnable_task));
			}
		}
		return runnable_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetRunnable_task() {
		return runnable_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunnable_task(Task newRunnable_task) {
		Task oldRunnable_task = runnable_task;
		runnable_task = newRunnable_task;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.RUNNABLE__RUNNABLE_TASK, oldRunnable_task, runnable_task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRunnable_name() {
		return runnable_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunnable_name(String newRunnable_name) {
		String oldRunnable_name = runnable_name;
		runnable_name = newRunnable_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.RUNNABLE__RUNNABLE_NAME, oldRunnable_name, runnable_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodellPackage.RUNNABLE__RUNNABLE_EVENTS:
				return getRunnable_events();
			case MetamodellPackage.RUNNABLE__RUNNABLE_TASK:
				if (resolve) return getRunnable_task();
				return basicGetRunnable_task();
			case MetamodellPackage.RUNNABLE__RUNNABLE_NAME:
				return getRunnable_name();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodellPackage.RUNNABLE__RUNNABLE_EVENTS:
				getRunnable_events().clear();
				getRunnable_events().addAll((Collection)newValue);
				return;
			case MetamodellPackage.RUNNABLE__RUNNABLE_TASK:
				setRunnable_task((Task)newValue);
				return;
			case MetamodellPackage.RUNNABLE__RUNNABLE_NAME:
				setRunnable_name((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodellPackage.RUNNABLE__RUNNABLE_EVENTS:
				getRunnable_events().clear();
				return;
			case MetamodellPackage.RUNNABLE__RUNNABLE_TASK:
				setRunnable_task((Task)null);
				return;
			case MetamodellPackage.RUNNABLE__RUNNABLE_NAME:
				setRunnable_name(RUNNABLE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodellPackage.RUNNABLE__RUNNABLE_EVENTS:
				return runnable_events != null && !runnable_events.isEmpty();
			case MetamodellPackage.RUNNABLE__RUNNABLE_TASK:
				return runnable_task != null;
			case MetamodellPackage.RUNNABLE__RUNNABLE_NAME:
				return RUNNABLE_NAME_EDEFAULT == null ? runnable_name != null : !RUNNABLE_NAME_EDEFAULT.equals(runnable_name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (runnable_name: ");
		result.append(runnable_name);
		result.append(')');
		return result.toString();
	}

} //RunnableImpl
