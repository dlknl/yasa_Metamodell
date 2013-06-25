/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.Connection;
import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.SWC;
import LEGOSAR.model.legosar.Software;

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
 *   <li>{@link LEGOSAR.model.legosar.impl.SoftwareImpl#getSw_swcs <em>Sw swcs</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.SoftwareImpl#getSw_connections <em>Sw connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareImpl extends EObjectImpl implements Software {
	/**
	 * The cached value of the '{@link #getSw_swcs() <em>Sw swcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSw_swcs()
	 * @generated
	 * @ordered
	 */
	protected EList<SWC> sw_swcs;

	/**
	 * The cached value of the '{@link #getSw_connections() <em>Sw connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSw_connections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> sw_connections;

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
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.SOFTWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SWC> getSw_swcs() {
		if (sw_swcs == null) {
			sw_swcs = new EObjectContainmentEList<SWC>(SWC.class, this, LegosarPackage.SOFTWARE__SW_SWCS);
		}
		return sw_swcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getSw_connections() {
		if (sw_connections == null) {
			sw_connections = new EObjectContainmentEList<Connection>(Connection.class, this, LegosarPackage.SOFTWARE__SW_CONNECTIONS);
		}
		return sw_connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LegosarPackage.SOFTWARE__SW_SWCS:
				return ((InternalEList<?>)getSw_swcs()).basicRemove(otherEnd, msgs);
			case LegosarPackage.SOFTWARE__SW_CONNECTIONS:
				return ((InternalEList<?>)getSw_connections()).basicRemove(otherEnd, msgs);
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
			case LegosarPackage.SOFTWARE__SW_SWCS:
				return getSw_swcs();
			case LegosarPackage.SOFTWARE__SW_CONNECTIONS:
				return getSw_connections();
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
			case LegosarPackage.SOFTWARE__SW_SWCS:
				getSw_swcs().clear();
				getSw_swcs().addAll((Collection<? extends SWC>)newValue);
				return;
			case LegosarPackage.SOFTWARE__SW_CONNECTIONS:
				getSw_connections().clear();
				getSw_connections().addAll((Collection<? extends Connection>)newValue);
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
			case LegosarPackage.SOFTWARE__SW_SWCS:
				getSw_swcs().clear();
				return;
			case LegosarPackage.SOFTWARE__SW_CONNECTIONS:
				getSw_connections().clear();
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
			case LegosarPackage.SOFTWARE__SW_SWCS:
				return sw_swcs != null && !sw_swcs.isEmpty();
			case LegosarPackage.SOFTWARE__SW_CONNECTIONS:
				return sw_connections != null && !sw_connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftwareImpl
