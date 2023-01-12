package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
	public static void main(String[] args) {
	Bike b1=new Bike("TN07CQ1487","PULSAR","BLACK",160000);
	Bike b2=new Bike("TN08CQ1487","DUKE","ORANGE",220000);
	Bike b3=new Bike("TN09CQ1487","YEMAHA","BLUE",200000);
	Bike b4=new Bike("TN10CQ1487","BMW","WHITE",460000);
	Bike b5=new Bike("TN11CQ1487","DUCATI","BLUE",500000);
	
	HashMap <String,Bike> bikeDetails=new HashMap<>();
	bikeDetails.put(b1.getBikeNo(),b1 );
	bikeDetails.put(b2.getBikeNo(),b2 );
	bikeDetails.put(b3.getBikeNo(),b3 );
	bikeDetails.put(b4.getBikeNo(),b4 );
	bikeDetails.put(b5.getBikeNo(),b5 );
	
	bikeDetails.keySet().forEach(y-> System.out.println(bikeDetails.get(y)));
	
	Iterator <Bike> det=bikeDetails.values().iterator();
	while(det.hasNext()) {
		if(det.next().getColor().equalsIgnoreCase("black")) {
			det.remove();
		}																																																																													
	}
	bikeDetails.keySet().forEach(y-> System.out.println("\n"+bikeDetails.get(y)));
	}
}
