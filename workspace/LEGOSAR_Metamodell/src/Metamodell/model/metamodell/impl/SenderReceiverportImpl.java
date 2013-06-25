/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.SenderReceiverport;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Receiverport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.SenderReceiverportImpl#getSrport_datatype <em>Srport datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenderReceiverportImpl extends PortImpl implements SenderReceiverport {
	/**
	 * The default value of the '{@link #getSrport_datatype() <em>Srport datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrport_datatype()
	 * @generated
	 * @ordered
	 */
	protected static final String SRPORT_DATATYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrport_datatype() <em>Srport datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrport_datatype()
	 * @generated
	 * @ordered
	 */
	protected String srport_datatype = SRPORT_DATATYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderReceiverportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.SENDER_RECEIVERPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrport_datatype() {
		return srport_datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrport_datatype(String newSrport_datatype) {
		String oldSrport_datatype = srport_datatype;
		srport_datatype = newSrport_datatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.SENDER_RECEIVERPORT__SRPORT_DATATYPE, oldSrport_datatype, srport_datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodellPackage.SENDER_RECEIVERPORT__SRPORT_DATATYPE:
				return getSrport_datatype();
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
			case MetamodellPackage.SENDER_RECEIVERPORT__SRPORT_DATATYPE:
				setSrport_datatype((String)newValue);
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
			case MetamodellPackage.SENDER_RECEIVERPORT__SRPORT_DATATYPE:
				setSrport_datatype(SRPORT_DATATYPE_EDEFAULT);
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
			case MetamodellPackage.SENDER_RECEIVERPORT__SRPORT_DATATYPE:
				return SRPORT_DATATYPE_EDEFAULT == null ? srport_datatype != null : !SRPORT_DATATYPE_EDEFAULT.equals(srport_datatype);
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
		result.append(" (srport_datatype: ");
		result.append(srport_datatype);
		result.append(')');
		return result.toString();
	}

} //SenderReceiverportImpl
