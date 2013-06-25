/**
 */
package LEGOSAR.model.legosar.util;

import LEGOSAR.model.legosar.Alarm;
import LEGOSAR.model.legosar.Brick;
import LEGOSAR.model.legosar.Connection;
import LEGOSAR.model.legosar.Event;
import LEGOSAR.model.legosar.Hardware;
import LEGOSAR.model.legosar.LEGOSARSystem;
import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.Motor;
import LEGOSAR.model.legosar.OSEKSystem;
import LEGOSAR.model.legosar.Peripheral;
import LEGOSAR.model.legosar.Port;
import LEGOSAR.model.legosar.SWC;
import LEGOSAR.model.legosar.SenderReceiverPort;
import LEGOSAR.model.legosar.Sensor;
import LEGOSAR.model.legosar.Software;
import LEGOSAR.model.legosar.Task;
import LEGOSAR.model.legosar.TriggerPort;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LEGOSAR.model.legosar.LegosarPackage
 * @generated
 */
public class LegosarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LegosarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegosarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LegosarPackage.eINSTANCE;
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
	@Override
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
	protected LegosarSwitch<Adapter> modelSwitch =
		new LegosarSwitch<Adapter>() {
			@Override
			public Adapter caseLEGOSARSystem(LEGOSARSystem object) {
				return createLEGOSARSystemAdapter();
			}
			@Override
			public Adapter caseHardware(Hardware object) {
				return createHardwareAdapter();
			}
			@Override
			public Adapter caseSoftware(Software object) {
				return createSoftwareAdapter();
			}
			@Override
			public Adapter caseBrick(Brick object) {
				return createBrickAdapter();
			}
			@Override
			public Adapter casePeripheral(Peripheral object) {
				return createPeripheralAdapter();
			}
			@Override
			public Adapter caseMotor(Motor object) {
				return createMotorAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseSWC(SWC object) {
				return createSWCAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseTriggerPort(TriggerPort object) {
				return createTriggerPortAdapter();
			}
			@Override
			public Adapter caseSenderReceiverPort(SenderReceiverPort object) {
				return createSenderReceiverPortAdapter();
			}
			@Override
			public Adapter caseOSEKSystem(OSEKSystem object) {
				return createOSEKSystemAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseAlarm(Alarm object) {
				return createAlarmAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseRunnable(LEGOSAR.model.legosar.Runnable object) {
				return createRunnableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.LEGOSARSystem <em>LEGOSAR System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.LEGOSARSystem
	 * @generated
	 */
	public Adapter createLEGOSARSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Hardware
	 * @generated
	 */
	public Adapter createHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Software
	 * @generated
	 */
	public Adapter createSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Brick
	 * @generated
	 */
	public Adapter createBrickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Peripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Peripheral
	 * @generated
	 */
	public Adapter createPeripheralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.SWC <em>SWC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.SWC
	 * @generated
	 */
	public Adapter createSWCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.TriggerPort <em>Trigger Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.TriggerPort
	 * @generated
	 */
	public Adapter createTriggerPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.SenderReceiverPort <em>Sender Receiver Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.SenderReceiverPort
	 * @generated
	 */
	public Adapter createSenderReceiverPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.OSEKSystem <em>OSEK System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.OSEKSystem
	 * @generated
	 */
	public Adapter createOSEKSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Alarm
	 * @generated
	 */
	public Adapter createAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LEGOSAR.model.legosar.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LEGOSAR.model.legosar.Runnable
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

} //LegosarAdapterFactory
