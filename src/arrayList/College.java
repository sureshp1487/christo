package arrayList;

public class College {
	private String studentName;
	private int age;
	private int fees;
	private String gender;
	private String dept;
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setFees(int fees) {
		this.fees=fees;
	}
	public int getFees() {
		return fees;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public College(String studentName,int age,int fees,String gender,String dept) {
		this.studentName=studentName;
		this.age=age;
		this.fees=fees;
		this.gender=gender;
		this.dept=dept;
	}
	public String toString() {
		return "Student Name :"+studentName+"\nAge :"+age+"\nFees :"+fees+"\nGender"+gender+"\nDepartment :"+dept+"\n";
	}
}
