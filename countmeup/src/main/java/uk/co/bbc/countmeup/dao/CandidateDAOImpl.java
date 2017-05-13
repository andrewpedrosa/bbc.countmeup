package uk.co.bbc.countmeup.dao;

import uk.co.bbc.countmeup.data.DataStore;
import uk.co.bbc.countmeup.exceptions.CandidateNotFoundException;
import uk.co.bbc.countmeup.model.Candidate;

/**
 * Implementation of the CandidateDAO interface, providing the tools to retrieve
 * or save a candidate stored or retrieve all candidates stored in the data
 * store class.
 * 
 * @author Andrew Pedrosa
 *
 */
public class CandidateDAOImpl implements CandidateDAO {

	DataStore data = new DataStore();


	/* (non-Javadoc)
	 * @see uk.co.bbc.countmeup.dao.CandidateDAO#getCandidate(java.lang.String)
	 */
	@Override
	public Candidate getCandidate(String candidateName) throws CandidateNotFoundException {
		Candidate candidate = data.getCandidates().get(candidateName);

		if (candidate == null) {
			throw new CandidateNotFoundException();
		}
		return candidate;
	}

	/* (non-Javadoc)
	 * @see uk.co.bbc.countmeup.dao.CandidateDAO#saveCandidate(uk.co.bbc.countmeup.model.Candidate)
	 */
	@Override
	public void saveCandidate(Candidate candidate) {
		data.getCandidates().put(candidate.getName(), candidate);
	}

	/* (non-Javadoc)
	 * @see uk.co.bbc.countmeup.dao.CandidateDAO#getCandidates()
	 */
	@Override
	public Candidate[] getCandidates() {

		Candidate[] candidates = new Candidate[data.getCandidates().values().toArray().length];

		for (int i = 0; i < data.getCandidates().values().toArray().length; i++) {
			candidates[i] = (Candidate) data.getCandidates().values().toArray()[i];
		}

		return candidates;
	}

}
