/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.Alarm;
import Metamodell.model.metamodell.MetamodellPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.AlarmImpl#getAlarm_cycletime <em>Alarm cycletime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlarmImpl extends EObjectImpl implements Alarm {
	/**
	 * The cached value of the '{@link #getAlarm_cycletime() <em>Alarm cycletime</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarm_cycletime()
	 * @generated
	 * @ordered
	 */
	protected EList alarm_cycletime;

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
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAlarm_cycletime() {
		if (alarm_cycletime == null) {
			alarm_cycletime = new EDataTypeUniqueEList(Integer.class, this, MetamodellPackage.ALARM__ALARM_CYCLETIME);
		}
		return alarm_cycletime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodellPackage.ALARM__ALARM_CYCLETIME:
				return getAlarm_cycletime();
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
			case MetamodellPackage.ALARM__ALARM_CYCLETIME:
				getAlarm_cycletime().clear();
				getAlarm_cycletime().addAll((Collection)newValue);
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
			case MetamodellPackage.ALARM__ALARM_CYCLETIME:
				getAlarm_cycletime().clear();
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
			case MetamodellPackage.ALARM__ALARM_CYCLETIME:
				return alarm_cycletime != null && !alarm_cycletime.isEmpty();
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
		result.append(" (alarm_cycletime: ");
		result.append(alarm_cycletime);
		result.append(')');
		return result.toString();
	}

} //AlarmImpl
