package stream;

public class Students {
	private int id;
	private String name;
	private int age;
	private String degree;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Students(int id, String name, int age, String degree, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", degree=" + degree + ", gender=" + gender
				+ "]";
	}

}
