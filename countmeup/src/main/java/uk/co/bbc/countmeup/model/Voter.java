package uk.co.bbc.countmeup.model;

import java.io.Serializable;

/**
 * Voter Bean used to contain the Voter information once retrieved from the data
 * store.
 * 
 * @author Andrew Pedrosa
 *
 */
public class Voter implements Serializable {

	private String voterId;
	private int votesCast;

	/**
	 * Empty constructor.
	 */
	public Voter() {
	}

	/**
	 * Constructor setting the Voter name and votes.
	 * 
	 * @param voterId
	 * @param votesCast
	 */
	public Voter(String voterId, int votesCast) {
		this.setVoterId(voterId);
		this.votesCast = votesCast;
	}

	/**
	 * Method returning the votesCast attribute.
	 * 
	 * @return the votesCast
	 */
	public int getVotesCast() {
		return votesCast;
	}

	/**
	 * Method to set the votesCast attribute.
	 * 
	 * @param votesCast
	 *            the votesCast to set
	 */
	public void setVotesCast(int votesCast) {
		this.votesCast = votesCast;
	}

	/**
	 * Method returning the voterId attribute.
	 * 
	 * @return the voterId
	 */
	public String getVoterId() {
		return voterId;
	}

	/**
	 * Method to set the voterId attribute.
	 * 
	 * @param voterId
	 *            the voterId to set
	 */
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

}
