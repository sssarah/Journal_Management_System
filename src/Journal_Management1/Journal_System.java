package Journal_Management1;

import java.io.*;
import java.util.*;


// this class is to create a serialised object that 
//can be converted  in  to bytes or recall an object by 
//reading the byte stream when save, load and list
//the object in to file 
public class Journal_System implements Serializable  {
private List<Puplication> Catalogue;

// what is the benefits of this method?
// how can make junit test for arraylist?
public Journal_System(){
	Catalogue= new ArrayList<Puplication>();	
}
// this method is to add publication to the catalogue 
//,but where we use it?

public void Add_Publication(Puplication articles){
	Catalogue.add(articles);
	
}
@Override
// this method is to ensure that the number of publications do not 
//exceed the overall size of the journal's catalogue.
public String toString(){
	String overall = "\n";
	for (int x=0; x < Catalogue.size(); x++){
	Puplication p=	Catalogue.get(x);
	overall = overall + p.toString();
	}
return overall; 
}
}