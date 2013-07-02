/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.Connection;
import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.Port;

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
 *   <li>{@link LEGOSAR.model.legosar.impl.ConnectionImpl#getConn_name <em>Conn name</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.ConnectionImpl#getConn_source <em>Conn source</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.ConnectionImpl#getConn_destination <em>Conn destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends EObjectImpl implements Connection {
	/**
	 * The default value of the '{@link #getConn_name() <em>Conn name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConn_name()
	 * @generated
	 * @ordered
	 */
	protected static final String CONN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConn_name() <em>Conn name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConn_name()
	 * @generated
	 * @ordered
	 */
	protected String conn_name = CONN_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getConn_destination() <em>Conn destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConn_destination()
	 * @generated
	 * @ordered
	 */
	protected Port conn_destination;

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
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConn_name() {
		return conn_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConn_name(String newConn_name) {
		String oldConn_name = conn_name;
		conn_name = newConn_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.CONNECTION__CONN_NAME, oldConn_name, conn_name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LegosarPackage.CONNECTION__CONN_SOURCE, oldConn_source, conn_source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.CONNECTION__CONN_SOURCE, oldConn_source, conn_source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getConn_destination() {
		if (conn_destination != null && conn_destination.eIsProxy()) {
			InternalEObject oldConn_destination = (InternalEObject)conn_destination;
			conn_destination = (Port)eResolveProxy(oldConn_destination);
			if (conn_destination != oldConn_destination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LegosarPackage.CONNECTION__CONN_DESTINATION, oldConn_destination, conn_destination));
			}
		}
		return conn_destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetConn_destination() {
		return conn_destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConn_destination(Port newConn_destination) {
		Port oldConn_destination = conn_destination;
		conn_destination = newConn_destination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.CONNECTION__CONN_DESTINATION, oldConn_destination, conn_destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LegosarPackage.CONNECTION__CONN_NAME:
				return getConn_name();
			case LegosarPackage.CONNECTION__CONN_SOURCE:
				if (resolve) return getConn_source();
				return basicGetConn_source();
			case LegosarPackage.CONNECTION__CONN_DESTINATION:
				if (resolve) return getConn_destination();
				return basicGetConn_destination();
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
			case LegosarPackage.CONNECTION__CONN_NAME:
				setConn_name((String)newValue);
				return;
			case LegosarPackage.CONNECTION__CONN_SOURCE:
				setConn_source((Port)newValue);
				return;
			case LegosarPackage.CONNECTION__CONN_DESTINATION:
				setConn_destination((Port)newValue);
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
			case LegosarPackage.CONNECTION__CONN_NAME:
				setConn_name(CONN_NAME_EDEFAULT);
				return;
			case LegosarPackage.CONNECTION__CONN_SOURCE:
				setConn_source((Port)null);
				return;
			case LegosarPackage.CONNECTION__CONN_DESTINATION:
				setConn_destination((Port)null);
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
			case LegosarPackage.CONNECTION__CONN_NAME:
				return CONN_NAME_EDEFAULT == null ? conn_name != null : !CONN_NAME_EDEFAULT.equals(conn_name);
			case LegosarPackage.CONNECTION__CONN_SOURCE:
				return conn_source != null;
			case LegosarPackage.CONNECTION__CONN_DESTINATION:
				return conn_destination != null;
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
		result.append(" (conn_name: ");
		result.append(conn_name);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
