package hashMap;

import java.util.HashMap;

public class Candidate {
	public static void main(String[] args) {
		HashMap<Integer,String> CandidateDetails=new HashMap<>();
		CandidateDetails.put(721,"Suresh");
		CandidateDetails.put(738, "Sudharshan");
		CandidateDetails.put(723, "Athisaya Evagilin");
		CandidateDetails.put(739, "Abdul Gaffoor");
		CandidateDetails.remove(721);
		System.out.println(CandidateDetails+"\n");
		System.out.println("Print the Values :"+CandidateDetails.values()+"\n");
		System.out.println("Price the  Key only :"+CandidateDetails.keySet()+"\n");
		
		System.out.println("after remove the 721 :"+CandidateDetails);
		
		System.out.println("get() bracket inside the key is print single value :"+CandidateDetails.get(738)+"\n");
		
		CandidateDetails.keySet().forEach(x -> System.out.println(CandidateDetails.get(x)));
		
		for(Integer  var:CandidateDetails.keySet()) {
			System.out.println("\n"+CandidateDetails.get(var));
		}
		
		
	}

}
