/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.Peripheral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peripheral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.PeripheralImpl#getPeripheral_port <em>Peripheral port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PeripheralImpl extends EObjectImpl implements Peripheral {
	/**
	 * The default value of the '{@link #getPeripheral_port() <em>Peripheral port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripheral_port()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIPHERAL_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeripheral_port() <em>Peripheral port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripheral_port()
	 * @generated
	 * @ordered
	 */
	protected String peripheral_port = PERIPHERAL_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeripheralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.PERIPHERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeripheral_port() {
		return peripheral_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeripheral_port(String newPeripheral_port) {
		String oldPeripheral_port = peripheral_port;
		peripheral_port = newPeripheral_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.PERIPHERAL__PERIPHERAL_PORT, oldPeripheral_port, peripheral_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodellPackage.PERIPHERAL__PERIPHERAL_PORT:
				return getPeripheral_port();
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
			case MetamodellPackage.PERIPHERAL__PERIPHERAL_PORT:
				setPeripheral_port((String)newValue);
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
			case MetamodellPackage.PERIPHERAL__PERIPHERAL_PORT:
				setPeripheral_port(PERIPHERAL_PORT_EDEFAULT);
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
			case MetamodellPackage.PERIPHERAL__PERIPHERAL_PORT:
				return PERIPHERAL_PORT_EDEFAULT == null ? peripheral_port != null : !PERIPHERAL_PORT_EDEFAULT.equals(peripheral_port);
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
		result.append(" (peripheral_port: ");
		result.append(peripheral_port);
		result.append(')');
		return result.toString();
	}

} //PeripheralImpl
