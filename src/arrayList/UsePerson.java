package arrayList;

import java.util.ArrayList;

public class UsePerson {
	public static void main(String[] args) {
	Person ps=new Person();
	ps.setName("suresh");
	ps.setAge(19);
	ps.setInitial('P');
	ps.setLocation("velachery");
	
	Person ps1=new Person();
	ps1.setName("mani");
	ps1.setAge(15);
	ps1.setInitial('P');
	ps1.setLocation("Tharamani");
	
	Person ps2=new Person();
	ps2.setName("senthil");
	ps2.setAge(34);
	ps2.setInitial('A');
	ps2.setLocation("medavakkam");
	
	Person ps3=new Person();
	ps3.setName("ram");;
	ps3.setAge(17);
	ps3.setInitial('R');
	ps3.setLocation("omr");
	
	Person ps4=new Person();
	ps4.setName("Avi");
	ps4.setAge(28);
	ps4.setInitial('V');
	ps4.setLocation("SRB");
	
	ArrayList <Person> persons=new ArrayList<>();
	persons.add(ps);
	persons.add(ps1);
	persons.add(ps2);
	persons.add(ps3);
	persons.add(ps4);
	
	
//	persons.forEach(y->{
//		if(y.getAge()>=18) {
//			System.out.println(y.getName()+"elegible");
//		}
//	});
	//String name="";
	for(Person var:persons) {
		if(null!=var.getName()) {
//			name=var.getName();
			System.out.println(var.getName());
		
	}

	}
	//System.out.println(name);
	}
}
