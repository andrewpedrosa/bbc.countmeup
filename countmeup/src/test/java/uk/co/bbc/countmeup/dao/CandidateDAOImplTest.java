/**
 * 
 */
package uk.co.bbc.countmeup.dao;

import junit.framework.TestCase;
import uk.co.bbc.countmeup.exceptions.CandidateNotFoundException;
import uk.co.bbc.countmeup.model.Candidate;

/**
 * @author Andrew Pedrosa
 *
 */
public class CandidateDAOImplTest extends TestCase {
	private CandidateDAO candidateDAO = new CandidateDAOImpl();

	/**
	 * Test method for
	 * {@link uk.co.bbc.countmeup.dao.CandidateDAOImpl#getCandidate(java.lang.String)}.
	 */
	public final void testGetCandidate() {
		try {
			assertEquals(candidateDAO.getCandidate("B").getName(), "B");
			assertEquals(candidateDAO.getCandidate("B").getVotes(), 2000000);
		} catch (CandidateNotFoundException e) {
			fail();
		}

		try {
			candidateDAO.getCandidate("R");

		} catch (CandidateNotFoundException e) {
			// Tests the error for a candidate that does not exist
			assertEquals(e.toString(),
					"uk.co.bbc.countmeup.exceptions.CandidateNotFoundException: The candidate selected does not exist.");
		}
	}

	/**
	 * Test method for
	 * {@link uk.co.bbc.countmeup.dao.CandidateDAOImpl#saveCandidate(uk.co.bbc.countmeup.model.Candidate)}.
	 */
	public final void testSaveCandidate() {
		try {
			Candidate candidate = candidateDAO.getCandidate("A");
			int votes = candidate.getVotes();
			candidate.setVotes(votes + 1);
			candidateDAO.saveCandidate(candidate);
			assertEquals(candidateDAO.getCandidate("A").getVotes(), votes + 1);

		} catch (CandidateNotFoundException e) {
			fail();
		}
	}

	/**
	 * Test method for
	 * {@link uk.co.bbc.countmeup.dao.CandidateDAOImpl#getCandidates()}.
	 */
	public final void testGetCandidates() {

		assertEquals(candidateDAO.getCandidates().length, 4);

		for (Candidate candidate : candidateDAO.getCandidates()) {
			switch (candidate.getName()) {
			case "B":
				candidate.getName();
				assertEquals(candidate.getVotes(), 2000000);
				break;
			case "C":
				candidate.getName();
				assertEquals(candidate.getVotes(), 6000000);
				break;
			case "D":
				candidate.getName();
				assertEquals(candidate.getVotes(), 4000000);
				break;

			}
		}
	}

}
