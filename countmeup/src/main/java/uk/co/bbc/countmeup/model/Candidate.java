package uk.co.bbc.countmeup.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Candidate Bean used to contain the Candidate information once retrieved from
 * the data store.
 * 
 * @author Andrew Pedrosa
 *
 */
@XmlRootElement
public class Candidate implements Serializable {
	private String name;
	private int votes;

	/**
	 * Empty constructor.
	 */
	public Candidate() {
	}

	/**
	 * Constructor setting the Candidate name and votes.
	 * 
	 * @param name
	 * @param votes
	 */
	public Candidate(String name, int votes) {
		this.name = name;
		this.votes = votes;
	}

	/**
	 * Method returning the name attribute.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set the name attribute.
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method returning the votes attribute.
	 * 
	 * @return the votes
	 */
	public int getVotes() {
		return votes;
	}

	/**
	 * Method to set the votes attribute.
	 * 
	 * @param votes
	 *            the votes to set
	 */
	public void setVotes(int votes) {
		this.votes = votes;
	}
}
