package uk.co.bbc.countmeup.service;

import uk.co.bbc.countmeup.dao.CandidateDAO;
import uk.co.bbc.countmeup.dao.CandidateDAOImpl;
import uk.co.bbc.countmeup.model.Results;

/**
 * Implementation of the Service class which retrieves the Candidate list and
 * converts it into a Results Bean ready for JSON output.
 * 
 * @author Andrew Pedrosa
 *
 */
public class ResultsServiceImpl implements ResultsService {

	CandidateDAO candidateDAO = new CandidateDAOImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see uk.co.bbc.countmeup.service.ResultsService#getVoteResults()
	 */
	@Override
	public Results getVoteResults() {

		Results results = new Results();
		results.setCandidate(candidateDAO.getCandidates());

		return results;
	}

}
