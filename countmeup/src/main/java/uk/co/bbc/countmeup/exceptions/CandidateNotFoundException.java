package uk.co.bbc.countmeup.exceptions;

/**
 * Custom exception for when a Candidate record specified cannot be found.
 * 
 * @author Andrew Pedrosa
 *
 */
public class CandidateNotFoundException extends Exception {

	/**
	 * Exception constructor setting the exception message.
	 */
	public CandidateNotFoundException() {
		super("The candidate selected does not exist.");
	}
}
