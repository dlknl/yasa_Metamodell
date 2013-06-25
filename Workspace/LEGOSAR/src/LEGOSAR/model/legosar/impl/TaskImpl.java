/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.Alarm;
import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.Task;

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
 *   <li>{@link LEGOSAR.model.legosar.impl.TaskImpl#getTask_name <em>Task name</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.TaskImpl#getTask_priority <em>Task priority</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.TaskImpl#getTask_alarm <em>Task alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getTask_name() <em>Task name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask_name()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTask_name() <em>Task name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask_name()
	 * @generated
	 * @ordered
	 */
	protected String task_name = TASK_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTask_priority() <em>Task priority</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask_priority()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> task_priority;

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
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTask_name() {
		return task_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask_name(String newTask_name) {
		String oldTask_name = task_name;
		task_name = newTask_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.TASK__TASK_NAME, oldTask_name, task_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getTask_priority() {
		if (task_priority == null) {
			task_priority = new EDataTypeUniqueEList<Integer>(Integer.class, this, LegosarPackage.TASK__TASK_PRIORITY);
		}
		return task_priority;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegosarPackage.TASK__TASK_ALARM, oldTask_alarm, newTask_alarm);
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
				msgs = ((InternalEObject)task_alarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegosarPackage.TASK__TASK_ALARM, null, msgs);
			if (newTask_alarm != null)
				msgs = ((InternalEObject)newTask_alarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegosarPackage.TASK__TASK_ALARM, null, msgs);
			msgs = basicSetTask_alarm(newTask_alarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.TASK__TASK_ALARM, newTask_alarm, newTask_alarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LegosarPackage.TASK__TASK_ALARM:
				return basicSetTask_alarm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LegosarPackage.TASK__TASK_NAME:
				return getTask_name();
			case LegosarPackage.TASK__TASK_PRIORITY:
				return getTask_priority();
			case LegosarPackage.TASK__TASK_ALARM:
				return getTask_alarm();
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
			case LegosarPackage.TASK__TASK_NAME:
				setTask_name((String)newValue);
				return;
			case LegosarPackage.TASK__TASK_PRIORITY:
				getTask_priority().clear();
				getTask_priority().addAll((Collection<? extends Integer>)newValue);
				return;
			case LegosarPackage.TASK__TASK_ALARM:
				setTask_alarm((Alarm)newValue);
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
			case LegosarPackage.TASK__TASK_NAME:
				setTask_name(TASK_NAME_EDEFAULT);
				return;
			case LegosarPackage.TASK__TASK_PRIORITY:
				getTask_priority().clear();
				return;
			case LegosarPackage.TASK__TASK_ALARM:
				setTask_alarm((Alarm)null);
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
			case LegosarPackage.TASK__TASK_NAME:
				return TASK_NAME_EDEFAULT == null ? task_name != null : !TASK_NAME_EDEFAULT.equals(task_name);
			case LegosarPackage.TASK__TASK_PRIORITY:
				return task_priority != null && !task_priority.isEmpty();
			case LegosarPackage.TASK__TASK_ALARM:
				return task_alarm != null;
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
		result.append(" (task_name: ");
		result.append(task_name);
		result.append(", task_priority: ");
		result.append(task_priority);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
