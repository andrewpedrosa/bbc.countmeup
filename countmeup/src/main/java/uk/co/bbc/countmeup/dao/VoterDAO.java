package uk.co.bbc.countmeup.dao;

import uk.co.bbc.countmeup.exceptions.VoterNotFoundException;
import uk.co.bbc.countmeup.model.Voter;

/**
 * Voter DAO providing options to retrieve or store a stored Voter.
 * 
 * @author Andrew Pedrosa
 *
 */
public interface VoterDAO {

	/**
	 * Returns the stored voter record from the data source.
	 * 
	 * @param voterID
	 * @return Stored Voter record
	 * @throws VoterNotFoundException
	 */
	public Voter getVoter(String voterID) throws VoterNotFoundException;

	/**
	 * Saves a Voter record to the data source.
	 * 
	 * @param voter
	 *            object
	 */
	public void saveVoter(Voter voter);
}
