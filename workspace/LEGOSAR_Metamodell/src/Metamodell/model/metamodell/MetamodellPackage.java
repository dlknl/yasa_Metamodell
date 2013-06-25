/**
 */
package Metamodell.model.metamodell;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Metamodell.model.metamodell.MetamodellFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodellPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodell";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metamodell/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodell";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodellPackage eINSTANCE = Metamodell.model.metamodell.impl.MetamodellPackageImpl.init();

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.SystemImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>System hw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_HW = 0;

	/**
	 * The feature id for the '<em><b>System sw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_SW = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.HardwareImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 1;

	/**
	 * The feature id for the '<em><b>Hw bricks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__HW_BRICKS = 0;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.SoftwareImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 2;

	/**
	 * The feature id for the '<em><b>Sw connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SW_CONNECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Sw swcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SW_SWCS = 1;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.BrickImpl <em>Brick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.BrickImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getBrick()
	 * @generated
	 */
	int BRICK = 3;

	/**
	 * The feature id for the '<em><b>Brick peripherals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_PERIPHERALS = 0;

	/**
	 * The feature id for the '<em><b>Brick osek</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_OSEK = 1;

	/**
	 * The feature id for the '<em><b>Brick swcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_SWCS = 2;

	/**
	 * The feature id for the '<em><b>Brick is Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_IS_MASTER = 3;

	/**
	 * The feature id for the '<em><b>Brick bluetooth Address</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_BLUETOOTH_ADDRESS = 4;

	/**
	 * The number of structural features of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.PeripheralImpl <em>Peripheral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.PeripheralImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getPeripheral()
	 * @generated
	 */
	int PERIPHERAL = 4;

	/**
	 * The feature id for the '<em><b>Peripheral port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__PERIPHERAL_PORT = 0;

	/**
	 * The number of structural features of the '<em>Peripheral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.MotorImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 5;

	/**
	 * The feature id for the '<em><b>Peripheral port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__PERIPHERAL_PORT = PERIPHERAL__PERIPHERAL_PORT;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = PERIPHERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.SensorImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Peripheral port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PERIPHERAL_PORT = PERIPHERAL__PERIPHERAL_PORT;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = PERIPHERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.OSEKSystemImpl <em>OSEK System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.OSEKSystemImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getOSEKSystem()
	 * @generated
	 */
	int OSEK_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Osek tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_SYSTEM__OSEK_TASKS = 0;

	/**
	 * The feature id for the '<em><b>Osek events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_SYSTEM__OSEK_EVENTS = 1;

	/**
	 * The number of structural features of the '<em>OSEK System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.EventImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 8;

	/**
	 * The feature id for the '<em><b>Event name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.TaskImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 9;

	/**
	 * The feature id for the '<em><b>Task alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_ALARM = 0;

	/**
	 * The feature id for the '<em><b>Task priority</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.AlarmImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 10;

	/**
	 * The feature id for the '<em><b>Alarm cycletime</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__ALARM_CYCLETIME = 0;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.ConnectionImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 11;

	/**
	 * The feature id for the '<em><b>Conn source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONN_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Conn destinations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONN_DESTINATIONS = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.SWCImpl <em>SWC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.SWCImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSWC()
	 * @generated
	 */
	int SWC = 12;

	/**
	 * The feature id for the '<em><b>Swc runnables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__SWC_RUNNABLES = 0;

	/**
	 * The feature id for the '<em><b>Swc ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__SWC_PORTS = 1;

	/**
	 * The number of structural features of the '<em>SWC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.PortImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 13;

	/**
	 * The feature id for the '<em><b>Port name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.TriggerportImpl <em>Triggerport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.TriggerportImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getTriggerport()
	 * @generated
	 */
	int TRIGGERPORT = 14;

	/**
	 * The feature id for the '<em><b>Port name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERPORT__PORT_NAME = PORT__PORT_NAME;

	/**
	 * The number of structural features of the '<em>Triggerport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERPORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.SenderReceiverportImpl <em>Sender Receiverport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.SenderReceiverportImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSenderReceiverport()
	 * @generated
	 */
	int SENDER_RECEIVERPORT = 15;

	/**
	 * The feature id for the '<em><b>Port name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVERPORT__PORT_NAME = PORT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Srport datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVERPORT__SRPORT_DATATYPE = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sender Receiverport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVERPORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Metamodell.model.metamodell.impl.RunnableImpl <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.model.metamodell.impl.RunnableImpl
	 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getRunnable()
	 * @generated
	 */
	int RUNNABLE = 16;

	/**
	 * The feature id for the '<em><b>Runnable events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__RUNNABLE_EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Runnable task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__RUNNABLE_TASK = 1;

	/**
	 * The feature id for the '<em><b>Runnable name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__RUNNABLE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see Metamodell.model.metamodell.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link Metamodell.model.metamodell.System#getSystem_hw <em>System hw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System hw</em>'.
	 * @see Metamodell.model.metamodell.System#getSystem_hw()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_System_hw();

	/**
	 * Returns the meta object for the containment reference '{@link Metamodell.model.metamodell.System#getSystem_sw <em>System sw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System sw</em>'.
	 * @see Metamodell.model.metamodell.System#getSystem_sw()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_System_sw();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see Metamodell.model.metamodell.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodell.model.metamodell.Hardware#getHw_bricks <em>Hw bricks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hw bricks</em>'.
	 * @see Metamodell.model.metamodell.Hardware#getHw_bricks()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Hw_bricks();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see Metamodell.model.metamodell.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodell.model.metamodell.Software#getSw_connections <em>Sw connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sw connections</em>'.
	 * @see Metamodell.model.metamodell.Software#getSw_connections()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Sw_connections();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodell.model.metamodell.Software#getSw_swcs <em>Sw swcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sw swcs</em>'.
	 * @see Metamodell.model.metamodell.Software#getSw_swcs()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Sw_swcs();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick</em>'.
	 * @see Metamodell.model.metamodell.Brick
	 * @generated
	 */
	EClass getBrick();

	/**
	 * Returns the meta object for the reference list '{@link Metamodell.model.metamodell.Brick#getBrick_peripherals <em>Brick peripherals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brick peripherals</em>'.
	 * @see Metamodell.model.metamodell.Brick#getBrick_peripherals()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_Brick_peripherals();

	/**
	 * Returns the meta object for the containment reference '{@link Metamodell.model.metamodell.Brick#getBrick_osek <em>Brick osek</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Brick osek</em>'.
	 * @see Metamodell.model.metamodell.Brick#getBrick_osek()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_Brick_osek();

	/**
	 * Returns the meta object for the reference list '{@link Metamodell.model.metamodell.Brick#getBrick_swcs <em>Brick swcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brick swcs</em>'.
	 * @see Metamodell.model.metamodell.Brick#getBrick_swcs()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_Brick_swcs();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.model.metamodell.Brick#isBrick_isMaster <em>Brick is Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brick is Master</em>'.
	 * @see Metamodell.model.metamodell.Brick#isBrick_isMaster()
	 * @see #getBrick()
	 * @generated
	 */
	EAttribute getBrick_Brick_isMaster();

	/**
	 * Returns the meta object for the attribute list '{@link Metamodell.model.metamodell.Brick#getBrick_bluetoothAddress <em>Brick bluetooth Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Brick bluetooth Address</em>'.
	 * @see Metamodell.model.metamodell.Brick#getBrick_bluetoothAddress()
	 * @see #getBrick()
	 * @generated
	 */
	EAttribute getBrick_Brick_bluetoothAddress();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Peripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peripheral</em>'.
	 * @see Metamodell.model.metamodell.Peripheral
	 * @generated
	 */
	EClass getPeripheral();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.model.metamodell.Peripheral#getPeripheral_port <em>Peripheral port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peripheral port</em>'.
	 * @see Metamodell.model.metamodell.Peripheral#getPeripheral_port()
	 * @see #getPeripheral()
	 * @generated
	 */
	EAttribute getPeripheral_Peripheral_port();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see Metamodell.model.metamodell.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see Metamodell.model.metamodell.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.OSEKSystem <em>OSEK System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSEK System</em>'.
	 * @see Metamodell.model.metamodell.OSEKSystem
	 * @generated
	 */
	EClass getOSEKSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodell.model.metamodell.OSEKSystem#getOsek_tasks <em>Osek tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osek tasks</em>'.
	 * @see Metamodell.model.metamodell.OSEKSystem#getOsek_tasks()
	 * @see #getOSEKSystem()
	 * @generated
	 */
	EReference getOSEKSystem_Osek_tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodell.model.metamodell.OSEKSystem#getOsek_events <em>Osek events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osek events</em>'.
	 * @see Metamodell.model.metamodell.OSEKSystem#getOsek_events()
	 * @see #getOSEKSystem()
	 * @generated
	 */
	EReference getOSEKSystem_Osek_events();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see Metamodell.model.metamodell.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.model.metamodell.Event#getEvent_name <em>Event name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event name</em>'.
	 * @see Metamodell.model.metamodell.Event#getEvent_name()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Event_name();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see Metamodell.model.metamodell.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference '{@link Metamodell.model.metamodell.Task#getTask_alarm <em>Task alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task alarm</em>'.
	 * @see Metamodell.model.metamodell.Task#getTask_alarm()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Task_alarm();

	/**
	 * Returns the meta object for the attribute list '{@link Metamodell.model.metamodell.Task#getTask_priority <em>Task priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Task priority</em>'.
	 * @see Metamodell.model.metamodell.Task#getTask_priority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Task_priority();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see Metamodell.model.metamodell.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for the attribute list '{@link Metamodell.model.metamodell.Alarm#getAlarm_cycletime <em>Alarm cycletime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alarm cycletime</em>'.
	 * @see Metamodell.model.metamodell.Alarm#getAlarm_cycletime()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Alarm_cycletime();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see Metamodell.model.metamodell.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link Metamodell.model.metamodell.Connection#getConn_source <em>Conn source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conn source</em>'.
	 * @see Metamodell.model.metamodell.Connection#getConn_source()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Conn_source();

	/**
	 * Returns the meta object for the reference list '{@link Metamodell.model.metamodell.Connection#getConn_destinations <em>Conn destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conn destinations</em>'.
	 * @see Metamodell.model.metamodell.Connection#getConn_destinations()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Conn_destinations();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.SWC <em>SWC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SWC</em>'.
	 * @see Metamodell.model.metamodell.SWC
	 * @generated
	 */
	EClass getSWC();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodell.model.metamodell.SWC#getSwc_runnables <em>Swc runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swc runnables</em>'.
	 * @see Metamodell.model.metamodell.SWC#getSwc_runnables()
	 * @see #getSWC()
	 * @generated
	 */
	EReference getSWC_Swc_runnables();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodell.model.metamodell.SWC#getSwc_ports <em>Swc ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swc ports</em>'.
	 * @see Metamodell.model.metamodell.SWC#getSwc_ports()
	 * @see #getSWC()
	 * @generated
	 */
	EReference getSWC_Swc_ports();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see Metamodell.model.metamodell.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.model.metamodell.Port#getPort_name <em>Port name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port name</em>'.
	 * @see Metamodell.model.metamodell.Port#getPort_name()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Port_name();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Triggerport <em>Triggerport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggerport</em>'.
	 * @see Metamodell.model.metamodell.Triggerport
	 * @generated
	 */
	EClass getTriggerport();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.SenderReceiverport <em>Sender Receiverport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiverport</em>'.
	 * @see Metamodell.model.metamodell.SenderReceiverport
	 * @generated
	 */
	EClass getSenderReceiverport();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.model.metamodell.SenderReceiverport#getSrport_datatype <em>Srport datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srport datatype</em>'.
	 * @see Metamodell.model.metamodell.SenderReceiverport#getSrport_datatype()
	 * @see #getSenderReceiverport()
	 * @generated
	 */
	EAttribute getSenderReceiverport_Srport_datatype();

	/**
	 * Returns the meta object for class '{@link Metamodell.model.metamodell.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see Metamodell.model.metamodell.Runnable
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for the reference list '{@link Metamodell.model.metamodell.Runnable#getRunnable_events <em>Runnable events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runnable events</em>'.
	 * @see Metamodell.model.metamodell.Runnable#getRunnable_events()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_Runnable_events();

	/**
	 * Returns the meta object for the reference '{@link Metamodell.model.metamodell.Runnable#getRunnable_task <em>Runnable task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable task</em>'.
	 * @see Metamodell.model.metamodell.Runnable#getRunnable_task()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_Runnable_task();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.model.metamodell.Runnable#getRunnable_name <em>Runnable name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runnable name</em>'.
	 * @see Metamodell.model.metamodell.Runnable#getRunnable_name()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Runnable_name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodellFactory getMetamodellFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.SystemImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>System hw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEM_HW = eINSTANCE.getSystem_System_hw();

		/**
		 * The meta object literal for the '<em><b>System sw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEM_SW = eINSTANCE.getSystem_System_sw();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.HardwareImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '<em><b>Hw bricks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__HW_BRICKS = eINSTANCE.getHardware_Hw_bricks();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.SoftwareImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Sw connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__SW_CONNECTIONS = eINSTANCE.getSoftware_Sw_connections();

		/**
		 * The meta object literal for the '<em><b>Sw swcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__SW_SWCS = eINSTANCE.getSoftware_Sw_swcs();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.BrickImpl <em>Brick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.BrickImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getBrick()
		 * @generated
		 */
		EClass BRICK = eINSTANCE.getBrick();

		/**
		 * The meta object literal for the '<em><b>Brick peripherals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__BRICK_PERIPHERALS = eINSTANCE.getBrick_Brick_peripherals();

		/**
		 * The meta object literal for the '<em><b>Brick osek</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__BRICK_OSEK = eINSTANCE.getBrick_Brick_osek();

		/**
		 * The meta object literal for the '<em><b>Brick swcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__BRICK_SWCS = eINSTANCE.getBrick_Brick_swcs();

		/**
		 * The meta object literal for the '<em><b>Brick is Master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK__BRICK_IS_MASTER = eINSTANCE.getBrick_Brick_isMaster();

		/**
		 * The meta object literal for the '<em><b>Brick bluetooth Address</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK__BRICK_BLUETOOTH_ADDRESS = eINSTANCE.getBrick_Brick_bluetoothAddress();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.PeripheralImpl <em>Peripheral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.PeripheralImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getPeripheral()
		 * @generated
		 */
		EClass PERIPHERAL = eINSTANCE.getPeripheral();

		/**
		 * The meta object literal for the '<em><b>Peripheral port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIPHERAL__PERIPHERAL_PORT = eINSTANCE.getPeripheral_Peripheral_port();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.MotorImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.SensorImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.OSEKSystemImpl <em>OSEK System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.OSEKSystemImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getOSEKSystem()
		 * @generated
		 */
		EClass OSEK_SYSTEM = eINSTANCE.getOSEKSystem();

		/**
		 * The meta object literal for the '<em><b>Osek tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSEK_SYSTEM__OSEK_TASKS = eINSTANCE.getOSEKSystem_Osek_tasks();

		/**
		 * The meta object literal for the '<em><b>Osek events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSEK_SYSTEM__OSEK_EVENTS = eINSTANCE.getOSEKSystem_Osek_events();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.EventImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Event name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_NAME = eINSTANCE.getEvent_Event_name();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.TaskImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Task alarm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TASK_ALARM = eINSTANCE.getTask_Task_alarm();

		/**
		 * The meta object literal for the '<em><b>Task priority</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_PRIORITY = eINSTANCE.getTask_Task_priority();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.AlarmImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getAlarm()
		 * @generated
		 */
		EClass ALARM = eINSTANCE.getAlarm();

		/**
		 * The meta object literal for the '<em><b>Alarm cycletime</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALARM__ALARM_CYCLETIME = eINSTANCE.getAlarm_Alarm_cycletime();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.ConnectionImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Conn source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONN_SOURCE = eINSTANCE.getConnection_Conn_source();

		/**
		 * The meta object literal for the '<em><b>Conn destinations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONN_DESTINATIONS = eINSTANCE.getConnection_Conn_destinations();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.SWCImpl <em>SWC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.SWCImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSWC()
		 * @generated
		 */
		EClass SWC = eINSTANCE.getSWC();

		/**
		 * The meta object literal for the '<em><b>Swc runnables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__SWC_RUNNABLES = eINSTANCE.getSWC_Swc_runnables();

		/**
		 * The meta object literal for the '<em><b>Swc ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__SWC_PORTS = eINSTANCE.getSWC_Swc_ports();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.PortImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Port name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PORT_NAME = eINSTANCE.getPort_Port_name();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.TriggerportImpl <em>Triggerport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.TriggerportImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getTriggerport()
		 * @generated
		 */
		EClass TRIGGERPORT = eINSTANCE.getTriggerport();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.SenderReceiverportImpl <em>Sender Receiverport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.SenderReceiverportImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getSenderReceiverport()
		 * @generated
		 */
		EClass SENDER_RECEIVERPORT = eINSTANCE.getSenderReceiverport();

		/**
		 * The meta object literal for the '<em><b>Srport datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER_RECEIVERPORT__SRPORT_DATATYPE = eINSTANCE.getSenderReceiverport_Srport_datatype();

		/**
		 * The meta object literal for the '{@link Metamodell.model.metamodell.impl.RunnableImpl <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.model.metamodell.impl.RunnableImpl
		 * @see Metamodell.model.metamodell.impl.MetamodellPackageImpl#getRunnable()
		 * @generated
		 */
		EClass RUNNABLE = eINSTANCE.getRunnable();

		/**
		 * The meta object literal for the '<em><b>Runnable events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE__RUNNABLE_EVENTS = eINSTANCE.getRunnable_Runnable_events();

		/**
		 * The meta object literal for the '<em><b>Runnable task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE__RUNNABLE_TASK = eINSTANCE.getRunnable_Runnable_task();

		/**
		 * The meta object literal for the '<em><b>Runnable name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__RUNNABLE_NAME = eINSTANCE.getRunnable_Runnable_name();

	}

} //MetamodellPackage
