/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.Hardware;
import LEGOSAR.model.legosar.LEGOSARSystem;
import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.Software;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEGOSAR System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.impl.LEGOSARSystemImpl#getSystem_hw <em>System hw</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.LEGOSARSystemImpl#getSystem_sw <em>System sw</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LEGOSARSystemImpl extends EObjectImpl implements LEGOSARSystem {
	/**
	 * The cached value of the '{@link #getSystem_hw() <em>System hw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_hw()
	 * @generated
	 * @ordered
	 */
	protected Hardware system_hw;

	/**
	 * The cached value of the '{@link #getSystem_sw() <em>System sw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_sw()
	 * @generated
	 * @ordered
	 */
	protected Software system_sw;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEGOSARSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.LEGOSAR_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware getSystem_hw() {
		return system_hw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem_hw(Hardware newSystem_hw, NotificationChain msgs) {
		Hardware oldSystem_hw = system_hw;
		system_hw = newSystem_hw;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_HW, oldSystem_hw, newSystem_hw);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem_hw(Hardware newSystem_hw) {
		if (newSystem_hw != system_hw) {
			NotificationChain msgs = null;
			if (system_hw != null)
				msgs = ((InternalEObject)system_hw).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_HW, null, msgs);
			if (newSystem_hw != null)
				msgs = ((InternalEObject)newSystem_hw).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_HW, null, msgs);
			msgs = basicSetSystem_hw(newSystem_hw, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_HW, newSystem_hw, newSystem_hw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software getSystem_sw() {
		return system_sw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem_sw(Software newSystem_sw, NotificationChain msgs) {
		Software oldSystem_sw = system_sw;
		system_sw = newSystem_sw;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_SW, oldSystem_sw, newSystem_sw);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem_sw(Software newSystem_sw) {
		if (newSystem_sw != system_sw) {
			NotificationChain msgs = null;
			if (system_sw != null)
				msgs = ((InternalEObject)system_sw).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_SW, null, msgs);
			if (newSystem_sw != null)
				msgs = ((InternalEObject)newSystem_sw).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_SW, null, msgs);
			msgs = basicSetSystem_sw(newSystem_sw, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_SW, newSystem_sw, newSystem_sw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_HW:
				return basicSetSystem_hw(null, msgs);
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_SW:
				return basicSetSystem_sw(null, msgs);
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
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_HW:
				return getSystem_hw();
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_SW:
				return getSystem_sw();
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
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_HW:
				setSystem_hw((Hardware)newValue);
				return;
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_SW:
				setSystem_sw((Software)newValue);
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
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_HW:
				setSystem_hw((Hardware)null);
				return;
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_SW:
				setSystem_sw((Software)null);
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
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_HW:
				return system_hw != null;
			case LegosarPackage.LEGOSAR_SYSTEM__SYSTEM_SW:
				return system_sw != null;
		}
		return super.eIsSet(featureID);
	}

} //LEGOSARSystemImpl
