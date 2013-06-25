/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.Alarm;
import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.TaskImpl#getTask_alarm <em>Task alarm</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.TaskImpl#getTask_priority <em>Task priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getTask_alarm() <em>Task alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask_alarm()
	 * @generated
	 * @ordered
	 */
	protected Alarm task_alarm;

	/**
	 * The cached value of the '{@link #getTask_priority() <em>Task priority</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask_priority()
	 * @generated
	 * @ordered
	 */
	protected EList task_priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alarm getTask_alarm() {
		return task_alarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask_alarm(Alarm newTask_alarm, NotificationChain msgs) {
		Alarm oldTask_alarm = task_alarm;
		task_alarm = newTask_alarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodellPackage.TASK__TASK_ALARM, oldTask_alarm, newTask_alarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask_alarm(Alarm newTask_alarm) {
		if (newTask_alarm != task_alarm) {
			NotificationChain msgs = null;
			if (task_alarm != null)
				msgs = ((InternalEObject)task_alarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodellPackage.TASK__TASK_ALARM, null, msgs);
			if (newTask_alarm != null)
				msgs = ((InternalEObject)newTask_alarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodellPackage.TASK__TASK_ALARM, null, msgs);
			msgs = basicSetTask_alarm(newTask_alarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.TASK__TASK_ALARM, newTask_alarm, newTask_alarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTask_priority() {
		if (task_priority == null) {
			task_priority = new EDataTypeUniqueEList(Integer.class, this, MetamodellPackage.TASK__TASK_PRIORITY);
		}
		return task_priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodellPackage.TASK__TASK_ALARM:
				return basicSetTask_alarm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodellPackage.TASK__TASK_ALARM:
				return getTask_alarm();
			case MetamodellPackage.TASK__TASK_PRIORITY:
				return getTask_priority();
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
			case MetamodellPackage.TASK__TASK_ALARM:
				setTask_alarm((Alarm)newValue);
				return;
			case MetamodellPackage.TASK__TASK_PRIORITY:
				getTask_priority().clear();
				getTask_priority().addAll((Collection)newValue);
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
			case MetamodellPackage.TASK__TASK_ALARM:
				setTask_alarm((Alarm)null);
				return;
			case MetamodellPackage.TASK__TASK_PRIORITY:
				getTask_priority().clear();
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
			case MetamodellPackage.TASK__TASK_ALARM:
				return task_alarm != null;
			case MetamodellPackage.TASK__TASK_PRIORITY:
				return task_priority != null && !task_priority.isEmpty();
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
		result.append(" (task_priority: ");
		result.append(task_priority);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
