/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.Brick;
import LEGOSAR.model.legosar.Hardware;
import LEGOSAR.model.legosar.LegosarPackage;

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
 * An implementation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.impl.HardwareImpl#getHw_bricks <em>Hw bricks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareImpl extends EObjectImpl implements Hardware {
	/**
	 * The cached value of the '{@link #getHw_bricks() <em>Hw bricks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHw_bricks()
	 * @generated
	 * @ordered
	 */
	protected EList<Brick> hw_bricks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.HARDWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Brick> getHw_bricks() {
		if (hw_bricks == null) {
			hw_bricks = new EObjectContainmentEList<Brick>(Brick.class, this, LegosarPackage.HARDWARE__HW_BRICKS);
		}
		return hw_bricks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LegosarPackage.HARDWARE__HW_BRICKS:
				return ((InternalEList<?>)getHw_bricks()).basicRemove(otherEnd, msgs);
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
			case LegosarPackage.HARDWARE__HW_BRICKS:
				return getHw_bricks();
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
			case LegosarPackage.HARDWARE__HW_BRICKS:
				getHw_bricks().clear();
				getHw_bricks().addAll((Collection<? extends Brick>)newValue);
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
			case LegosarPackage.HARDWARE__HW_BRICKS:
				getHw_bricks().clear();
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
			case LegosarPackage.HARDWARE__HW_BRICKS:
				return hw_bricks != null && !hw_bricks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwareImpl
