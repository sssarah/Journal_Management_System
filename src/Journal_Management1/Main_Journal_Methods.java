/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Journal_Management1;

import java.util.Scanner;

public class Main_Journal_Methods {

    //static String documentName = null;
    static Journal_Admin JA = new Journal_Admin();
    static Save_class SC = new Save_class();
    static LoadScript_class LC = new LoadScript_class();
    static Scanner in = new Scanner(System.in);
    static Boolean Operating = true;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        while (Operating) {
            System.out.println("\n Enter 1 for load a Journal_System."
                    + "\n Enter 2 for add_Publication to Journal_System"
                    + "\n Enter 3 for List all Publication in Journal_System"
                    + "\n Enter 4 for save and exit");

            int outcome = in.nextInt();
            switch (outcome) {
            
            	case 1:
            		
            		JA.Load();
            		break;
            	case 2:
            		JA.addPublication();
            		 break;
                case 3:
                    JA.List_publications();
                    break;
                case 4:
                	JA.Save();
                	Operating = false;
                    break;                    
            }

        }
        System.exit(0);

    }

}
