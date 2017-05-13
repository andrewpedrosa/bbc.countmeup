package uk.co.bbc.countmeup.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Results Bean used to contain the all the Candidate information once retrieved
 * from the data store.
 * 
 * @author Andrew Pedrosa
 *
 */
@XmlRootElement
@XmlSeeAlso({ Candidate.class })
public class Results implements Serializable {

	private Candidate[] candidate;

	/**
	 * Empty constructor.
	 */
	public Results() {
	}

	/**
	 * Method returning a Candidate Array with all the stored Candidate records
	 * within.
	 * 
	 * @return the candidates
	 */
	public Candidate[] getCandidate() {
		return candidate;
	}

	/**
	 * Method to set the Candidate Array.
	 * 
	 * @param candidates
	 *            the candidates to set
	 */
	public void setCandidate(Candidate[] candidates) {
		this.candidate = candidates;
	}

}
