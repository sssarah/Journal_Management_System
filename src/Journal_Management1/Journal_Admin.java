package Journal_Management1;


import java.util.Scanner;
// this class is to define how the journal Admin
//enter the information of each publication
public class Journal_Admin  {
	// this class is define the operation
	static Scanner in = new Scanner(System.in);
	static Boolean Operating = true;
	static String documentName = null;
	static Journal_System JS = new Journal_System();
	int isbn;
	String heading, writer;
	boolean borrowed;
	double fees;
	
	// this method is to add publications to the journal system 
	//through creating an object (publication) and then using the scanner (in) 
	//to scan the input of heading, writer name, isbn, fees and borrowing status.
	public void addPublication(){
		// TODO Auto-generated method stub
	    
		System.out.println("\nEnter heading: ");
		heading = in.next();
		
		System.out.println("\nEnter writer: ");
		writer = in.next();
		
		System.out.println("\nEnter isbn: ");
		isbn = in.nextInt();
		
		System.out.println("\nEnter fees: ");
		fees = in.nextDouble();
		System.out.println("\n Borrowed (True/False): ");
		borrowed = in.nextBoolean();
		Puplication p = new Puplication(isbn, heading, writer, fees, borrowed);
		JS.Add_Publication(p);
	 
	}
	// this method is to list all the added publications by the Journal Admin with 
	//their attributes (isbn, heading, writer, fees and borrowing status)
	//by calling the "toString" method in the publication class.
	
	public void List_publications()
	{
		
		 System.out.println(JS.toString());
	}
	// this method is to create a new document file and exit from the system. 
	public void Save()
	{
		Save_class SC = new Save_class();
		System.out.println("Enter document name: ");
		documentName = in.next();
        SC.SaveAndExit(documentName);
	}
	
	// this method is to load the document file that has been created 
	//from the save class.
	public void Load()
	{
		LoadScript_class LC = new LoadScript_class();
		System.out.println("Enter document name: ");
		documentName = in.next();
		LC.Load(documentName);
	}
		
}
