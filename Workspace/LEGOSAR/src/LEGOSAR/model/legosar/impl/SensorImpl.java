/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.impl.SensorImpl#getSensor_port <em>Sensor port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends PeripheralImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getSensor_port() <em>Sensor port</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor_port()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sensor_port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSensor_port() {
		if (sensor_port == null) {
			sensor_port = new EDataTypeUniqueEList<Integer>(Integer.class, this, LegosarPackage.SENSOR__SENSOR_PORT);
		}
		return sensor_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LegosarPackage.SENSOR__SENSOR_PORT:
				return getSensor_port();
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
			case LegosarPackage.SENSOR__SENSOR_PORT:
				getSensor_port().clear();
				getSensor_port().addAll((Collection<? extends Integer>)newValue);
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
			case LegosarPackage.SENSOR__SENSOR_PORT:
				getSensor_port().clear();
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
			case LegosarPackage.SENSOR__SENSOR_PORT:
				return sensor_port != null && !sensor_port.isEmpty();
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
		result.append(" (sensor_port: ");
		result.append(sensor_port);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
