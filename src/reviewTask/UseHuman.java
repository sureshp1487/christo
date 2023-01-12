package reviewTask;

import java.util.ArrayList;
import java.util.Collections;

import javax.naming.ldap.SortControl;

public class UseHuman {
	public static void main(String[] args) {
		Human hm1=new Human("Suresh",23,true);
		Human hm2=new Human("surya",21,true);
		Human hm3=new Human("mani",19,true);
	

	ArrayList<Human> humans= new ArrayList<>();
	humans.add(hm1);
	humans.add(hm2);
	humans.add(hm3);
	
	
	humans.forEach(y->System.out.println(y.getName()));
	
    
   }
	}
