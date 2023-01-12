package arrayList;

public class Programmer {
	String name;
	String designation;
	String codingLanguage;
	boolean isMale;
	
	public Programmer(String name,String designation,String codingLanguage,boolean isMale) {
		this.name=name;
		this.designation=designation;
		this.codingLanguage=codingLanguage;
		this.isMale=isMale;	
	}
	public String toString() {
		return "Employee Name :"+name+"\nEmp Designation :"+designation+"\nCoding Langua :"+codingLanguage+"\nGender :"+isMale+"\n";
	}
	

}
