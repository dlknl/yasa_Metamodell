/**
 */
package Metamodell.model.metamodell.util;

import Metamodell.model.metamodell.Alarm;
import Metamodell.model.metamodell.Brick;
import Metamodell.model.metamodell.Connection;
import Metamodell.model.metamodell.Event;
import Metamodell.model.metamodell.Hardware;
import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.Motor;
import Metamodell.model.metamodell.OSEKSystem;
import Metamodell.model.metamodell.Peripheral;
import Metamodell.model.metamodell.Port;
import Metamodell.model.metamodell.SWC;
import Metamodell.model.metamodell.SenderReceiverport;
import Metamodell.model.metamodell.Sensor;
import Metamodell.model.metamodell.Software;
import Metamodell.model.metamodell.Task;
import Metamodell.model.metamodell.Triggerport;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Metamodell.model.metamodell.MetamodellPackage
 * @generated
 */
public class MetamodellAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodellPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodellAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetamodellPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodellSwitch modelSwitch =
		new MetamodellSwitch() {
			public Object caseSystem(Metamodell.model.metamodell.System object) {
				return createSystemAdapter();
			}
			public Object caseHardware(Hardware object) {
				return createHardwareAdapter();
			}
			public Object caseSoftware(Software object) {
				return createSoftwareAdapter();
			}
			public Object caseBrick(Brick object) {
				return createBrickAdapter();
			}
			public Object casePeripheral(Peripheral object) {
				return createPeripheralAdapter();
			}
			public Object caseMotor(Motor object) {
				return createMotorAdapter();
			}
			public Object caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			public Object caseOSEKSystem(OSEKSystem object) {
				return createOSEKSystemAdapter();
			}
			public Object caseEvent(Event object) {
				return createEventAdapter();
			}
			public Object caseTask(Task object) {
				return createTaskAdapter();
			}
			public Object caseAlarm(Alarm object) {
				return createAlarmAdapter();
			}
			public Object caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			public Object caseSWC(SWC object) {
				return createSWCAdapter();
			}
			public Object casePort(Port object) {
				return createPortAdapter();
			}
			public Object caseTriggerport(Triggerport object) {
				return createTriggerportAdapter();
			}
			public Object caseSenderReceiverport(SenderReceiverport object) {
				return createSenderReceiverportAdapter();
			}
			public Object caseRunnable(Metamodell.model.metamodell.Runnable object) {
				return createRunnableAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Hardware
	 * @generated
	 */
	public Adapter createHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Software
	 * @generated
	 */
	public Adapter createSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Brick
	 * @generated
	 */
	public Adapter createBrickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Peripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Peripheral
	 * @generated
	 */
	public Adapter createPeripheralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.OSEKSystem <em>OSEK System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.OSEKSystem
	 * @generated
	 */
	public Adapter createOSEKSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Alarm
	 * @generated
	 */
	public Adapter createAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.SWC <em>SWC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.SWC
	 * @generated
	 */
	public Adapter createSWCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Triggerport <em>Triggerport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Triggerport
	 * @generated
	 */
	public Adapter createTriggerportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.SenderReceiverport <em>Sender Receiverport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.SenderReceiverport
	 * @generated
	 */
	public Adapter createSenderReceiverportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.model.metamodell.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.model.metamodell.Runnable
	 * @generated
	 */
	public Adapter createRunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetamodellAdapterFactory
