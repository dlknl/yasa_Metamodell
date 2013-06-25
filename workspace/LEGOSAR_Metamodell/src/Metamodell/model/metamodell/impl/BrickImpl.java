/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.Brick;
import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.OSEKSystem;
import Metamodell.model.metamodell.Peripheral;
import Metamodell.model.metamodell.SWC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.model.metamodell.impl.BrickImpl#getBrick_peripherals <em>Brick peripherals</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.BrickImpl#getBrick_osek <em>Brick osek</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.BrickImpl#getBrick_swcs <em>Brick swcs</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.BrickImpl#isBrick_isMaster <em>Brick is Master</em>}</li>
 *   <li>{@link Metamodell.model.metamodell.impl.BrickImpl#getBrick_bluetoothAddress <em>Brick bluetooth Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrickImpl extends EObjectImpl implements Brick {
	/**
	 * The cached value of the '{@link #getBrick_peripherals() <em>Brick peripherals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrick_peripherals()
	 * @generated
	 * @ordered
	 */
	protected EList brick_peripherals;

	/**
	 * The cached value of the '{@link #getBrick_osek() <em>Brick osek</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrick_osek()
	 * @generated
	 * @ordered
	 */
	protected OSEKSystem brick_osek;

	/**
	 * The cached value of the '{@link #getBrick_swcs() <em>Brick swcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrick_swcs()
	 * @generated
	 * @ordered
	 */
	protected EList brick_swcs;

	/**
	 * The default value of the '{@link #isBrick_isMaster() <em>Brick is Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBrick_isMaster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRICK_IS_MASTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBrick_isMaster() <em>Brick is Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBrick_isMaster()
	 * @generated
	 * @ordered
	 */
	protected boolean brick_isMaster = BRICK_IS_MASTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBrick_bluetoothAddress() <em>Brick bluetooth Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrick_bluetoothAddress()
	 * @generated
	 * @ordered
	 */
	protected EList brick_bluetoothAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrickImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.BRICK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBrick_peripherals() {
		if (brick_peripherals == null) {
			brick_peripherals = new EObjectResolvingEList(Peripheral.class, this, MetamodellPackage.BRICK__BRICK_PERIPHERALS);
		}
		return brick_peripherals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSEKSystem getBrick_osek() {
		return brick_osek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrick_osek(OSEKSystem newBrick_osek, NotificationChain msgs) {
		OSEKSystem oldBrick_osek = brick_osek;
		brick_osek = newBrick_osek;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodellPackage.BRICK__BRICK_OSEK, oldBrick_osek, newBrick_osek);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrick_osek(OSEKSystem newBrick_osek) {
		if (newBrick_osek != brick_osek) {
			NotificationChain msgs = null;
			if (brick_osek != null)
				msgs = ((InternalEObject)brick_osek).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodellPackage.BRICK__BRICK_OSEK, null, msgs);
			if (newBrick_osek != null)
				msgs = ((InternalEObject)newBrick_osek).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodellPackage.BRICK__BRICK_OSEK, null, msgs);
			msgs = basicSetBrick_osek(newBrick_osek, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.BRICK__BRICK_OSEK, newBrick_osek, newBrick_osek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBrick_swcs() {
		if (brick_swcs == null) {
			brick_swcs = new EObjectResolvingEList(SWC.class, this, MetamodellPackage.BRICK__BRICK_SWCS);
		}
		return brick_swcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBrick_isMaster() {
		return brick_isMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrick_isMaster(boolean newBrick_isMaster) {
		boolean oldBrick_isMaster = brick_isMaster;
		brick_isMaster = newBrick_isMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.BRICK__BRICK_IS_MASTER, oldBrick_isMaster, brick_isMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBrick_bluetoothAddress() {
		if (brick_bluetoothAddress == null) {
			brick_bluetoothAddress = new EDataTypeUniqueEList(byte[].class, this, MetamodellPackage.BRICK__BRICK_BLUETOOTH_ADDRESS);
		}
		return brick_bluetoothAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodellPackage.BRICK__BRICK_OSEK:
				return basicSetBrick_osek(null, msgs);
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
			case MetamodellPackage.BRICK__BRICK_PERIPHERALS:
				return getBrick_peripherals();
			case MetamodellPackage.BRICK__BRICK_OSEK:
				return getBrick_osek();
			case MetamodellPackage.BRICK__BRICK_SWCS:
				return getBrick_swcs();
			case MetamodellPackage.BRICK__BRICK_IS_MASTER:
				return isBrick_isMaster() ? Boolean.TRUE : Boolean.FALSE;
			case MetamodellPackage.BRICK__BRICK_BLUETOOTH_ADDRESS:
				return getBrick_bluetoothAddress();
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
			case MetamodellPackage.BRICK__BRICK_PERIPHERALS:
				getBrick_peripherals().clear();
				getBrick_peripherals().addAll((Collection)newValue);
				return;
			case MetamodellPackage.BRICK__BRICK_OSEK:
				setBrick_osek((OSEKSystem)newValue);
				return;
			case MetamodellPackage.BRICK__BRICK_SWCS:
				getBrick_swcs().clear();
				getBrick_swcs().addAll((Collection)newValue);
				return;
			case MetamodellPackage.BRICK__BRICK_IS_MASTER:
				setBrick_isMaster(((Boolean)newValue).booleanValue());
				return;
			case MetamodellPackage.BRICK__BRICK_BLUETOOTH_ADDRESS:
				getBrick_bluetoothAddress().clear();
				getBrick_bluetoothAddress().addAll((Collection)newValue);
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
			case MetamodellPackage.BRICK__BRICK_PERIPHERALS:
				getBrick_peripherals().clear();
				return;
			case MetamodellPackage.BRICK__BRICK_OSEK:
				setBrick_osek((OSEKSystem)null);
				return;
			case MetamodellPackage.BRICK__BRICK_SWCS:
				getBrick_swcs().clear();
				return;
			case MetamodellPackage.BRICK__BRICK_IS_MASTER:
				setBrick_isMaster(BRICK_IS_MASTER_EDEFAULT);
				return;
			case MetamodellPackage.BRICK__BRICK_BLUETOOTH_ADDRESS:
				getBrick_bluetoothAddress().clear();
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
			case MetamodellPackage.BRICK__BRICK_PERIPHERALS:
				return brick_peripherals != null && !brick_peripherals.isEmpty();
			case MetamodellPackage.BRICK__BRICK_OSEK:
				return brick_osek != null;
			case MetamodellPackage.BRICK__BRICK_SWCS:
				return brick_swcs != null && !brick_swcs.isEmpty();
			case MetamodellPackage.BRICK__BRICK_IS_MASTER:
				return brick_isMaster != BRICK_IS_MASTER_EDEFAULT;
			case MetamodellPackage.BRICK__BRICK_BLUETOOTH_ADDRESS:
				return brick_bluetoothAddress != null && !brick_bluetoothAddress.isEmpty();
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
		result.append(" (brick_isMaster: ");
		result.append(brick_isMaster);
		result.append(", brick_bluetoothAddress: ");
		result.append(brick_bluetoothAddress);
		result.append(')');
		return result.toString();
	}

} //BrickImpl
