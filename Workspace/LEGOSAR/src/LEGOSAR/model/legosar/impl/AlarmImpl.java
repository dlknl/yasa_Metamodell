/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.Alarm;
import LEGOSAR.model.legosar.LegosarPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.impl.AlarmImpl#getAlarm_cycletime <em>Alarm cycletime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlarmImpl extends EObjectImpl implements Alarm {
	/**
	 * The default value of the '{@link #getAlarm_cycletime() <em>Alarm cycletime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarm_cycletime()
	 * @generated
	 * @ordered
	 */
	protected static final int ALARM_CYCLETIME_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getAlarm_cycletime() <em>Alarm cycletime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarm_cycletime()
	 * @generated
	 * @ordered
	 */
	protected int alarm_cycletime = ALARM_CYCLETIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlarm_cycletime() {
		return alarm_cycletime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarm_cycletime(int newAlarm_cycletime) {
		int oldAlarm_cycletime = alarm_cycletime;
		alarm_cycletime = newAlarm_cycletime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.ALARM__ALARM_CYCLETIME, oldAlarm_cycletime, alarm_cycletime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LegosarPackage.ALARM__ALARM_CYCLETIME:
				return getAlarm_cycletime();
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
			case LegosarPackage.ALARM__ALARM_CYCLETIME:
				setAlarm_cycletime((Integer)newValue);
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
			case LegosarPackage.ALARM__ALARM_CYCLETIME:
				setAlarm_cycletime(ALARM_CYCLETIME_EDEFAULT);
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
			case LegosarPackage.ALARM__ALARM_CYCLETIME:
				return alarm_cycletime != ALARM_CYCLETIME_EDEFAULT;
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
		result.append(" (alarm_cycletime: ");
		result.append(alarm_cycletime);
		result.append(')');
		return result.toString();
	}

} //AlarmImpl
