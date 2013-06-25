/**
 */
package LEGOSAR.model.legosar;

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
 * @see LEGOSAR.model.legosar.LegosarFactory
 * @model kind="package"
 * @generated
 */
public interface LegosarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "legosar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://legosar/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "legosar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LegosarPackage eINSTANCE = LEGOSAR.model.legosar.impl.LegosarPackageImpl.init();

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.LEGOSARSystemImpl <em>LEGOSAR System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.LEGOSARSystemImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getLEGOSARSystem()
	 * @generated
	 */
	int LEGOSAR_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>System hw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOSAR_SYSTEM__SYSTEM_HW = 0;

	/**
	 * The feature id for the '<em><b>System sw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOSAR_SYSTEM__SYSTEM_SW = 1;

	/**
	 * The number of structural features of the '<em>LEGOSAR System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGOSAR_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.HardwareImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getHardware()
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
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.SoftwareImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 2;

	/**
	 * The feature id for the '<em><b>Sw swcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SW_SWCS = 0;

	/**
	 * The feature id for the '<em><b>Sw connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SW_CONNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.BrickImpl <em>Brick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.BrickImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getBrick()
	 * @generated
	 */
	int BRICK = 3;

	/**
	 * The feature id for the '<em><b>Brick name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_NAME = 0;

	/**
	 * The feature id for the '<em><b>Brick is Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_IS_MASTER = 1;

	/**
	 * The feature id for the '<em><b>Brick bt addr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_BT_ADDR = 2;

	/**
	 * The feature id for the '<em><b>Brick peripherals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_PERIPHERALS = 3;

	/**
	 * The feature id for the '<em><b>Brick osek</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_OSEK = 4;

	/**
	 * The feature id for the '<em><b>Brick swcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__BRICK_SWCS = 5;

	/**
	 * The number of structural features of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.PeripheralImpl <em>Peripheral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.PeripheralImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getPeripheral()
	 * @generated
	 */
	int PERIPHERAL = 4;

	/**
	 * The number of structural features of the '<em>Peripheral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.MotorImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 5;

	/**
	 * The feature id for the '<em><b>Motor port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__MOTOR_PORT = PERIPHERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = PERIPHERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.SensorImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Sensor port</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_PORT = PERIPHERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = PERIPHERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.SWCImpl <em>SWC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.SWCImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getSWC()
	 * @generated
	 */
	int SWC = 7;

	/**
	 * The feature id for the '<em><b>Swc name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__SWC_NAME = 0;

	/**
	 * The feature id for the '<em><b>Swc ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__SWC_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Swc runnables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC__SWC_RUNNABLES = 2;

	/**
	 * The number of structural features of the '<em>SWC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.ConnectionImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Conn name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Conn source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONN_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Conn destinations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONN_DESTINATIONS = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.PortImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 9;

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
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.TriggerPortImpl <em>Trigger Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.TriggerPortImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getTriggerPort()
	 * @generated
	 */
	int TRIGGER_PORT = 10;

	/**
	 * The feature id for the '<em><b>Port name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT__PORT_NAME = PORT__PORT_NAME;

	/**
	 * The number of structural features of the '<em>Trigger Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.SenderReceiverPortImpl <em>Sender Receiver Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.SenderReceiverPortImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getSenderReceiverPort()
	 * @generated
	 */
	int SENDER_RECEIVER_PORT = 11;

	/**
	 * The feature id for the '<em><b>Port name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_PORT__PORT_NAME = PORT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Port datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_PORT__PORT_DATATYPE = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sender Receiver Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.OSEKSystemImpl <em>OSEK System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.OSEKSystemImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getOSEKSystem()
	 * @generated
	 */
	int OSEK_SYSTEM = 12;

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
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.TaskImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 13;

	/**
	 * The feature id for the '<em><b>Task name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_NAME = 0;

	/**
	 * The feature id for the '<em><b>Task priority</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Task alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_ALARM = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.AlarmImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 14;

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
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.EventImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 15;

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
	 * The meta object id for the '{@link LEGOSAR.model.legosar.impl.RunnableImpl <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LEGOSAR.model.legosar.impl.RunnableImpl
	 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getRunnable()
	 * @generated
	 */
	int RUNNABLE = 16;

	/**
	 * The feature id for the '<em><b>Runnable name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__RUNNABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Runnable events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__RUNNABLE_EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Runnable task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__RUNNABLE_TASK = 2;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.LEGOSARSystem <em>LEGOSAR System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LEGOSAR System</em>'.
	 * @see LEGOSAR.model.legosar.LEGOSARSystem
	 * @generated
	 */
	EClass getLEGOSARSystem();

	/**
	 * Returns the meta object for the containment reference '{@link LEGOSAR.model.legosar.LEGOSARSystem#getSystem_hw <em>System hw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System hw</em>'.
	 * @see LEGOSAR.model.legosar.LEGOSARSystem#getSystem_hw()
	 * @see #getLEGOSARSystem()
	 * @generated
	 */
	EReference getLEGOSARSystem_System_hw();

	/**
	 * Returns the meta object for the containment reference '{@link LEGOSAR.model.legosar.LEGOSARSystem#getSystem_sw <em>System sw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System sw</em>'.
	 * @see LEGOSAR.model.legosar.LEGOSARSystem#getSystem_sw()
	 * @see #getLEGOSARSystem()
	 * @generated
	 */
	EReference getLEGOSARSystem_System_sw();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see LEGOSAR.model.legosar.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the containment reference list '{@link LEGOSAR.model.legosar.Hardware#getHw_bricks <em>Hw bricks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hw bricks</em>'.
	 * @see LEGOSAR.model.legosar.Hardware#getHw_bricks()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Hw_bricks();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see LEGOSAR.model.legosar.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the containment reference list '{@link LEGOSAR.model.legosar.Software#getSw_swcs <em>Sw swcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sw swcs</em>'.
	 * @see LEGOSAR.model.legosar.Software#getSw_swcs()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Sw_swcs();

	/**
	 * Returns the meta object for the containment reference list '{@link LEGOSAR.model.legosar.Software#getSw_connections <em>Sw connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sw connections</em>'.
	 * @see LEGOSAR.model.legosar.Software#getSw_connections()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Sw_connections();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick</em>'.
	 * @see LEGOSAR.model.legosar.Brick
	 * @generated
	 */
	EClass getBrick();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.Brick#getBrick_name <em>Brick name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brick name</em>'.
	 * @see LEGOSAR.model.legosar.Brick#getBrick_name()
	 * @see #getBrick()
	 * @generated
	 */
	EAttribute getBrick_Brick_name();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.Brick#isBrick_isMaster <em>Brick is Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brick is Master</em>'.
	 * @see LEGOSAR.model.legosar.Brick#isBrick_isMaster()
	 * @see #getBrick()
	 * @generated
	 */
	EAttribute getBrick_Brick_isMaster();

	/**
	 * Returns the meta object for the attribute list '{@link LEGOSAR.model.legosar.Brick#getBrick_bt_addr <em>Brick bt addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Brick bt addr</em>'.
	 * @see LEGOSAR.model.legosar.Brick#getBrick_bt_addr()
	 * @see #getBrick()
	 * @generated
	 */
	EAttribute getBrick_Brick_bt_addr();

	/**
	 * Returns the meta object for the containment reference list '{@link LEGOSAR.model.legosar.Brick#getBrick_peripherals <em>Brick peripherals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Brick peripherals</em>'.
	 * @see LEGOSAR.model.legosar.Brick#getBrick_peripherals()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_Brick_peripherals();

	/**
	 * Returns the meta object for the containment reference '{@link LEGOSAR.model.legosar.Brick#getBrick_osek <em>Brick osek</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Brick osek</em>'.
	 * @see LEGOSAR.model.legosar.Brick#getBrick_osek()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_Brick_osek();

	/**
	 * Returns the meta object for the reference list '{@link LEGOSAR.model.legosar.Brick#getBrick_swcs <em>Brick swcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Brick swcs</em>'.
	 * @see LEGOSAR.model.legosar.Brick#getBrick_swcs()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_Brick_swcs();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Peripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peripheral</em>'.
	 * @see LEGOSAR.model.legosar.Peripheral
	 * @generated
	 */
	EClass getPeripheral();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see LEGOSAR.model.legosar.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.Motor#getMotor_port <em>Motor port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motor port</em>'.
	 * @see LEGOSAR.model.legosar.Motor#getMotor_port()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Motor_port();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see LEGOSAR.model.legosar.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute list '{@link LEGOSAR.model.legosar.Sensor#getSensor_port <em>Sensor port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sensor port</em>'.
	 * @see LEGOSAR.model.legosar.Sensor#getSensor_port()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Sensor_port();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.SWC <em>SWC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SWC</em>'.
	 * @see LEGOSAR.model.legosar.SWC
	 * @generated
	 */
	EClass getSWC();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.SWC#getSwc_name <em>Swc name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swc name</em>'.
	 * @see LEGOSAR.model.legosar.SWC#getSwc_name()
	 * @see #getSWC()
	 * @generated
	 */
	EAttribute getSWC_Swc_name();

	/**
	 * Returns the meta object for the containment reference list '{@link LEGOSAR.model.legosar.SWC#getSwc_ports <em>Swc ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swc ports</em>'.
	 * @see LEGOSAR.model.legosar.SWC#getSwc_ports()
	 * @see #getSWC()
	 * @generated
	 */
	EReference getSWC_Swc_ports();

	/**
	 * Returns the meta object for the containment reference list '{@link LEGOSAR.model.legosar.SWC#getSwc_runnables <em>Swc runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Swc runnables</em>'.
	 * @see LEGOSAR.model.legosar.SWC#getSwc_runnables()
	 * @see #getSWC()
	 * @generated
	 */
	EReference getSWC_Swc_runnables();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see LEGOSAR.model.legosar.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.Connection#getConn_name <em>Conn name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conn name</em>'.
	 * @see LEGOSAR.model.legosar.Connection#getConn_name()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Conn_name();

	/**
	 * Returns the meta object for the reference '{@link LEGOSAR.model.legosar.Connection#getConn_source <em>Conn source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conn source</em>'.
	 * @see LEGOSAR.model.legosar.Connection#getConn_source()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Conn_source();

	/**
	 * Returns the meta object for the reference list '{@link LEGOSAR.model.legosar.Connection#getConn_destinations <em>Conn destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conn destinations</em>'.
	 * @see LEGOSAR.model.legosar.Connection#getConn_destinations()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Conn_destinations();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see LEGOSAR.model.legosar.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.Port#getPort_name <em>Port name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port name</em>'.
	 * @see LEGOSAR.model.legosar.Port#getPort_name()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Port_name();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.TriggerPort <em>Trigger Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Port</em>'.
	 * @see LEGOSAR.model.legosar.TriggerPort
	 * @generated
	 */
	EClass getTriggerPort();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.SenderReceiverPort <em>Sender Receiver Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiver Port</em>'.
	 * @see LEGOSAR.model.legosar.SenderReceiverPort
	 * @generated
	 */
	EClass getSenderReceiverPort();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.SenderReceiverPort#getPort_datatype <em>Port datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port datatype</em>'.
	 * @see LEGOSAR.model.legosar.SenderReceiverPort#getPort_datatype()
	 * @see #getSenderReceiverPort()
	 * @generated
	 */
	EAttribute getSenderReceiverPort_Port_datatype();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.OSEKSystem <em>OSEK System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSEK System</em>'.
	 * @see LEGOSAR.model.legosar.OSEKSystem
	 * @generated
	 */
	EClass getOSEKSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link LEGOSAR.model.legosar.OSEKSystem#getOsek_tasks <em>Osek tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osek tasks</em>'.
	 * @see LEGOSAR.model.legosar.OSEKSystem#getOsek_tasks()
	 * @see #getOSEKSystem()
	 * @generated
	 */
	EReference getOSEKSystem_Osek_tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link LEGOSAR.model.legosar.OSEKSystem#getOsek_events <em>Osek events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osek events</em>'.
	 * @see LEGOSAR.model.legosar.OSEKSystem#getOsek_events()
	 * @see #getOSEKSystem()
	 * @generated
	 */
	EReference getOSEKSystem_Osek_events();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see LEGOSAR.model.legosar.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.Task#getTask_name <em>Task name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task name</em>'.
	 * @see LEGOSAR.model.legosar.Task#getTask_name()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Task_name();

	/**
	 * Returns the meta object for the attribute list '{@link LEGOSAR.model.legosar.Task#getTask_priority <em>Task priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Task priority</em>'.
	 * @see LEGOSAR.model.legosar.Task#getTask_priority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Task_priority();

	/**
	 * Returns the meta object for the containment reference '{@link LEGOSAR.model.legosar.Task#getTask_alarm <em>Task alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task alarm</em>'.
	 * @see LEGOSAR.model.legosar.Task#getTask_alarm()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Task_alarm();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see LEGOSAR.model.legosar.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for the attribute list '{@link LEGOSAR.model.legosar.Alarm#getAlarm_cycletime <em>Alarm cycletime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alarm cycletime</em>'.
	 * @see LEGOSAR.model.legosar.Alarm#getAlarm_cycletime()
	 * @see #getAlarm()
	 * @generated
	 */
	EAttribute getAlarm_Alarm_cycletime();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see LEGOSAR.model.legosar.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.Event#getEvent_name <em>Event name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event name</em>'.
	 * @see LEGOSAR.model.legosar.Event#getEvent_name()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Event_name();

	/**
	 * Returns the meta object for class '{@link LEGOSAR.model.legosar.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see LEGOSAR.model.legosar.Runnable
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for the attribute '{@link LEGOSAR.model.legosar.Runnable#getRunnable_name <em>Runnable name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runnable name</em>'.
	 * @see LEGOSAR.model.legosar.Runnable#getRunnable_name()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Runnable_name();

	/**
	 * Returns the meta object for the reference list '{@link LEGOSAR.model.legosar.Runnable#getRunnable_events <em>Runnable events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runnable events</em>'.
	 * @see LEGOSAR.model.legosar.Runnable#getRunnable_events()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_Runnable_events();

	/**
	 * Returns the meta object for the reference '{@link LEGOSAR.model.legosar.Runnable#getRunnable_task <em>Runnable task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable task</em>'.
	 * @see LEGOSAR.model.legosar.Runnable#getRunnable_task()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_Runnable_task();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LegosarFactory getLegosarFactory();

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
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.LEGOSARSystemImpl <em>LEGOSAR System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.LEGOSARSystemImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getLEGOSARSystem()
		 * @generated
		 */
		EClass LEGOSAR_SYSTEM = eINSTANCE.getLEGOSARSystem();

		/**
		 * The meta object literal for the '<em><b>System hw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGOSAR_SYSTEM__SYSTEM_HW = eINSTANCE.getLEGOSARSystem_System_hw();

		/**
		 * The meta object literal for the '<em><b>System sw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGOSAR_SYSTEM__SYSTEM_SW = eINSTANCE.getLEGOSARSystem_System_sw();

		/**
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.HardwareImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getHardware()
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
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.SoftwareImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Sw swcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__SW_SWCS = eINSTANCE.getSoftware_Sw_swcs();

		/**
		 * The meta object literal for the '<em><b>Sw connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__SW_CONNECTIONS = eINSTANCE.getSoftware_Sw_connections();

		/**
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.BrickImpl <em>Brick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.BrickImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getBrick()
		 * @generated
		 */
		EClass BRICK = eINSTANCE.getBrick();

		/**
		 * The meta object literal for the '<em><b>Brick name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK__BRICK_NAME = eINSTANCE.getBrick_Brick_name();

		/**
		 * The meta object literal for the '<em><b>Brick is Master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK__BRICK_IS_MASTER = eINSTANCE.getBrick_Brick_isMaster();

		/**
		 * The meta object literal for the '<em><b>Brick bt addr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK__BRICK_BT_ADDR = eINSTANCE.getBrick_Brick_bt_addr();

		/**
		 * The meta object literal for the '<em><b>Brick peripherals</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.PeripheralImpl <em>Peripheral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.PeripheralImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getPeripheral()
		 * @generated
		 */
		EClass PERIPHERAL = eINSTANCE.getPeripheral();

		/**
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.MotorImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '<em><b>Motor port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__MOTOR_PORT = eINSTANCE.getMotor_Motor_port();

		/**
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.SensorImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor port</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SENSOR_PORT = eINSTANCE.getSensor_Sensor_port();

		/**
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.SWCImpl <em>SWC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.SWCImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getSWC()
		 * @generated
		 */
		EClass SWC = eINSTANCE.getSWC();

		/**
		 * The meta object literal for the '<em><b>Swc name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWC__SWC_NAME = eINSTANCE.getSWC_Swc_name();

		/**
		 * The meta object literal for the '<em><b>Swc ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__SWC_PORTS = eINSTANCE.getSWC_Swc_ports();

		/**
		 * The meta object literal for the '<em><b>Swc runnables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWC__SWC_RUNNABLES = eINSTANCE.getSWC_Swc_runnables();

		/**
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.ConnectionImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Conn name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONN_NAME = eINSTANCE.getConnection_Conn_name();

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
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.PortImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getPort()
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
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.TriggerPortImpl <em>Trigger Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.TriggerPortImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getTriggerPort()
		 * @generated
		 */
		EClass TRIGGER_PORT = eINSTANCE.getTriggerPort();

		/**
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.SenderReceiverPortImpl <em>Sender Receiver Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.SenderReceiverPortImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getSenderReceiverPort()
		 * @generated
		 */
		EClass SENDER_RECEIVER_PORT = eINSTANCE.getSenderReceiverPort();

		/**
		 * The meta object literal for the '<em><b>Port datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER_RECEIVER_PORT__PORT_DATATYPE = eINSTANCE.getSenderReceiverPort_Port_datatype();

		/**
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.OSEKSystemImpl <em>OSEK System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.OSEKSystemImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getOSEKSystem()
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
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.TaskImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Task name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_NAME = eINSTANCE.getTask_Task_name();

		/**
		 * The meta object literal for the '<em><b>Task priority</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TASK_PRIORITY = eINSTANCE.getTask_Task_priority();

		/**
		 * The meta object literal for the '<em><b>Task alarm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TASK_ALARM = eINSTANCE.getTask_Task_alarm();

		/**
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.AlarmImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getAlarm()
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
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.EventImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getEvent()
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
		 * The meta object literal for the '{@link LEGOSAR.model.legosar.impl.RunnableImpl <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LEGOSAR.model.legosar.impl.RunnableImpl
		 * @see LEGOSAR.model.legosar.impl.LegosarPackageImpl#getRunnable()
		 * @generated
		 */
		EClass RUNNABLE = eINSTANCE.getRunnable();

		/**
		 * The meta object literal for the '<em><b>Runnable name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__RUNNABLE_NAME = eINSTANCE.getRunnable_Runnable_name();

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

	}

} //LegosarPackage
