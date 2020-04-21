package entities;


public class Candidate {
	
	private String name;
	private String technicalExpertise;
	private String city;
	private int yearsOfExperience;
	
	/**
	 * @param name
	 * @param technicalExpertise
	 * @param city
	 * @param yearsOfExperience
	 */
	
	public Candidate(String name, String technicalExpertise, String city, int yearsOfExperience) {
		super();
		this.name = name;
		this.technicalExpertise = technicalExpertise;
		this.city = city;
		this.yearsOfExperience = yearsOfExperience;
	}
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the technicalExpertise
	 */
	public String getTechnicalExpertise() {
		return technicalExpertise;
	}

	/**
	 * @param technicalExpertise the technicalExpertise to set
	 */
	public void setTechnicalExpertise(String technicalExpertise) {
		this.technicalExpertise = technicalExpertise;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the yearsOfExperience
	 */
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	/**
	 * @param yearsOfExperience the yearsOfExperience to set
	 */
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
}
