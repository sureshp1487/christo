package arrayList;

import java.util.ArrayList;

public class UseProgrammer {
	public static void main(String[] args) {
		Programmer Pr=new  Programmer("suresh","developer","java",true);
		Programmer pr1=new Programmer("ravi","frontEnd developer","react js",true);
		Programmer pr2=new Programmer("priya","developer","javaScript",false);
		Programmer pr3=new Programmer("mani","backend developer","Mysql",true);
		Programmer pr4=new Programmer("banu","website creater","html,css",false);
		
		
		ArrayList <Programmer> programmers=new ArrayList<>();
		programmers.add(Pr);
		programmers.add(pr1);
		programmers.add(pr2);
		programmers.add(pr3);
		programmers.add(pr4);
		
		
		for(Programmer var:programmers) {
			System.out.println(var);
		}
		
		
		
	}

}
