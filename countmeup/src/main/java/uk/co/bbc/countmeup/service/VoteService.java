package uk.co.bbc.countmeup.service;

import uk.co.bbc.countmeup.exceptions.CandidateNotFoundException;
import uk.co.bbc.countmeup.exceptions.VoterNotFoundException;
import uk.co.bbc.countmeup.exceptions.VotesExceededException;
import uk.co.bbc.countmeup.model.Voter;

/**
 * Service class checking the business logic required to perform a vote
 * returning any exceptions encountered.
 * 
 * @author Andrew Pedrosa
 *
 */
public interface VoteService {

	/**
	 * Method to save a vote made by a voter, verifies that the voter does not
	 * exceed the 3 votes allocated to them.
	 * 
	 * @param voterId
	 * @param candidateName
	 * @return Voter object if no exceptions are encountered
	 * @throws VotesExceededException
	 * @throws CandidateNotFoundException
	 * @throws VoterNotFoundException
	 */
	public Voter saveVote(String voterId, String candidateName)
			throws VotesExceededException, CandidateNotFoundException, VoterNotFoundException;

}
