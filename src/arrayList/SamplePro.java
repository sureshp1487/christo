package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SamplePro {
	public static void main(String[] args) {
		ArrayList<String> ages=new ArrayList <>();
		
		ages.add("suresh");
		ages.add("suresh");
		ages.add("mani");
		ages.add("pravin");
		//ages.add(25);
		//ages.add(24);
		
		
		List<String> ages1=ages.stream().distinct().collect(Collectors.toList());
		System.out.println(ages1);
//		remove the o index position 
		
	//	ages.remove(0);
		
//		set the value 0 index position
		//ages.set(0, 28);
		
//		for loop ----
//		for(int i=0;i<ages.size();i++) {
//			System.out.println("Age :"+ages.get(i)jyjyew);
//			System.out.println("Age :"+ages);
//		}
		
//	enhanced for loop ------
//		for(Integer x:ages) {
//			System.out.println(x);
//		}
//		
//	lamda empression
		
		//ages.forEach(y-> System.out.println(y));
		
	}

}
