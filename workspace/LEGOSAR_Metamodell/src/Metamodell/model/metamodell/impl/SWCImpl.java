/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.Port;
import Metamodell.model.metamodell.SWC;

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
 * An implementation of the model object '<em><b>SWC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.SWCImpl#getSwc_runnables <em>Swc runnables</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.SWCImpl#getSwc_ports <em>Swc ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SWCImpl extends EObjectImpl implements SWC {
	/**
	 * The cached value of the '{@link #getSwc_runnables() <em>Swc runnables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwc_runnables()
	 * @generated
	 * @ordered
	 */
	protected EList swc_runnables;

	/**
	 * The cached value of the '{@link #getSwc_ports() <em>Swc ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwc_ports()
	 * @generated
	 * @ordered
	 */
	protected EList swc_ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SWCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.SWC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSwc_runnables() {
		if (swc_runnables == null) {
			swc_runnables = new EObjectContainmentEList(Metamodell.model.metamodell.Runnable.class, this, MetamodellPackage.SWC__SWC_RUNNABLES);
		}
		return swc_runnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSwc_ports() {
		if (swc_ports == null) {
			swc_ports = new EObjectContainmentEList(Port.class, this, MetamodellPackage.SWC__SWC_PORTS);
		}
		return swc_ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodellPackage.SWC__SWC_RUNNABLES:
				return ((InternalEList)getSwc_runnables()).basicRemove(otherEnd, msgs);
			case MetamodellPackage.SWC__SWC_PORTS:
				return ((InternalEList)getSwc_ports()).basicRemove(otherEnd, msgs);
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
			case MetamodellPackage.SWC__SWC_RUNNABLES:
				return getSwc_runnables();
			case MetamodellPackage.SWC__SWC_PORTS:
				return getSwc_ports();
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
			case MetamodellPackage.SWC__SWC_RUNNABLES:
				getSwc_runnables().clear();
				getSwc_runnables().addAll((Collection)newValue);
				return;
			case MetamodellPackage.SWC__SWC_PORTS:
				getSwc_ports().clear();
				getSwc_ports().addAll((Collection)newValue);
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
			case MetamodellPackage.SWC__SWC_RUNNABLES:
				getSwc_runnables().clear();
				return;
			case MetamodellPackage.SWC__SWC_PORTS:
				getSwc_ports().clear();
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
			case MetamodellPackage.SWC__SWC_RUNNABLES:
				return swc_runnables != null && !swc_runnables.isEmpty();
			case MetamodellPackage.SWC__SWC_PORTS:
				return swc_ports != null && !swc_ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SWCImpl
