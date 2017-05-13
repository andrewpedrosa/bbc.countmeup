package uk.co.bbc.countmeup.dao;

import uk.co.bbc.countmeup.exceptions.CandidateNotFoundException;
import uk.co.bbc.countmeup.model.Candidate;

/**
 * Candidate DAO providing options to retrieve or store a stored Candidate or
 * retrieve all stored Candidates.
 * 
 * @author Andrew Pedrosa
 *
 */
public interface CandidateDAO {
	
	/**
	 * Returns the stored Candidate record from the data source.
	 * 
	 * @param candidateName
	 * @return Stored Candidate record
	 * @throws CandidateNotFoundException
	 */
	public Candidate getCandidate(String candidateName) throws CandidateNotFoundException;

	/**
	 * Returns all of the Candidate records stored in the data source
	 * 
	 * @return Array of all Candidate records
	 */
	public Candidate[] getCandidates();

	/**
	 * Saves a Candidate record to the data source.
	 * 
	 * @param candidate object
	 */
	public void saveCandidate(Candidate candidate);
}
