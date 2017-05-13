/**
 * 
 */
package uk.co.bbc.countmeup.service;

import junit.framework.TestCase;
import uk.co.bbc.countmeup.exceptions.CandidateNotFoundException;
import uk.co.bbc.countmeup.exceptions.VoterNotFoundException;
import uk.co.bbc.countmeup.exceptions.VotesExceededException;
import uk.co.bbc.countmeup.model.Voter;

/**
 * @author Andrew Pedrosa
 *
 */
public class VoteServiceImplTest extends TestCase {

	/**
	 * Test method for
	 * {@link uk.co.bbc.countmeup.service.VoteServiceImpl#saveVote(java.lang.String, java.lang.String)}.
	 */
	public final void testSaveVote() {
		VoteService voteserv = new VoteServiceImpl();

		try {
			assertEquals(voteserv.saveVote("voter3", "A").getVotesCast(), 1);
			assertEquals(voteserv.saveVote("voter3", "A").getVotesCast(), 2);
			assertEquals(voteserv.saveVote("voter3", "A").getVotesCast(), 3);
		} catch (VotesExceededException | CandidateNotFoundException | VoterNotFoundException e) {
			fail();
		}

		try {
			voteserv.saveVote("voter3", "A");
		} catch (VotesExceededException | CandidateNotFoundException | VoterNotFoundException e) {

			// Tests the error for a voter that has exceeded their allocated
			// votes
			assertEquals(e.toString(),
					"uk.co.bbc.countmeup.exceptions.VotesExceededException: The voter has exceeded the 3 vote allocation.");
		}

	}

}
