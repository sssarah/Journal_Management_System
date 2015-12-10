package Journal_Management1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Journal_AdminTest {
private Journal_Admin test = new Journal_Admin();
	@Test
	public void testAddPublication() {
		 Scanner in = new Scanner(System.in);
		Boolean Operating = true;
	    Journal_System JS = new Journal_System();
	    String heading = in.next("advancedsofware");
	    String expected = 
		toString() actual= test.AddPublication();
		assertEquals(expected,actual,"advancedsoftware");
	}
	

	@Test
	public void testList_publications() {
		Boolean Operating = true;
	    Journal_System JS = new Journal_System();
		String expected = JS.toString(\n Isbn:  "645362 "\n Heading:  "advancedsoftware "\n Writer:  "Jame "\n Fees: "345.54 "\n Borrowed:  "true "\n";));
		asserequals=(expected,)
	}

	@Test
	public void testSave() {
		
	}

	@Test
	public void testLoad() {
		
	}

}
