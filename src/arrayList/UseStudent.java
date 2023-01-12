package arrayList;
import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student st=new Student();
		st.id=100;
		st.name="suresh";
		st.age=20;
		st.fees=20000;
		st.isMale=true;
		
		
		
		Student st1=new Student();
		st1.id=101;
		st1.name="mani";
		st1.age=21;
		st1.fees=21000;
		st1.isMale=true;
		
		Student st2=new Student();
		st2.id=103;
		st2.name="sangeetha";
		st2.age=23;
		st2.fees=25000;
		st2.isMale=false;
		

		Student st3=new Student();
		st3.id=104;
		st3.name="ravi";
		st3.age=19;
		st3.fees=60000;
		st3.isMale=true;
		

		Student st4=new Student();
		st4.id=105;
		st4.name="prabha";
		st4.age=25;
		st4.fees=50000;
		st4.isMale=true;
		
		
		ArrayList <Student> students=new ArrayList<>();
		students.add(st);
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		
		
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i).name);
		}
		
		int maxFees=0;
		for(Student var:students) {
			if(var.fees>maxFees) {
				maxFees=var.fees;
			}
		}
		System.out.println("\nMaxFees :"+maxFees);
		
		
		students.forEach(y->{
			if(y.name.startsWith("s")){
				System.out.println(y.name);
			}
		});
				
		
	}

}
