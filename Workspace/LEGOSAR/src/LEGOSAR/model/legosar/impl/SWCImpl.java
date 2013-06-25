/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.Port;
import LEGOSAR.model.legosar.SWC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SWC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LEGOSAR.model.legosar.impl.SWCImpl#getSwc_name <em>Swc name</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.SWCImpl#getSwc_ports <em>Swc ports</em>}</li>
 *   <li>{@link LEGOSAR.model.legosar.impl.SWCImpl#getSwc_runnables <em>Swc runnables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SWCImpl extends EObjectImpl implements SWC {
	/**
	 * The default value of the '{@link #getSwc_name() <em>Swc name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwc_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SWC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwc_name() <em>Swc name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwc_name()
	 * @generated
	 * @ordered
	 */
	protected String swc_name = SWC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwc_ports() <em>Swc ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwc_ports()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> swc_ports;

	/**
	 * The cached value of the '{@link #getSwc_runnables() <em>Swc runnables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwc_runnables()
	 * @generated
	 * @ordered
	 */
	protected EList<LEGOSAR.model.legosar.Runnable> swc_runnables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SWCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LegosarPackage.Literals.SWC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwc_name() {
		return swc_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwc_name(String newSwc_name) {
		String oldSwc_name = swc_name;
		swc_name = newSwc_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LegosarPackage.SWC__SWC_NAME, oldSwc_name, swc_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getSwc_ports() {
		if (swc_ports == null) {
			swc_ports = new EObjectContainmentEList<Port>(Port.class, this, LegosarPackage.SWC__SWC_PORTS);
		}
		return swc_ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LEGOSAR.model.legosar.Runnable> getSwc_runnables() {
		if (swc_runnables == null) {
			swc_runnables = new EObjectContainmentEList<LEGOSAR.model.legosar.Runnable>(LEGOSAR.model.legosar.Runnable.class, this, LegosarPackage.SWC__SWC_RUNNABLES);
		}
		return swc_runnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LegosarPackage.SWC__SWC_PORTS:
				return ((InternalEList<?>)getSwc_ports()).basicRemove(otherEnd, msgs);
			case LegosarPackage.SWC__SWC_RUNNABLES:
				return ((InternalEList<?>)getSwc_runnables()).basicRemove(otherEnd, msgs);
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
			case LegosarPackage.SWC__SWC_NAME:
				return getSwc_name();
			case LegosarPackage.SWC__SWC_PORTS:
				return getSwc_ports();
			case LegosarPackage.SWC__SWC_RUNNABLES:
				return getSwc_runnables();
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
			case LegosarPackage.SWC__SWC_NAME:
				setSwc_name((String)newValue);
				return;
			case LegosarPackage.SWC__SWC_PORTS:
				getSwc_ports().clear();
				getSwc_ports().addAll((Collection<? extends Port>)newValue);
				return;
			case LegosarPackage.SWC__SWC_RUNNABLES:
				getSwc_runnables().clear();
				getSwc_runnables().addAll((Collection<? extends LEGOSAR.model.legosar.Runnable>)newValue);
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
			case LegosarPackage.SWC__SWC_NAME:
				setSwc_name(SWC_NAME_EDEFAULT);
				return;
			case LegosarPackage.SWC__SWC_PORTS:
				getSwc_ports().clear();
				return;
			case LegosarPackage.SWC__SWC_RUNNABLES:
				getSwc_runnables().clear();
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
			case LegosarPackage.SWC__SWC_NAME:
				return SWC_NAME_EDEFAULT == null ? swc_name != null : !SWC_NAME_EDEFAULT.equals(swc_name);
			case LegosarPackage.SWC__SWC_PORTS:
				return swc_ports != null && !swc_ports.isEmpty();
			case LegosarPackage.SWC__SWC_RUNNABLES:
				return swc_runnables != null && !swc_runnables.isEmpty();
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
		result.append(" (swc_name: ");
		result.append(swc_name);
		result.append(')');
		return result.toString();
	}

} //SWCImpl
