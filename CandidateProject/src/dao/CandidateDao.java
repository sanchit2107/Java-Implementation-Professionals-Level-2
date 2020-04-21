package dao;

import java.util.*;
import entities.Candidate;

public class CandidateDao {
	
	private static List<Candidate> candidateList;
	
	static {
		prerpareCandidateList();
	}

	private static void prerpareCandidateList() {
		
		candidateList = new ArrayList<Candidate>();
		candidateList.add(new Candidate("Ramesh", "Java", "Ghaziabad", 2));
		candidateList.add(new Candidate("Suresh", "C++", "Delhi", 12));
		candidateList.add(new Candidate("Rakesh", "Git", "Noida", 3));
		candidateList.add(new Candidate("Hemesh", "MAVEN", "Ghaziabad", 4));
		candidateList.add(new Candidate("Aryesh", "Python", "Banglore", 23));
		candidateList.add(new Candidate("Janesh", "ML", "Pune", 1));
		candidateList.add(new Candidate("Umesh", "AI", "hyderabad", 0));
		candidateList.add(new Candidate("Mohesh", "Java", "Ghaziabad", 2));
		candidateList.add(new Candidate("kesh", "Cloud", "Mumbai", 0));
		candidateList.add(new Candidate("Kamlesh", "Java", "Mumbai", 6));
		candidateList.add(new Candidate("Swathi", "C++", "pune", 2));
		candidateList.add(new Candidate("komlesh", "Git", "Delhi", 7));
		
		
		
		
	}

	public static List<Candidate> getCandidateList() {
		return candidateList;
	}
}
