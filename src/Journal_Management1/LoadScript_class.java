/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Journal_Management1;

import java.io.*;
import java.util.Scanner;

public class LoadScript_class extends Journal_Admin {
	static Scanner in = new Scanner(System.in);
	// this method is to load the created file from the save_class.
	public void Load(String documentName) {
		// TODO Auto-generated method stub
		
		FileInputStream fos = null;
		ObjectInputStream inf = null;
		File document = new File(documentName + ".ser");
		 if (document.exists()) {
		try {
			fos = new FileInputStream(document);
			inf = new ObjectInputStream(fos);
			JS = (Journal_System) inf.readObject();			 
			
			inf.close();
			
		}catch (ClassNotFoundException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
			}
		 } else {
	            System.out.println("/n this document does not exisit! ");

	        }
		}
	
}