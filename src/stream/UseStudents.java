package stream;

import java.util.*;
import java.util.stream.*;

import com.sun.jdi.Value;

import arrayList.Student;



public class UseStudents {
	public static void main(String[]args) {
	Students st1=new Students(101,"Suresh kumar",25,"Bsc","Male");
	Students st2=new Students(102,"priyanga",20,"Bca","Female");
	Students st3=new Students(103,"priya",18,"B.com","Female");
	Students st4=new Students(104,"kaviya",19,"B.com(a/f)","Female");
	Students st5=new Students(105,"Suresh",22,"Bsc","Male");
	
	ArrayList<Students> studDetails=new ArrayList<>();
	studDetails.add(st1);
	studDetails.add(st2);
	studDetails.add(st3);
	studDetails.add(st4);
	studDetails.add(st5);
	ArrayList<Students> femaleDetails=new ArrayList<>();
	for(Students var:studDetails) {
		if(var.getGender().equalsIgnoreCase("male")) {
			femaleDetails.add(var);
		}
	}
	for(Students f:femaleDetails) {
		System.out.println(f);
	}
	
	

	List<Students>malesDetails=studDetails.stream().filter(x-> x.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
	
	//collect the female details in using map
	//studDetails.stream().filter(y->y.getGender().equalsIgnoreCase("female")).forEach(x-> System.out.println(x));
	 
	List<String> findName=studDetails.stream().map(y-> y.getName()).collect(Collectors.toList());
	//System.out.println("print"+findName);
	

	//	using toMap the 
	Map<Integer, Object>findName1=studDetails.stream().collect(Collectors.toMap(x->x.getId(), student ->student));
	//System.out.println("Map :"+findName1);

	//	find the count in condition
	Long total=studDetails.stream().filter(x-> x.getGender().equalsIgnoreCase("female")).count();
	//System.out.println("Female Count :"+total);
	
	
	//................////find the max and min Value..............................
	Optional<Students> max=studDetails.stream().max((x,y)->x.getAge()-y.getAge());
	System.out.println("Max"+max);

	
	//malesDetails.forEach(x-> System.out.println(x));
	
	findName.forEach(x->{
		if(x.length()%2==0) {
			//System.out.println(x.charAt(x.length()/2-1)+" "+x.charAt(x.length()/2));
		}else {
			//System.out.println(x.charAt(x.length()/2));
		}
	});
	
	
}
}