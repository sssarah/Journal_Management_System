package Journal_Management1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

import org.junit.Test;

public class LoadScript_classTest {
private LoadScript_class test = new LoadScript_class();
	@Test
	public void testLoadString() {
	 Scanner in = new Scanner(System.in);
	 Journal_System JS = new Journal_System();
	 File document = new File(documentName + ".ser");
	 FileInputStream fos = softwaredocument;
		ObjectInputStream inf =softwaredocument ;
		String expected= JS.Scanner in.File document()
	    String actual= test.LoadString(softwaredocument);
		assertEquals=(expected,actual,softwredocument);
	}

}
