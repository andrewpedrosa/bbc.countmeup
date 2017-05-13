package uk.co.bbc.countmeup.service;

import uk.co.bbc.countmeup.dao.CandidateDAO;
import uk.co.bbc.countmeup.dao.CandidateDAOImpl;
import uk.co.bbc.countmeup.dao.VoterDAO;
import uk.co.bbc.countmeup.dao.VoterDAOImpl;
import uk.co.bbc.countmeup.exceptions.CandidateNotFoundException;
import uk.co.bbc.countmeup.exceptions.VoterNotFoundException;
import uk.co.bbc.countmeup.exceptions.VotesExceededException;
import uk.co.bbc.countmeup.model.Candidate;
import uk.co.bbc.countmeup.model.Voter;

/**
 * Implementation of the Service class checking the business logic required to
 * perform a vote returning any exceptions encountered.
 * 
 * @author Andrew Pedrosa
 *
 */
public class VoteServiceImpl implements VoteService {

	VoterDAO voterDAO = new VoterDAOImpl();
	CandidateDAO candidateDAO = new CandidateDAOImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see uk.co.bbc.countmeup.service.VoteService#saveVote(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public Voter saveVote(String voterId, String candidateName)
			throws VotesExceededException, CandidateNotFoundException, VoterNotFoundException {

		Voter voter = voterDAO.getVoter(voterId);

		// Business logic to verify how many votes the voter has made
		if (voter.getVotesCast() == 3) {
			throw new VotesExceededException();
		}

		voter.setVotesCast(voter.getVotesCast() + 1);

		voterDAO.saveVoter(voter);

		Candidate candidate = candidateDAO.getCandidate(candidateName);

		candidate.setVotes(candidate.getVotes() + 1);

		candidateDAO.saveCandidate(candidate);

		return voter;
	}
}
