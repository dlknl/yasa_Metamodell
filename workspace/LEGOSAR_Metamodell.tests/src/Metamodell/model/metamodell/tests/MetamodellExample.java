/**
 */
package Metamodell.model.metamodell.tests;

import Metamodell.model.metamodell.MetamodellFactory;
import Metamodell.model.metamodell.MetamodellPackage;

import java.io.File;
import java.io.IOException;
// CHANGED SECTION BEGINS
import java.io.*;
// CHANGED SECTION ENDS

import java.util.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A sample utility for the '<em><b>metamodell</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodellExample {
	/**
	 * <!-- begin-user-doc -->
	 * Load all the argument file paths or URIs as instances of the model.
	 * <!-- end-user-doc -->
	 * @param args the file paths or URIs.
	 * @generated
	 */
	public static void main(String[] args) {
		
		// CHANGED SECTION BEGINS
		
		// Create a new file output stream:
		
		FileOutputStream file_stream = null;
		
		// Create a new print stream:
		
		PrintStream print_stream = null;
		
		// CHANGED SECTION ENDS
		
		
		
		
		
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
			(MetamodellPackage.eNS_URI, 
			 MetamodellPackage.eINSTANCE);
        
		// If there are no arguments, emit an appropriate usage message.
		//
		if (args.length == 0) {
			System.out.println("Enter a list of file paths or URIs that have content like this:");
			try {
				Resource resource = resourceSet.createResource(URI.createURI("http:///My.metamodell"));
				Metamodell.model.metamodell.System root = MetamodellFactory.eINSTANCE.createSystem();
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
					for (Iterator j = resource.getContents().iterator(); j.hasNext(); ) {
						EObject eObject = (EObject)j.next();
						Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
						if (diagnostic.getSeverity() != Diagnostic.OK) {
							printDiagnostic(diagnostic, "");
						}
					}
				}
				catch (RuntimeException exception) {
					System.out.println("Problem loading " + uri);
					exception.printStackTrace();
				}
			}
		}
		
		// CHANGED SECTION BEGINS
					
		LEGOSAR_Metamodell.System myLEGOSAR = (LEGOSAR_Metamodell.System)resource.getContents().get(0);
		
		unsigned int brick_counter = 0;
		
		for(LEGOSAR_Metamodell.Brick brick : myLEGOSAR.getSystem_hw.getHw_bricks())
		{
			brick_counter++;
			
			try
			{
				file_stream = new FileOutputStream("Brick" + brick_counter + ".oil"); 
			}
			catch(Exception exception)
			{
				System.out.println("ERROR! Cannot create OIL file for brick " + brick_counter + "\n");
				return;
			}
			
			print_stream = new PrintStream(file_stream);
			
			try
			{
				
					// Add default includes, CPU declaration and appmode to OIL file:
		            
		            print_stream.println("#include \"implementation.oil\"\n");
		            
		            print_stream.println("CPU ATMEL_AT91SAM7S256");
		            print_stream.println("{");
		            print_stream.println("\tOS LEJOS_OSEK");
		            print_stream.println("\t{");
		            print_stream.println("\t\tSTATUS = EXTENDED;");
		            print_stream.println("\t\tSTARTUPHOOK = FALSE;");
		            print_stream.println("\t\tERRORHOOK = FALSE;");
		            print_stream.println("\t\tSHUTDOWNHOOK = FALSE;");
		            print_stream.println("\t\tPRETASKHOOK = FALSE;");
		            print_stream.println("\t\tPOSTTASKHOOK = FALSE;");
		            print_stream.println("\t\tUSEGETSERVICEID = FALSE;");
		            print_stream.println("\t\tUSEPARAMETERACCESS = FALSE;");
		            print_stream.println("\t\tUSERESSCHEDULER = FALSE;");
		            print_stream.println("\t};\n");
		            
		            print_stream.println("\tAPPMODE appmode1{};");
		            
		         // TASKS --------------------------------------------------------------------------------
		            unsigned int task_counter = 0;
		            
		            for(LEGOSAR_Metamodell.Task task : myLEGOSAR.getTasks)
		            {
		            	task_counter++;
		            	
		            	print_stream.println("TASK" + "Task" + task_counter + " {");
		            	print_stream.println("\tPRIORITY=" + getTask_Priority + ";");
		            	print_stream.println("\tSCHEDULE = NON;");
		            	print_stream.println("\tACTIVATION = 1;");
		            	print_stream.println("\tAUTOSTART = TRUE {");
		            	print_stream.println("\t\tAPPMODE = AppMode1;");
		            	print_stream.println("\t};");
		            	print_stream.println("\tEVENT = " + getEvent + ";");
		            	print_stream.println("};");
		            }
		            
		            
		         // ALARMS --------------------------------------------------------------------------------
		            unsigned int alarm_counter = 0;
		            
		            for(LEGOSAR_Metamodell.Alarm alarm : myLEGOSAR.getAlarm)
		            {
		            	alarm_counter++;
		            	
		            	print_stream.println("ALARM" + "Alarm" + AlarmName + " {");
		            	print_stream.println("\tCOUNTER =" + getTask_Priority + ";");
		            	print_stream.println("\tACTION = SETEVENT {");
		            	print_stream.println("\t\tTASK = " + getTask + ";");
		            	print_stream.println("\t\tEVENT = " + getEvent + ";");
		            	print_stream.println("\t};");
		            	print_stream.println("\tAUTOSTART = FALSE;");
		            	print_stream.println("};");
		            }
			}
			catch(Exception exception)
			{
				System.out.println("Error: Cannot write to OIL file!");
			}
			
		}
					
		// CHANGED SECTION ENDS
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
		for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext(); ) {
			printDiagnostic((Diagnostic)i.next(), indent + "  ");
		}
	}

} //MetamodellExample
