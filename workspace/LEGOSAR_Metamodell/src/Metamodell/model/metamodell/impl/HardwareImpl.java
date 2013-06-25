/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.Brick;
import Metamodell.model.metamodell.Hardware;
import Metamodell.model.metamodell.MetamodellPackage;

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
 *   <li>{@link Metamodell.model.metamodell.impl.HardwareImpl#getHw_bricks <em>Hw bricks</em>}</li>
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
	protected EList hw_bricks;

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
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.HARDWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHw_bricks() {
		if (hw_bricks == null) {
			hw_bricks = new EObjectContainmentEList(Brick.class, this, MetamodellPackage.HARDWARE__HW_BRICKS);
		}
		return hw_bricks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodellPackage.HARDWARE__HW_BRICKS:
				return ((InternalEList)getHw_bricks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodellPackage.HARDWARE__HW_BRICKS:
				return getHw_bricks();
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
			case MetamodellPackage.HARDWARE__HW_BRICKS:
				getHw_bricks().clear();
				getHw_bricks().addAll((Collection)newValue);
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
			case MetamodellPackage.HARDWARE__HW_BRICKS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodellPackage.HARDWARE__HW_BRICKS:
				return hw_bricks != null && !hw_bricks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwareImpl
