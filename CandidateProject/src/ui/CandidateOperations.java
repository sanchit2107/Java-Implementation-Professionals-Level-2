package ui;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

import javax.xml.crypto.dsig.CanonicalizationMethod;

import dao.CandidateDao;
import entities.Candidate;

public class CandidateOperations {

	public static void main(String[] args) {
		
		System.out.println("All Candidates--");
		List<Candidate> candidates = CandidateDao.getCandidateList();
		candidates.forEach((c) -> 
					System.out.println(c.getName() + " " + c.getTechnicalExpertise() +
					 " " + c.getCity() + " "  + c.getYearsOfExperience()));
		
		System.out.println(" =============================================== ");
		System.out.println("List of Ghaziabad Candidates--");
		
		List<Candidate> gzbCandidates = CandidateDao.getCandidateList().stream().
				filter((can) -> can.getCity().equals("Ghaziabad"))
				.collect(Collectors.toList());
		
		gzbCandidates.forEach((c) -> 
		System.out.println(c.getName() + " " + c.getTechnicalExpertise() +
		 " " + c.getCity() + " "  + c.getYearsOfExperience()));
		
		
		System.out.println(" =============================================== ");
		System.out.println("Candidates count per city--");
		
		Map<String, List<Candidate>> cityCount = CandidateDao.getCandidateList().
				stream().collect(Collectors.groupingBy(
						(candidate) ->candidate.getCity()
						));
		
		for(String city: cityCount.keySet()) {
			System.out.println(city + " " + cityCount.get(city).size());
		}
		
		
		for(String city: cityCount.keySet()) {
			System.out.println("******" + city + "******");
			List<Candidate> candidatescity = cityCount.get(city);
			candidatescity.forEach((c) -> System.out.println(c.getName() + " " + c.getTechnicalExpertise() + " " + c.getCity() + " " + c.getYearsOfExperience()));
		}
		
		
		System.out.println(" =============================================== ");
		System.out.println("Freshers Candidates List--");
		
		List<Candidate> fresher = CandidateDao.getCandidateList().stream().
				filter((can) -> can.getYearsOfExperience() == 0)
				.collect(Collectors.toList());
		
		fresher.forEach((c) -> 
		System.out.println(c.getName() + " " + c.getTechnicalExpertise() +
		 " " + c.getCity() + " "  + c.getYearsOfExperience()));
		
		
		System.out.println(" =============================================== ");
		System.out.println("Highest Experience Candidates List--");
		
		int maxYear = CandidateDao.getCandidateList()
				.stream().map((can) -> can.getYearsOfExperience())
				.max(Integer::compare)
				.get();
		
		List<Candidate> highest = CandidateDao.getCandidateList().stream().
				filter((c) -> c.getYearsOfExperience() == maxYear)
				.collect(Collectors.toList());
		
		highest.forEach((c) -> 
		System.out.println(c.getName() + " " + c.getTechnicalExpertise() +
		 " " + c.getCity() + " "  + c.getYearsOfExperience()));
		
		
		System.out.println(" =============================================== ");
		System.out.println("Remove Fresher Candidates  from the List--");
		
		List<Candidate> candiatesList = CandidateDao.getCandidateList();
		candiatesList.removeIf((c) -> c.getYearsOfExperience() == 0 );
		
		candiatesList.forEach((c) -> System.out.println(c.getName() + " " + c.getYearsOfExperience()));
		
		
		
		System.out.println(" =============================================== ");
		System.out.println("Candidates in Reverse Order--");
		Collections.reverse(candiatesList);
		candiatesList.forEach((c) -> System.out.println(c.getName() + " -- " + c.getTechnicalExpertise() + " -- "
				+ c.getCity() + " -- " + c.getYearsOfExperience()
				));
		
		
		System.out.println(" =============================================== ");
		System.out.println("Candidates in Sorted Order--");
		Collections.sort(candiatesList, (c1, c2) -> (c1.getName().compareTo(c2.getName())));
		candiatesList.forEach((c) -> System.out.println(c.getName() + " -- " + c.getTechnicalExpertise() + " -- "
				+ c.getCity() + " -- " + c.getYearsOfExperience()
				));
		
		
		System.out.println(" =============================================== ");
		System.out.println("Candidates in ReverseSorted Order--");
		Collections.sort(candiatesList, Collections.reverseOrder((c1, c2) -> (c1.getName().compareTo(c2.getName()))));
		candiatesList.forEach((c) -> System.out.println(c.getName() + " -- " + c.getTechnicalExpertise() + " -- "
				+ c.getCity() + " -- " + c.getYearsOfExperience()
				));
	}

}
    