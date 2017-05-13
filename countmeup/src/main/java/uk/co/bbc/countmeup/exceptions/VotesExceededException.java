package uk.co.bbc.countmeup.exceptions;

/**
 * Custom exception for when the voter has exceeded the 3 vote limit.
 * 
 * @author Andrew Pedrosa
 *
 */
public class VotesExceededException extends Exception {

	/**
	 * Exception constructor setting the exception message.
	 */
	public VotesExceededException() {
		super("The voter has exceeded the 3 vote allocation.");
	}
}
