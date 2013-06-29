/**
 */
package LEGOSAR.model.legosar.impl;

import LEGOSAR.model.legosar.Alarm;
import LEGOSAR.model.legosar.Brick;
import LEGOSAR.model.legosar.Connection;
import LEGOSAR.model.legosar.Event;
import LEGOSAR.model.legosar.Hardware;
import LEGOSAR.model.legosar.LEGOSARSystem;
import LEGOSAR.model.legosar.LegosarFactory;
import LEGOSAR.model.legosar.LegosarPackage;
import LEGOSAR.model.legosar.Motor;
import LEGOSAR.model.legosar.OSEKSystem;
import LEGOSAR.model.legosar.SWC;
import LEGOSAR.model.legosar.SenderReceiverPort;
import LEGOSAR.model.legosar.Sensor;
import LEGOSAR.model.legosar.Software;
import LEGOSAR.model.legosar.Task;
import LEGOSAR.model.legosar.TriggerPort;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegosarFactoryImpl extends EFactoryImpl implements LegosarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LegosarFactory init() {
		try {
			LegosarFactory theLegosarFactory = (LegosarFactory)EPackage.Registry.INSTANCE.getEFactory(LegosarPackage.eNS_URI);
			if (theLegosarFactory != null) {
				return theLegosarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LegosarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegosarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LegosarPackage.LEGOSAR_SYSTEM: return createLEGOSARSystem();
			case LegosarPackage.HARDWARE: return createHardware();
			case LegosarPackage.SOFTWARE: return createSoftware();
			case LegosarPackage.BRICK: return createBrick();
			case LegosarPackage.MOTOR: return createMotor();
			case LegosarPackage.SENSOR: return createSensor();
			case LegosarPackage.SWC: return createSWC();
			case LegosarPackage.CONNECTION: return createConnection();
			case LegosarPackage.TRIGGER_PORT: return createTriggerPort();
			case LegosarPackage.SENDER_RECEIVER_PORT: return createSenderReceiverPort();
			case LegosarPackage.OSEK_SYSTEM: return createOSEKSystem();
			case LegosarPackage.TASK: return createTask();
			case LegosarPackage.ALARM: return createAlarm();
			case LegosarPackage.EVENT: return createEvent();
			case LegosarPackage.RUNNABLE: return createRunnable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEGOSARSystem createLEGOSARSystem() {
		LEGOSARSystemImpl legosarSystem = new LEGOSARSystemImpl();
		return legosarSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware createHardware() {
		HardwareImpl hardware = new HardwareImpl();
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software createSoftware() {
		SoftwareImpl software = new SoftwareImpl();
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brick createBrick() {
		BrickImpl brick = new BrickImpl();
		return brick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor createMotor() {
		MotorImpl motor = new MotorImpl();
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWC createSWC() {
		SWCImpl swc = new SWCImpl();
		return swc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerPort createTriggerPort() {
		TriggerPortImpl triggerPort = new TriggerPortImpl();
		return triggerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverPort createSenderReceiverPort() {
		SenderReceiverPortImpl senderReceiverPort = new SenderReceiverPortImpl();
		return senderReceiverPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSEKSystem createOSEKSystem() {
		OSEKSystemImpl osekSystem = new OSEKSystemImpl();
		return osekSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alarm createAlarm() {
		AlarmImpl alarm = new AlarmImpl();
		return alarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEGOSAR.model.legosar.Runnable createRunnable() {
		RunnableImpl runnable = new RunnableImpl();
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegosarPackage getLegosarPackage() {
		return (LegosarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LegosarPackage getPackage() {
		return LegosarPackage.eINSTANCE;
	}

} //LegosarFactoryImpl
