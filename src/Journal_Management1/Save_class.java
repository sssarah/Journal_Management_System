/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Journal_Management1;


import java.io.*;
import java.util.Scanner;

// This class is to create a file in the journal system, 
//save that file and exit from the system. 
public class Save_class extends Journal_Admin {
	static Scanner in = new Scanner(System.in);
	
	// This method is construct object and locate a memory for 
	//creating the object in the journal system 
	//which is serialised document file
	public void SaveAndExit(String documentName) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(documentName + ".ser");
			out = new ObjectOutputStream(fos);
			out.writeObject(JS);
			fos.close();
			out.close();
			
		}catch (FileNotFoundException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	
}