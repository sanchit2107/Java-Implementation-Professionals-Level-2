package com.capgemini.cabmgt.entities;

public class Cab {
	private String id;
	private String model;
	
	public Cab(String id, String model) {
		super();
		this.id = id;
		this.model = model;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg) {
		if(this == arg)
			return true;
		if(arg == null || !(arg instanceof Cab))
			return false;
		Cab c = (Cab)arg;
		return c.id.equals(this.id);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ID is: " + id + " - " + "MODEL is: " + model;
	}
	
	
}
