/**
 * 
 */
package uk.co.bbc.countmeup.controller;

import junit.framework.TestCase;
import uk.co.bbc.countmeup.model.Candidate;
import uk.co.bbc.countmeup.model.Results;

/**
 * @author Andrew Pedrosa
 *
 */
public class VoteControllerTest extends TestCase {

	private VoteController voteController = new VoteController();
	/**
	 * Test method for {@link uk.co.bbc.countmeup.controller.VoteController#vote(java.lang.String, java.lang.String)}.
	 */
	public final void testVote() {
		
		//Tests that votes can be placed successfully
		assertEquals(voteController.vote("voter1", "A").getBody(),"Vote placed.");
		assertEquals(voteController.vote("voter1", "A").getBody(),"Vote placed.");
		assertEquals(voteController.vote("voter1", "A").getBody(),"Vote placed.");
		
		//Tests that no more than 3 votes can be placed per voter
		assertEquals(voteController.vote("voter1", "A").getBody(),"uk.co.bbc.countmeup.exceptions.VotesExceededException: The voter has exceeded the 3 vote allocation.");
		
		//Tests the error for a voter that does not exist
		assertEquals(voteController.vote("voter5", "A").getBody(),"uk.co.bbc.countmeup.exceptions.VoterNotFoundException: This voter does not exist.");
		
		//Tests the error for a candidate that does not exist
		assertEquals(voteController.vote("voter2", "R").getBody(),"uk.co.bbc.countmeup.exceptions.CandidateNotFoundException: The candidate selected does not exist.");
		
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.controller.VoteController#getResults()}.
	 */
	public final void testGetResults() {
		Results results = voteController.getResults();
		
		assertEquals(results.getCandidate().length,4);
		
		for(Candidate candidate : results.getCandidate()){
			switch (candidate.getName()){
			case "B": candidate.getName();
			assertEquals(candidate.getVotes(),2000000);
			break;
			case "C": candidate.getName();
			assertEquals(candidate.getVotes(),6000000);
			break;
			case "D": candidate.getName();
			assertEquals(candidate.getVotes(),4000000);
			break;
			
			}
			
		}
	}

}
