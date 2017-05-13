/**
 * 
 */
package uk.co.bbc.countmeup.dao;

import junit.framework.TestCase;
import uk.co.bbc.countmeup.exceptions.VoterNotFoundException;
import uk.co.bbc.countmeup.model.Voter;

/**
 * @author Andrew Pedrosa
 *
 */
public class VoterDAOImplTest extends TestCase {

	VoterDAO voterDAO = new VoterDAOImpl();
	/**
	 * Test method for {@link uk.co.bbc.countmeup.dao.VoterDAOImpl#getVoter(java.lang.String)}.
	 */
	public final void testGetVoter() {
		try {
			assertEquals(voterDAO.getVoter("voter2").getVotesCast(),0);
		} catch (VoterNotFoundException e) {
			fail();
		}
		
		try {
			voterDAO.getVoter("voter25");
		} catch (VoterNotFoundException e) {
			// Tests the error for a voter that does not exist
			assertEquals(e.toString(),"uk.co.bbc.countmeup.exceptions.VoterNotFoundException: This voter does not exist.");
		}
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.dao.VoterDAOImpl#saveVoter(uk.co.bbc.countmeup.model.Voter)}.
	 */
	public final void testSaveVoter() {
		try {
			Voter voter = voterDAO.getVoter("voter4");
			int votes = voter.getVotesCast();
			voter.setVotesCast(votes+1);
			voterDAO.saveVoter(voter);
			assertEquals(voterDAO.getVoter("voter4").getVotesCast(),votes+1);
		} catch (VoterNotFoundException e) {
			fail();
		}
		
		
	}

}
