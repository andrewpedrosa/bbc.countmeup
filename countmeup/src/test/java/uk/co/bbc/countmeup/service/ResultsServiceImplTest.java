/**
 * 
 */
package uk.co.bbc.countmeup.service;

import junit.framework.TestCase;
import uk.co.bbc.countmeup.model.Candidate;
import uk.co.bbc.countmeup.model.Results;

/**
 * @author Andrew Pedrosa
 *
 */
public class ResultsServiceImplTest extends TestCase {

	/**
	 * Test method for
	 * {@link uk.co.bbc.countmeup.service.ResultsServiceImpl#getVoteResults()}.
	 */
	public final void testGetVoteResults() {
		ResultsService servimpl = new ResultsServiceImpl();
		Results results = servimpl.getVoteResults();

		assertEquals(results.getCandidate().length, 4);

		for (Candidate candidate : results.getCandidate()) {
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
