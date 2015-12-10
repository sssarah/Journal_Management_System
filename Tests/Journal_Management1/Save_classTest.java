package Journal_Management1;

import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.junit.Assert;
import org.junit.Test;

public class Save_classTest {

	@Test
	public void testSaveAndExit() {
		Save_class test = new Save_class();
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		String documentName= "softwaredocument.ser";
		FileOutputStream fos1 = new FileOutputStream(documentName + ".ser");
		out = new ObjectOutputStream(fos1);
		
		out.writeObject(fos1);
		assertequals(documentName, out.writeObject(fos1));
	}

}
