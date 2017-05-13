package uk.co.bbc.countmeup.service;

import uk.co.bbc.countmeup.model.Results;

/**
 * Service class which retrieves the Candidate list and converts it into a
 * Results Bean ready for JSON output.
 * 
 * @author Andrew Pedrosa
 *
 */
public interface ResultsService {

	/**
	 * Method to return a Results Bean ready to be converted into JSON
	 * containing all of the candidate information.
	 * 
	 * @return Results bean with all of the Candidate information stored within.
	 */
	public Results getVoteResults();
}
