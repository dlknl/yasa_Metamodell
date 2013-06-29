/**
 */
package LEGOSAR.model.legosar.tests;

import LEGOSAR.model.legosar.LEGOSARSystem;
import LEGOSAR.model.legosar.LegosarFactory;
import LEGOSAR.model.legosar.LegosarPackage;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

//CHANGED SECTION BEGINS

import java.io.FileOutputStream;
import java.io.PrintStream;

//CHANGED SECTION ENDS

//CHANGED SECTION BEGINS

//Note that all '@generated' tags of modified classes and methods have been removed!

//CHANGED SECTION ENDS

/**
 * <!-- begin-user-doc -->
 * A sample utility for the '<em><b>legosar</b></em>' package.
 * <!-- end-user-doc -->
 */
public class LegosarExample {
	
	// CHANGED SECTION BEGINS
	
	private static FileOutputStream file_stream;
	private static PrintStream print_stream;
	
	private static void writeLineToFile(int indent, String line)
	{
		try
		{
			for(int i = 0; i < indent; i++)
			{
				// Note that in this case print() is used instead of println()!
				
				print_stream.print("\t");
			}
		
			if(line == "\n")
				print_stream.print("\n");
			else
				print_stream.println(line);
			
			// Note that a new line character is inserted automatically!
		}
		catch(Exception exception)
		{
			System.out.println("ERROR! Can't write to file!");
			System.out.println("WARNING: Output directory may contain unusable files!");
			System.exit(-1);
		}
		
			return;
	}
		
	// CHANGED SECTION ENDS
	
	/**
	 * <!-- begin-user-doc -->
	 * Load all the argument file paths or URIs as instances of the model.
	 * <!-- end-user-doc -->
	 * @param args the file paths or URIs.
	 */
	public static void main(String[] args) {
		
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(LegosarPackage.eNS_URI, 
			 LegosarPackage.eINSTANCE);
        
		// If there are no arguments, emit an appropriate usage message.
		//
		if (args.length == 0) {
			System.out.println("Enter a list of file paths or URIs that have content like this:");
			try {
				Resource resource = resourceSet.createResource(URI.createURI("http:///My.legosar"));
				LEGOSARSystem root = LegosarFactory.eINSTANCE.createLEGOSARSystem();
				resource.getContents().add(root);
				resource.save(System.out, null);
			}
			catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		else {
			// Iterate over all the arguments.
			//
			for (int i = 0; i < args.length; ++i) {
				// Construct the URI for the instance file.
				// The argument is treated as a file path only if it denotes an existing file.
				// Otherwise, it's directly treated as a URL.
				//
				File file = new File(args[i]);
				URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath()): URI.createURI(args[i]);

				try {
					// Demand load resource for this file.
					//
					Resource resource = resourceSet.getResource(uri, true);
					System.out.println("Loaded " + uri);

					// Validate the contents of the loaded resource.
					//
					for (EObject eObject : resource.getContents()) {
						Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
						if (diagnostic.getSeverity() != Diagnostic.OK) {
							printDiagnostic(diagnostic, "");
						}
					}
					
					// CHANGED SECTION BEGINS
					
					// Get the resources of the loaded model and create the entry point for model iteration.
					//
					LEGOSARSystem myLEGOSAR = (LEGOSARSystem)resource.getContents().get(0);
					
					// OIL FILE GENERATION:
					
					for(LEGOSAR.model.legosar.Brick brick : myLEGOSAR.getSystem_hw().getHw_bricks())
					{
						System.out.println("Beginning Brick '" + brick.getBrick_name() + "'...");
						
						try
						{
							System.out.println("Creating OIL file for Brick '" + brick.getBrick_name() + "'...");
							
							// Create new OIL file.
							//
							file_stream = new FileOutputStream("C:\\LEGOSAR\\" + brick.getBrick_name() + ".oil");
							
							// Create a new print stream connected to the file output stream.
							//
							print_stream = new PrintStream(file_stream);
						}
						catch(Exception exception)
						{
							System.out.println("ERROR! Can't create OIL file for Brick '" + brick.getBrick_name() + "'!");
							System.out.println("WARNING: Output directory may contain unusable files!");
							System.exit(-1);
						}
						
						try
						{
							System.out.println("Generating standard OIL header for Brick '" + brick.getBrick_name() + "'!");
							
							// Write default includes, CPU declaration and appmode to OIL file.
							//
							writeLineToFile(0,"#include \"implementation.oil\"");
							writeLineToFile(0,"\n");
							writeLineToFile(0,"CPU ATMEL_AT91SAM7S256");
							writeLineToFile(0,"{");
							writeLineToFile(1,"OS LEJOS_OSEK");
							writeLineToFile(1,"{");
							writeLineToFile(2,"STATUS = EXTENDED;");
							writeLineToFile(2,"STARTUPHOOK = FALSE;");
							writeLineToFile(2,"ERRORHOOK = FALSE;");
							writeLineToFile(2,"SHUTDOWNHOOK = FALSE;");
							writeLineToFile(2,"PRETASKHOOK = FALSE;");
							writeLineToFile(2,"POSTTASKHOOK = FALSE;");
							writeLineToFile(2,"USEGETSERVICEID = FALSE;");
							writeLineToFile(2,"USEPARAMETERACCESS = FALSE;");
							writeLineToFile(2,"USERESSCHEDULER = FALSE;");
							writeLineToFile(1,"};");
							writeLineToFile(0,"\n");
							writeLineToFile(1,"APPMODE appmode1{};");
						}
						catch(Exception exception)
						{
							System.out.println("ERROR! Can't write standard OIL header to OIL file for Brick '" + brick.getBrick_name() + "'!");
							System.out.println("WARNING: Output directory may contain unusable files!");
							System.exit(-1);
						}
						
						System.out.println("Generating OSEK elements for Brick '" + brick.getBrick_name() + "'...");
						
						for(LEGOSAR.model.legosar.Event event : brick.getBrick_osek().getOsek_events()) 
						{
							try
							{	
								System.out.println("Generating Event '" + event.getEvent_name() + "'...");
								
								// Write event declaration to OIL file.
								//
								writeLineToFile(0, "\n");
								writeLineToFile(1,"EVENT " + event.getEvent_name());
								writeLineToFile(1,"{");
								writeLineToFile(2,"MASK = AUTO;");
								writeLineToFile(1,"};");
							}
							catch(Exception exception)
							{
								System.out.println("ERROR! Can't write event '" + event.getEvent_name() + "' to OIL file for Brick '" + brick.getBrick_name() + "'!");
								System.out.println("WARNING: Output directory may contain unusable files!");
								System.exit(-1);
							}
						}
						
						for(LEGOSAR.model.legosar.Task task : brick.getBrick_osek().getOsek_tasks())
						{
							try
							{
								System.out.println("Generating Task '" + task.getTask_name() + "'...");
								
								//Write task declaration to OIL file.
								//
								writeLineToFile(0, "\n");
								writeLineToFile(1, "TASK " + task.getTask_name());
								writeLineToFile(1, "{");
								writeLineToFile(2, "AUTOSTART = FALSE;");
								writeLineToFile(2, "PRIORITY = " + task.getTask_priority() + ";");
								writeLineToFile(2, "ACTIVATION = 1;");
								writeLineToFile(2, "SCHEDULE = FULL;");
								writeLineToFile(2, "STACKSIZE = 512;");
								
								for(LEGOSAR.model.legosar.SWC swc : brick.getBrick_swcs())
								{
									for(LEGOSAR.model.legosar.Runnable runnable : swc.getSwc_runnables())
									{
										if(runnable.getRunnable_task() == task)
										{
											for(LEGOSAR.model.legosar.Event event : runnable.getRunnable_events())
											{
												System.out.println("Linking Event '" + event.getEvent_name() + "' to Task '" + task.getTask_name() + "'...");
												
												try
												{
													writeLineToFile(2, "EVENT = " + event.getEvent_name() + ";");
												}
												catch(Exception exception)
												{
													System.out.println("ERROR! Can't link event '" + event.getEvent_name() + "to task '" + task.getTask_name() + "'!");
													System.out.println("WARNING: Output directory may contain unusable files!");
													System.exit(-1);
												}
											}
										}
									}
								}							
								writeLineToFile(1, "};");
							}
							catch(Exception exception)
							{
								System.out.println("ERROR! Can't write task '" + task.getTask_name() + "' to OIL file for Brick '" + brick.getBrick_name() + "'!");
								System.out.println("WARNING: Output directory may contain unusable files!");
								System.exit(-1);
							}
							
							System.out.println("Finished Task '" + task.getTask_name() + "'...");
						}
						
						for(LEGOSAR.model.legosar.Task task : brick.getBrick_osek().getOsek_tasks())
						{
							System.out.println("Generating Counter for Task '" + task.getTask_name() + "'...");
							
							try
							{
								LEGOSAR.model.legosar.Alarm alarm = task.getTask_alarm();
								
								//Write counter declaration to OIL file.
								//
								writeLineToFile(0, "\n");
								writeLineToFile(1, "COUNTER " + task.getTask_name() + "_counter");
								writeLineToFile(1, "{");
								writeLineToFile(2, "MINCYCLE = " + alarm.getAlarm_cycletime() + ";");
								writeLineToFile(2, "MAXALLOWEDVALUE = " + alarm.getAlarm_cycletime() + ";");
								writeLineToFile(2, "TICKPERBASE = 1;");
								writeLineToFile(1, "};");
							}
							catch(Exception exception)
							{
								System.out.println("ERROR! Can't write Counter for Task '" + task.getTask_name() + "' to OIL file for Brick '" + brick.getBrick_name() + "'!");
								System.out.println("WARNING: Output directory may contain unusable files!");
								System.exit(-1);
							}
							
							System.out.println("Finished Counter for Task '" + task.getTask_name() + "'...");
						}
						
						for(LEGOSAR.model.legosar.Task task : brick.getBrick_osek().getOsek_tasks())
						{
							System.out.println("Generating Alarm for Task '" + task.getTask_name() + "'...");
							
							try
							{
								LEGOSAR.model.legosar.Alarm alarm = task.getTask_alarm();
								
								//Write alarm declaration to OIL file.
								//
								writeLineToFile(0, "\n");
								writeLineToFile(1, "ALARM " + task.getTask_name() + "_alarm");
								writeLineToFile(1, "{");
								writeLineToFile(2, "COUNTER = " + task.getTask_name() + "_counter;");
								writeLineToFile(2, "ACTION = ACTIVATETASK");
								writeLineToFile(2, "{");
								writeLineToFile(3, "TASK = " + task.getTask_name() + ";");
								writeLineToFile(2, "};");
								writeLineToFile(2, "AUTOSTART = TRUE");
								writeLineToFile(2, "{");
								writeLineToFile(3, "ALARMTIME = " + alarm.getAlarm_cycletime() + ";");
								writeLineToFile(3, "CYCLETIME = " + alarm.getAlarm_cycletime() + ";");
								writeLineToFile(3, "APPMODE = appmode1;");
								writeLineToFile(2, "};");
								writeLineToFile(1, "};");
							}
							catch(Exception exception)
							{
								System.out.println("ERROR! Can't write Alarm for Task '" + task.getTask_name() + "' to OIL file for Brick '" + brick.getBrick_name() + "'!");
								System.out.println("WARNING: Output directory may contain unusable files!");
								System.exit(-1);
							}
							
							System.out.println("Finished Alarm for Task '" + task.getTask_name() + "'...");
						}
						
						try
						{
							writeLineToFile(0, "};");
						}
						catch(Exception exception)
						{
							System.out.println("ERROR! Can't finish OIL file for Brick '" + brick.getBrick_name() + "'!");
							System.out.println("WARNING: Output directory may contain unusable files!");
							System.exit(-1);
						}
						
						System.out.println("Finished Brick '" + brick.getBrick_name() + "'...");
					}
							
					// CHANGED SECTION ENDS	
				}
				catch (RuntimeException exception) {
					System.out.println("Problem loading " + uri);
					exception.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Prints diagnostics with indentation.
	 * <!-- end-user-doc -->
	 * @param diagnostic the diagnostic to print.
	 * @param indent the indentation for printing.
	 * @generated
	 */
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

} //LegosarExample
