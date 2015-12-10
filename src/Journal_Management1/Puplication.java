package Journal_Management1;

	import java.io.Serializable;

	public class Puplication implements Serializable {
		
		// this class define and set the attributes of 
		//every publication in the journal system in a serialised way.
		
	private int isbn;
	private String heading;
	private String writer;
	private Double fees;
	private boolean borrowed;
		
	// this method is to give 
	//each attribute of each publication an initial value. 
	public Puplication (){
		isbn= 0;
		heading= null;
		writer= null;
		fees= (double) 0; 
		borrowed= false;
		
	}
	// this is to construct an object to define each attribute 
	//of the publication with attributes' type.
	public Puplication(int isbn,String heading,String writer,Double fees, Boolean borrowed ){
		this.isbn=isbn;
		this.heading= heading;
		this.writer=writer;
		this.fees= fees;
		this.borrowed= borrowed;
		
	}

	@Override
	 // this override method is to enter the isbn, heading , writer , fees and 
	//borrowing status when adding a publication.
	public String toString(){
		return "\n Isbn:  "+ isbn + "\n Heading:  "+ heading + "\n Writer:  "+ writer + "\n Fees: "+fees+ "\n Borrowed:  "+ borrowed + "\n";
	}
	
}
