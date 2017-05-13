/**
 * 
 */
package uk.co.bbc.countmeup.model;

import junit.framework.TestCase;

/**
 * @author Andrew Pedrosa
 *
 */
public class VoterTest extends TestCase {

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Voter#Voter()}.
	 */
	public final void testVoter() {
		Voter voter = new Voter();
		assertNull(voter.getVoterId());
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Voter#Voter(java.lang.String, int)}.
	 */
	public final void testVoterStringInt() {
		Voter voter = new Voter("voter1",0);
		assertEquals(voter.getVoterId(),"voter1");
		assertEquals(voter.getVotesCast(),0);
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Voter#getVotesCast()}.
	 */
	public final void testGetVotesCast() {
		Voter voter = new Voter("voter1",0);
		assertEquals(voter.getVotesCast(),0);
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Voter#setVotesCast(int)}.
	 */
	public final void testSetVotesCast() {
		Voter voter = new Voter();
		voter.setVotesCast(0);
		assertEquals(voter.getVotesCast(),0);
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Voter#getVoterId()}.
	 */
	public final void testGetVoterId() {
		Voter voter = new Voter("voter1",0);
		assertEquals(voter.getVoterId(),"voter1");
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Voter#setVoterId(java.lang.String)}.
	 */
	public final void testSetVoterId() {
		Voter voter = new Voter();
		voter.setVoterId("voter1");
		assertEquals(voter.getVoterId(),"voter1");
	}

}
