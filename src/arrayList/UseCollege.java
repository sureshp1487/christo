package arrayList;
import java.util.ArrayList;
public class UseCollege {
	public static void main (String[] args) {
		College cl=new College("suresh",22,15000,"Male","Bsc");
		College cl1=new College("surya",21,17000,"Male","Bsc");
		College cl2=new College("mohan",19,15000,"Male","Bca");
		College cl3=new College("mani",23,12000,"Male","B.com");
		College cl4=new College("vicky",24,34000,"Male","Bsc(Maths)");
		
		College cl5=new College("nisha",21,13000,"Female",null);
		College cl6=new College("banu",21,17000,"Female","B.com(A/F)");
		College cl7=new College("priya",21,17000,"Female","MCA");
		College cl8=new College("kavya",21,22000,"Female","MSC");
		College cl9=new College("kiruthika",21,17000,"Female","Bsc");
		
		
		ArrayList<College> collegeStudents=new ArrayList<>();
		collegeStudents.add(cl);
		collegeStudents.add(cl1);
		collegeStudents.add(cl2);
		collegeStudents.add(cl3);
		collegeStudents.add(cl4);
		collegeStudents.add(cl5);
		collegeStudents.add(cl6);
		collegeStudents.add(cl7);
		collegeStudents.add(cl8);
		collegeStudents.add(cl9);
		collegeStudents.remove(5);
		collegeStudents.set(8, cl5);
	
		ArrayList <College> females=new ArrayList<>();
		
		for(College var:collegeStudents) {
			if(var.getGender().equalsIgnoreCase("female")) {
				females.add(var);
			}
		}
		females.forEach(y-> System.out.println(y));
		
	}

}
