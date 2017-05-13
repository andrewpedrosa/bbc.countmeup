package uk.co.bbc.countmeup.exceptions;

/**
 * Custom exception for when a Voter record specified cannot be found.
 * 
 * @author Andrew Pedrosa
 *
 */
public class VoterNotFoundException extends Exception{

	/**
	 * Exception constructor setting the exception message.
	 */
	public VoterNotFoundException() {
		super("This voter does not exist.");
	}
}
