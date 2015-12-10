package Journal_Management1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Journal_SystemTest {
private Journal_System test = new Journal_System();
	

	@Test
	public void testAdd_Publication() {
		String expected = Catalogue.add("articles");
		String actual = test.Add_Publication("software");
		assertSame(expected,actual,"software");
	}
}


	

