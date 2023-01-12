package arrayList;

import java.util.ArrayList;

public class PenBrand {
	public static void main(String[] args) {
		ArrayList<String> brands=new ArrayList<>();
		
		brands.add("hero");
		brands.add("cello suresh");
		brands.add("nataraj");
		brands.add("rollex");
		
		
		
		for(int i=0;i<brands.size();i++) {
			System.out.println(brands.get(i));
		}
		
		String Bigname="";
		for(String var:brands) {
			if(var.length()>Bigname.length()) {
				Bigname=var;
			}
		}
		System.out.println(Bigname);
		
		brands.forEach(y-> System.out.println(y));
	}

}
