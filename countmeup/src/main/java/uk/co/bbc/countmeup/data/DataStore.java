package uk.co.bbc.countmeup.data;

import java.util.HashMap;

import uk.co.bbc.countmeup.model.Candidate;
import uk.co.bbc.countmeup.model.Voter;

/**
 * This class is being used as a mock storage system as I am unsure of the
 * target storage system. It will store the data in HashMaps to mimic a table
 * with a key. I am not linking the two data sets together as there is no need
 * to return the number of votes placed by each person to a candidate.
 **/
public class DataStore {

	static private HashMap<String, Voter> voters = new HashMap<>();
	static private HashMap<String, Candidate> candidates = new HashMap<>();

	// Block of static code so that there is data available for use in the
	// example in order to prove that the code is working correctly
	static {
		candidates.put("A", new Candidate("A", 8000000));
		candidates.put("B", new Candidate("B", 2000000));
		candidates.put("C", new Candidate("C", 6000000));
		candidates.put("D", new Candidate("D", 4000000));
		voters.put("voter1", new Voter("voter1", 0));
		voters.put("voter2", new Voter("voter2", 0));
		voters.put("voter3", new Voter("voter3", 0));
		voters.put("voter4", new Voter("voter4", 0));

	}

	/**
	 * Returns a HashMap with the Voters stored within
	 * 
	 * @return the Voters in a HashMap
	 */
	public HashMap<String, Voter> getVoters() {
		return voters;
	}

	/**
	 * Returns a HashMap with the Candidates stored within
	 * 
	 * @return the Candidates in a HashMap
	 */
	public HashMap<String, Candidate> getCandidates() {
		return candidates;
	}


}
