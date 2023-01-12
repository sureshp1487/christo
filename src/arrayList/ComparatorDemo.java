package arrayList;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

		Employee n1 = (Employee) o1;
		Employee n2 = (Employee) o2;

		if (n1.getSalary() > n2.getSalary())
			return -1;
		else if (n1.getSalary() < n2.getSalary())
			return +1;
		else
			return 0;
	}

}
