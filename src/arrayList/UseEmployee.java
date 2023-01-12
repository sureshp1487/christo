package arrayList;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee em = new Employee("suresh", 1, "male", 15000, "testing");
		Employee em1 = new Employee("ravi", 2, "male", 17000, "backend");
		Employee em2 = new Employee("sangetha", 3, "female", 20000, "webdesign");
		Employee em3 = new Employee("priya", 4, "female", 13000, "testing");
		Employee em4 = new Employee("mani", 5, "male", 25000, "backend");
		Employee em5 = new Employee("arun", 6, "male", 23000, "webdesign");
		Employee em6 = new Employee("pravin", 7, "male", 18000, "testing");
		Employee em7 = new Employee("pravin kumar", 8, "male", 32000, "backend");
		Employee em8 = new Employee("raj", 9, "male", 45000, "webdesign");
		Employee em9 = new Employee("kumar", 10, "male", 34000, "testing");

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(em);
		employees.add(em1);
		employees.add(em2);
		employees.add(em3);
		employees.add(em4);
		employees.add(em5);
		employees.add(em6);
		employees.add(em7);
		employees.add(em8);
		employees.add(em9);

		ArrayList<Employee> testings = new ArrayList<>();
		employees.forEach(y -> {
			if (y.getDepartment().equalsIgnoreCase("testing")) {
				testings.add(y);
			}
		});

		testings.forEach(y -> System.out.println(y));

	}
}
