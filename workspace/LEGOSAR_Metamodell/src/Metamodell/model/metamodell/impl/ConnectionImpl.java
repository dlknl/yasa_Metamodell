/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.Connection;
import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.Port;

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
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.ConnectionImpl#getConn_source <em>Conn source</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.ConnectionImpl#getConn_destinations <em>Conn destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends EObjectImpl implements Connection {
	/**
	 * The cached value of the '{@link #getConn_source() <em>Conn source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConn_source()
	 * @generated
	 * @ordered
	 */
	protected Port conn_source;

	/**
	 * The cached value of the '{@link #getConn_destinations() <em>Conn destinations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConn_destinations()
	 * @generated
	 * @ordered
	 */
	protected EList conn_destinations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getConn_source() {
		if (conn_source != null && conn_source.eIsProxy()) {
			InternalEObject oldConn_source = (InternalEObject)conn_source;
			conn_source = (Port)eResolveProxy(oldConn_source);
			if (conn_source != oldConn_source) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodellPackage.CONNECTION__CONN_SOURCE, oldConn_source, conn_source));
			}
		}
		return conn_source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetConn_source() {
		return conn_source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConn_source(Port newConn_source) {
		Port oldConn_source = conn_source;
		conn_source = newConn_source;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.CONNECTION__CONN_SOURCE, oldConn_source, conn_source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConn_destinations() {
		if (conn_destinations == null) {
			conn_destinations = new EObjectResolvingEList(Port.class, this, MetamodellPackage.CONNECTION__CONN_DESTINATIONS);
		}
		return conn_destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodellPackage.CONNECTION__CONN_SOURCE:
				if (resolve) return getConn_source();
				return basicGetConn_source();
			case MetamodellPackage.CONNECTION__CONN_DESTINATIONS:
				return getConn_destinations();
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
			case MetamodellPackage.CONNECTION__CONN_SOURCE:
				setConn_source((Port)newValue);
				return;
			case MetamodellPackage.CONNECTION__CONN_DESTINATIONS:
				getConn_destinations().clear();
				getConn_destinations().addAll((Collection)newValue);
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
			case MetamodellPackage.CONNECTION__CONN_SOURCE:
				setConn_source((Port)null);
				return;
			case MetamodellPackage.CONNECTION__CONN_DESTINATIONS:
				getConn_destinations().clear();
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
			case MetamodellPackage.CONNECTION__CONN_SOURCE:
				return conn_source != null;
			case MetamodellPackage.CONNECTION__CONN_DESTINATIONS:
				return conn_destinations != null && !conn_destinations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
