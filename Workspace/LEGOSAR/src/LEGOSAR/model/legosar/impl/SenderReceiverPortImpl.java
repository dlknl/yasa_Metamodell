/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.SenderReceiverPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Receiver Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.impl.SenderReceiverPortImpl#getPort_datatype <em>Port datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenderReceiverPortImpl extends PortImpl implements SenderReceiverPort {
	/**
	 * The default value of the '{@link #getPort_datatype() <em>Port datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_datatype()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_DATATYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort_datatype() <em>Port datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_datatype()
	 * @generated
	 * @ordered
	 */
	protected String port_datatype = PORT_DATATYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderReceiverPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.SENDER_RECEIVER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort_datatype() {
		return port_datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_datatype(String newPort_datatype) {
		String oldPort_datatype = port_datatype;
		port_datatype = newPort_datatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.SENDER_RECEIVER_PORT__PORT_DATATYPE, oldPort_datatype, port_datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LegosarPackage.SENDER_RECEIVER_PORT__PORT_DATATYPE:
				return getPort_datatype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LegosarPackage.SENDER_RECEIVER_PORT__PORT_DATATYPE:
				setPort_datatype((String)newValue);
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
			case LegosarPackage.SENDER_RECEIVER_PORT__PORT_DATATYPE:
				setPort_datatype(PORT_DATATYPE_EDEFAULT);
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
			case LegosarPackage.SENDER_RECEIVER_PORT__PORT_DATATYPE:
				return PORT_DATATYPE_EDEFAULT == null ? port_datatype != null : !PORT_DATATYPE_EDEFAULT.equals(port_datatype);
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
		result.append(" (port_datatype: ");
		result.append(port_datatype);
		result.append(')');
		return result.toString();
	}

} //SenderReceiverPortImpl
