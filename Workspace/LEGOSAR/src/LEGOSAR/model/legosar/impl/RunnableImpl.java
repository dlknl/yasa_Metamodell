/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.Event;
import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.Task;

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
 *   <li>{@link LEGOSAR.model.legosar.impl.RunnableImpl#getRunnable_name <em>Runnable name</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.RunnableImpl#getRunnable_events <em>Runnable events</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.RunnableImpl#getRunnable_task <em>Runnable task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunnableImpl extends EObjectImpl implements LEGOSAR.model.legosar.Runnable {
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
	 * The cached value of the '{@link #getRunnable_events() <em>Runnable events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnable_events()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> runnable_events;

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
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.RUNNABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.RUNNABLE__RUNNABLE_NAME, oldRunnable_name, runnable_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getRunnable_events() {
		if (runnable_events == null) {
			runnable_events = new EObjectResolvingEList<Event>(Event.class, this, LegosarPackage.RUNNABLE__RUNNABLE_EVENTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LegosarPackage.RUNNABLE__RUNNABLE_TASK, oldRunnable_task, runnable_task));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.RUNNABLE__RUNNABLE_TASK, oldRunnable_task, runnable_task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LegosarPackage.RUNNABLE__RUNNABLE_NAME:
				return getRunnable_name();
			case LegosarPackage.RUNNABLE__RUNNABLE_EVENTS:
				return getRunnable_events();
			case LegosarPackage.RUNNABLE__RUNNABLE_TASK:
				if (resolve) return getRunnable_task();
				return basicGetRunnable_task();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LegosarPackage.RUNNABLE__RUNNABLE_NAME:
				setRunnable_name((String)newValue);
				return;
			case LegosarPackage.RUNNABLE__RUNNABLE_EVENTS:
				getRunnable_events().clear();
				getRunnable_events().addAll((Collection<? extends Event>)newValue);
				return;
			case LegosarPackage.RUNNABLE__RUNNABLE_TASK:
				setRunnable_task((Task)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LegosarPackage.RUNNABLE__RUNNABLE_NAME:
				setRunnable_name(RUNNABLE_NAME_EDEFAULT);
				return;
			case LegosarPackage.RUNNABLE__RUNNABLE_EVENTS:
				getRunnable_events().clear();
				return;
			case LegosarPackage.RUNNABLE__RUNNABLE_TASK:
				setRunnable_task((Task)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LegosarPackage.RUNNABLE__RUNNABLE_NAME:
				return RUNNABLE_NAME_EDEFAULT == null ? runnable_name != null : !RUNNABLE_NAME_EDEFAULT.equals(runnable_name);
			case LegosarPackage.RUNNABLE__RUNNABLE_EVENTS:
				return runnable_events != null && !runnable_events.isEmpty();
			case LegosarPackage.RUNNABLE__RUNNABLE_TASK:
				return runnable_task != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (runnable_name: ");
		result.append(runnable_name);
		result.append(')');
		return result.toString();
	}

} //RunnableImpl
