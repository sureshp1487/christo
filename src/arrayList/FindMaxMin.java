package arrayList;

import java.util.ArrayList;

public class FindMaxMin {
	public static void main(String[] args) {
		ArrayList <Integer> numbers=new ArrayList<>();
		numbers.add(22);
		numbers.add(67);
		numbers.add(98);
		numbers.add(76);
		
		int max=0;
		for(Integer var:numbers) {
			if(var>max) {
				max=var;
			}
		}
		System.out.println("Maximum values :"+max);
		
		int min=numbers.get(0);
		for(Integer var1:numbers) {
			if(var1<min) {
				min=var1;
			}
		}
		System.out.println("Minimum value :"+min);
	}
}
