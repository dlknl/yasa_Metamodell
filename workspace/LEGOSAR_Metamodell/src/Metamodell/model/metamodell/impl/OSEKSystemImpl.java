/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.Event;
import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.OSEKSystem;
import Metamodell.model.metamodell.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSEK System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.OSEKSystemImpl#getOsek_tasks <em>Osek tasks</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.OSEKSystemImpl#getOsek_events <em>Osek events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSEKSystemImpl extends EObjectImpl implements OSEKSystem {
	/**
	 * The cached value of the '{@link #getOsek_tasks() <em>Osek tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsek_tasks()
	 * @generated
	 * @ordered
	 */
	protected EList osek_tasks;

	/**
	 * The cached value of the '{@link #getOsek_events() <em>Osek events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsek_events()
	 * @generated
	 * @ordered
	 */
	protected EList osek_events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSEKSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.OSEK_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOsek_tasks() {
		if (osek_tasks == null) {
			osek_tasks = new EObjectContainmentEList(Task.class, this, MetamodellPackage.OSEK_SYSTEM__OSEK_TASKS);
		}
		return osek_tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOsek_events() {
		if (osek_events == null) {
			osek_events = new EObjectContainmentEList(Event.class, this, MetamodellPackage.OSEK_SYSTEM__OSEK_EVENTS);
		}
		return osek_events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodellPackage.OSEK_SYSTEM__OSEK_TASKS:
				return ((InternalEList)getOsek_tasks()).basicRemove(otherEnd, msgs);
			case MetamodellPackage.OSEK_SYSTEM__OSEK_EVENTS:
				return ((InternalEList)getOsek_events()).basicRemove(otherEnd, msgs);
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
			case MetamodellPackage.OSEK_SYSTEM__OSEK_TASKS:
				return getOsek_tasks();
			case MetamodellPackage.OSEK_SYSTEM__OSEK_EVENTS:
				return getOsek_events();
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
			case MetamodellPackage.OSEK_SYSTEM__OSEK_TASKS:
				getOsek_tasks().clear();
				getOsek_tasks().addAll((Collection)newValue);
				return;
			case MetamodellPackage.OSEK_SYSTEM__OSEK_EVENTS:
				getOsek_events().clear();
				getOsek_events().addAll((Collection)newValue);
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
			case MetamodellPackage.OSEK_SYSTEM__OSEK_TASKS:
				getOsek_tasks().clear();
				return;
			case MetamodellPackage.OSEK_SYSTEM__OSEK_EVENTS:
				getOsek_events().clear();
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
			case MetamodellPackage.OSEK_SYSTEM__OSEK_TASKS:
				return osek_tasks != null && !osek_tasks.isEmpty();
			case MetamodellPackage.OSEK_SYSTEM__OSEK_EVENTS:
				return osek_events != null && !osek_events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OSEKSystemImpl
