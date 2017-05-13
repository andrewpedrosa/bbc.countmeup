package uk.co.bbc.countmeup.dao;

import uk.co.bbc.countmeup.data.DataStore;
import uk.co.bbc.countmeup.exceptions.VoterNotFoundException;
import uk.co.bbc.countmeup.model.Voter;

/**
 * Implementation of the VoterDAO interface, providing the tools to retrieve or
 * save a voter stored in the data store class.
 * 
 * @author Andrew Pedrosa
 *
 */
public class VoterDAOImpl implements VoterDAO {

	/* (non-Javadoc)
	 * @see uk.co.bbc.countmeup.dao.VoterDAO#getVoter(java.lang.String)
	 */
	@Override
	public Voter getVoter(String voterID) throws VoterNotFoundException {
		DataStore data = new DataStore();
		Voter voter = data.getVoters().get(voterID);

		if (voter == null) {
			throw new VoterNotFoundException();
		}
		return voter;
	}

	/* (non-Javadoc)
	 * @see uk.co.bbc.countmeup.dao.VoterDAO#saveVoter(uk.co.bbc.countmeup.model.Voter)
	 */
	@Override
	public void saveVoter(Voter voter) {
		DataStore data = new DataStore();
		data.getVoters().put(voter.getVoterId(), voter);
	}

}
