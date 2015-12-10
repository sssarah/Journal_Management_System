package Journal_Management1;

import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.junit.Assert;
import org.junit.Test;

public class Save_classTest {
	private Save_class test = new Save_class();
	@Test
	public void testSaveAndExit() {
		
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		String documentName= "softwaredocument.ser";
		FileOutputStream fos1 = new FileOutputStream(documentName + ".ser");
		out = new ObjectOutputStream(fos1);
		
		out.writeObject(fos1);
		assertEquals(documentName, out.writeObject(fos1));
	}

}
