package arrayList;

import java.util.ArrayList;

public class Practice {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
	
		a1.add("suresh");
		a1.add("mani");
		a1.add("pravin");
		a1.add("pravin");
		a1.add("mani");
		a1.add(null);
		a1.add(null);
		for(int i=0;i<=a1.size();i++) {
		if(a1.get(i).equals("pravin")||a1.get(i).equals("mani")) {
			a1.remove(i);
			System.out.println(a1.get(i));
		}else {
			System.out.println(a1.get(i));
		}
		}
		
		
	}

}
