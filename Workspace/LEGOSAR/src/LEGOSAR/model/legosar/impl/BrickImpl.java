/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.Brick;
import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.OSEKSystem;
import LEGOSAR.model.legosar.Peripheral;
import LEGOSAR.model.legosar.SWC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.impl.BrickImpl#getBrick_name <em>Brick name</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.BrickImpl#isBrick_isMaster <em>Brick is Master</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.BrickImpl#getBrick_bt_addr <em>Brick bt addr</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.BrickImpl#getBrick_peripherals <em>Brick peripherals</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.BrickImpl#getBrick_osek <em>Brick osek</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.BrickImpl#getBrick_swcs <em>Brick swcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrickImpl extends EObjectImpl implements Brick {
	/**
	 * The default value of the '{@link #getBrick_name() <em>Brick name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrick_name()
	 * @generated
	 * @ordered
	 */
	protected static final String BRICK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrick_name() <em>Brick name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrick_name()
	 * @generated
	 * @ordered
	 */
	protected String brick_name = BRICK_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getBrick_bt_addr() <em>Brick bt addr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrick_bt_addr()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> brick_bt_addr;

	/**
	 * The cached value of the '{@link #getBrick_peripherals() <em>Brick peripherals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrick_peripherals()
	 * @generated
	 * @ordered
	 */
	protected EList<Peripheral> brick_peripherals;

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
	protected EList<SWC> brick_swcs;

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
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.BRICK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrick_name() {
		return brick_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrick_name(String newBrick_name) {
		String oldBrick_name = brick_name;
		brick_name = newBrick_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.BRICK__BRICK_NAME, oldBrick_name, brick_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.BRICK__BRICK_IS_MASTER, oldBrick_isMaster, brick_isMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getBrick_bt_addr() {
		if (brick_bt_addr == null) {
			brick_bt_addr = new EDataTypeEList<Integer>(Integer.class, this, LegosarPackage.BRICK__BRICK_BT_ADDR);
		}
		return brick_bt_addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Peripheral> getBrick_peripherals() {
		if (brick_peripherals == null) {
			brick_peripherals = new EObjectContainmentEList<Peripheral>(Peripheral.class, this, LegosarPackage.BRICK__BRICK_PERIPHERALS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LegosarPackage.BRICK__BRICK_OSEK, oldBrick_osek, newBrick_osek);
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
				msgs = ((InternalEObject)brick_osek).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LegosarPackage.BRICK__BRICK_OSEK, null, msgs);
			if (newBrick_osek != null)
				msgs = ((InternalEObject)newBrick_osek).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LegosarPackage.BRICK__BRICK_OSEK, null, msgs);
			msgs = basicSetBrick_osek(newBrick_osek, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.BRICK__BRICK_OSEK, newBrick_osek, newBrick_osek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SWC> getBrick_swcs() {
		if (brick_swcs == null) {
			brick_swcs = new EObjectResolvingEList<SWC>(SWC.class, this, LegosarPackage.BRICK__BRICK_SWCS);
		}
		return brick_swcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LegosarPackage.BRICK__BRICK_PERIPHERALS:
				return ((InternalEList<?>)getBrick_peripherals()).basicRemove(otherEnd, msgs);
			case LegosarPackage.BRICK__BRICK_OSEK:
				return basicSetBrick_osek(null, msgs);
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
			case LegosarPackage.BRICK__BRICK_NAME:
				return getBrick_name();
			case LegosarPackage.BRICK__BRICK_IS_MASTER:
				return isBrick_isMaster();
			case LegosarPackage.BRICK__BRICK_BT_ADDR:
				return getBrick_bt_addr();
			case LegosarPackage.BRICK__BRICK_PERIPHERALS:
				return getBrick_peripherals();
			case LegosarPackage.BRICK__BRICK_OSEK:
				return getBrick_osek();
			case LegosarPackage.BRICK__BRICK_SWCS:
				return getBrick_swcs();
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
			case LegosarPackage.BRICK__BRICK_NAME:
				setBrick_name((String)newValue);
				return;
			case LegosarPackage.BRICK__BRICK_IS_MASTER:
				setBrick_isMaster((Boolean)newValue);
				return;
			case LegosarPackage.BRICK__BRICK_BT_ADDR:
				getBrick_bt_addr().clear();
				getBrick_bt_addr().addAll((Collection<? extends Integer>)newValue);
				return;
			case LegosarPackage.BRICK__BRICK_PERIPHERALS:
				getBrick_peripherals().clear();
				getBrick_peripherals().addAll((Collection<? extends Peripheral>)newValue);
				return;
			case LegosarPackage.BRICK__BRICK_OSEK:
				setBrick_osek((OSEKSystem)newValue);
				return;
			case LegosarPackage.BRICK__BRICK_SWCS:
				getBrick_swcs().clear();
				getBrick_swcs().addAll((Collection<? extends SWC>)newValue);
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
			case LegosarPackage.BRICK__BRICK_NAME:
				setBrick_name(BRICK_NAME_EDEFAULT);
				return;
			case LegosarPackage.BRICK__BRICK_IS_MASTER:
				setBrick_isMaster(BRICK_IS_MASTER_EDEFAULT);
				return;
			case LegosarPackage.BRICK__BRICK_BT_ADDR:
				getBrick_bt_addr().clear();
				return;
			case LegosarPackage.BRICK__BRICK_PERIPHERALS:
				getBrick_peripherals().clear();
				return;
			case LegosarPackage.BRICK__BRICK_OSEK:
				setBrick_osek((OSEKSystem)null);
				return;
			case LegosarPackage.BRICK__BRICK_SWCS:
				getBrick_swcs().clear();
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
			case LegosarPackage.BRICK__BRICK_NAME:
				return BRICK_NAME_EDEFAULT == null ? brick_name != null : !BRICK_NAME_EDEFAULT.equals(brick_name);
			case LegosarPackage.BRICK__BRICK_IS_MASTER:
				return brick_isMaster != BRICK_IS_MASTER_EDEFAULT;
			case LegosarPackage.BRICK__BRICK_BT_ADDR:
				return brick_bt_addr != null && !brick_bt_addr.isEmpty();
			case LegosarPackage.BRICK__BRICK_PERIPHERALS:
				return brick_peripherals != null && !brick_peripherals.isEmpty();
			case LegosarPackage.BRICK__BRICK_OSEK:
				return brick_osek != null;
			case LegosarPackage.BRICK__BRICK_SWCS:
				return brick_swcs != null && !brick_swcs.isEmpty();
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
		result.append(" (brick_name: ");
		result.append(brick_name);
		result.append(", brick_isMaster: ");
		result.append(brick_isMaster);
		result.append(", brick_bt_addr: ");
		result.append(brick_bt_addr);
		result.append(')');
		return result.toString();
	}

} //BrickImpl
