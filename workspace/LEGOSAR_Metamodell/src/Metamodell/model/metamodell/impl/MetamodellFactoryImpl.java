/**
 */
package Metamodell.model.metamodell.impl;

import Metamodell.model.metamodell.Alarm;
import Metamodell.model.metamodell.Brick;
import Metamodell.model.metamodell.Connection;
import Metamodell.model.metamodell.Event;
import Metamodell.model.metamodell.Hardware;
import Metamodell.model.metamodell.MetamodellFactory;
import Metamodell.model.metamodell.MetamodellPackage;
import Metamodell.model.metamodell.Motor;
import Metamodell.model.metamodell.OSEKSystem;
import Metamodell.model.metamodell.SWC;
import Metamodell.model.metamodell.SenderReceiverport;
import Metamodell.model.metamodell.Sensor;
import Metamodell.model.metamodell.Software;
import Metamodell.model.metamodell.Task;
import Metamodell.model.metamodell.Triggerport;

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
public class MetamodellFactoryImpl extends EFactoryImpl implements MetamodellFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodellFactory init() {
		try {
			MetamodellFactory theMetamodellFactory = (MetamodellFactory)EPackage.Registry.INSTANCE.getEFactory("http://metamodell/1.0"); 
			if (theMetamodellFactory != null) {
				return theMetamodellFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodellFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodellFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetamodellPackage.SYSTEM: return createSystem();
			case MetamodellPackage.HARDWARE: return createHardware();
			case MetamodellPackage.SOFTWARE: return createSoftware();
			case MetamodellPackage.BRICK: return createBrick();
			case MetamodellPackage.MOTOR: return createMotor();
			case MetamodellPackage.SENSOR: return createSensor();
			case MetamodellPackage.OSEK_SYSTEM: return createOSEKSystem();
			case MetamodellPackage.EVENT: return createEvent();
			case MetamodellPackage.TASK: return createTask();
			case MetamodellPackage.ALARM: return createAlarm();
			case MetamodellPackage.CONNECTION: return createConnection();
			case MetamodellPackage.SWC: return createSWC();
			case MetamodellPackage.TRIGGERPORT: return createTriggerport();
			case MetamodellPackage.SENDER_RECEIVERPORT: return createSenderReceiverport();
			case MetamodellPackage.RUNNABLE: return createRunnable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodell.model.metamodell.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
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
	public OSEKSystem createOSEKSystem() {
		OSEKSystemImpl osekSystem = new OSEKSystemImpl();
		return osekSystem;
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
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
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
	public Triggerport createTriggerport() {
		TriggerportImpl triggerport = new TriggerportImpl();
		return triggerport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverport createSenderReceiverport() {
		SenderReceiverportImpl senderReceiverport = new SenderReceiverportImpl();
		return senderReceiverport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodell.model.metamodell.Runnable createRunnable() {
		RunnableImpl runnable = new RunnableImpl();
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodellPackage getMetamodellPackage() {
		return (MetamodellPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static MetamodellPackage getPackage() {
		return MetamodellPackage.eINSTANCE;
	}

} //MetamodellFactoryImpl
