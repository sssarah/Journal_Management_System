package Journal_Management1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Journal_SystemTest {
private Journal_System test = new Journal_System();
private List<Puplication> Catalogue;

	@Test
	public void testAdd_Publication() {
		
		ArrayList<Puplication> Cat = new ArrayList<Puplication>();
		 Puplication p = new Puplication(2344, "advanced", "Jame", 24.4, true);
		 Journal_System JS = new Journal_System();
		 JS.Add_Publication(p);
		
		
		 List <Puplication> expected = new ArrayList<Puplication>();
		  expected.add(2344);
		  expected.add("advanced");
		  expected.add("James");
		  expected.Add_Publication(24.4);
		  expected.Add_Publication(true);
		  Assert.assertArrayEquals(expected.toArray(), new String[]{"1", "2", "3"});
		
		String actual = test.Add_Publication("software");
		
		assertSame(expected,actual,"software");
	}
}


	

