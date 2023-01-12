package arrayList;

public class Employee {
	private String name;
	private int empId;
	private String gender;
	private int salary;
	private String department;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public int setEmpId() {
		return empId;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setSalary() {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	
	public Employee(String name,int empId,String gender,int salary,String department) {
		this.name=name;
		this.empId=empId;
		this.gender=gender;
		this.salary=salary;
		this.department=department;
	}
	public String toString() {
		return "Name :"+name+"\nEmp Id :"+empId+"\nGender :"+gender+"\nSalary :"+salary+"\nDepartment :"+department+"\n";
	}

}
