/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.Connection;
import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.SWC;
import Metamodell.model.metamodell.Software;

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
 * An implementation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.SoftwareImpl#getSw_connections <em>Sw connections</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.SoftwareImpl#getSw_swcs <em>Sw swcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareImpl extends EObjectImpl implements Software {
	/**
	 * The cached value of the '{@link #getSw_connections() <em>Sw connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSw_connections()
	 * @generated
	 * @ordered
	 */
	protected EList sw_connections;

	/**
	 * The cached value of the '{@link #getSw_swcs() <em>Sw swcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSw_swcs()
	 * @generated
	 * @ordered
	 */
	protected EList sw_swcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.SOFTWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSw_connections() {
		if (sw_connections == null) {
			sw_connections = new EObjectContainmentEList(Connection.class, this, MetamodellPackage.SOFTWARE__SW_CONNECTIONS);
		}
		return sw_connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSw_swcs() {
		if (sw_swcs == null) {
			sw_swcs = new EObjectContainmentEList(SWC.class, this, MetamodellPackage.SOFTWARE__SW_SWCS);
		}
		return sw_swcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodellPackage.SOFTWARE__SW_CONNECTIONS:
				return ((InternalEList)getSw_connections()).basicRemove(otherEnd, msgs);
			case MetamodellPackage.SOFTWARE__SW_SWCS:
				return ((InternalEList)getSw_swcs()).basicRemove(otherEnd, msgs);
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
			case MetamodellPackage.SOFTWARE__SW_CONNECTIONS:
				return getSw_connections();
			case MetamodellPackage.SOFTWARE__SW_SWCS:
				return getSw_swcs();
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
			case MetamodellPackage.SOFTWARE__SW_CONNECTIONS:
				getSw_connections().clear();
				getSw_connections().addAll((Collection)newValue);
				return;
			case MetamodellPackage.SOFTWARE__SW_SWCS:
				getSw_swcs().clear();
				getSw_swcs().addAll((Collection)newValue);
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
			case MetamodellPackage.SOFTWARE__SW_CONNECTIONS:
				getSw_connections().clear();
				return;
			case MetamodellPackage.SOFTWARE__SW_SWCS:
				getSw_swcs().clear();
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
			case MetamodellPackage.SOFTWARE__SW_CONNECTIONS:
				return sw_connections != null && !sw_connections.isEmpty();
			case MetamodellPackage.SOFTWARE__SW_SWCS:
				return sw_swcs != null && !sw_swcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftwareImpl
