/**
 * 
 */
package uk.co.bbc.countmeup.model;

import junit.framework.TestCase;

/**
 * @author Andrew Pedrosa
 *
 */
public class CandidateTest extends TestCase {

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Candidate#Candidate()}.
	 */
	public final void testCandidate() {
		Candidate candidate = new Candidate();
		assertNull(candidate.getName());
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Candidate#Candidate(java.lang.String, int)}.
	 */
	public final void testCandidateStringInt() {
		Candidate candidate = new Candidate("A",2);
		assertEquals(candidate.getName(),"A");
		assertEquals(candidate.getVotes(),2);
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Candidate#getName()}.
	 */
	public final void testGetName() {
		Candidate candidate = new Candidate("A",2);
		assertEquals(candidate.getName(),"A");
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Candidate#setName(java.lang.String)}.
	 */
	public final void testSetName() {
		Candidate candidate = new Candidate();
		candidate.setName("A");
		assertEquals(candidate.getName(),"A");
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Candidate#getVotes()}.
	 */
	public final void testGetVotes() {
		Candidate candidate = new Candidate("A",2);
		assertEquals(candidate.getVotes(),2);
	}

	/**
	 * Test method for {@link uk.co.bbc.countmeup.model.Candidate#setVotes(int)}.
	 */
	public final void testSetVotes() {
		Candidate candidate = new Candidate();
		candidate.setVotes(2);
		assertEquals(candidate.getVotes(),2);
	}

}
