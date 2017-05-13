package uk.co.bbc.countmeup.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import uk.co.bbc.countmeup.exceptions.CandidateNotFoundException;
import uk.co.bbc.countmeup.exceptions.VoterNotFoundException;
import uk.co.bbc.countmeup.exceptions.VotesExceededException;
import uk.co.bbc.countmeup.model.Results;
import uk.co.bbc.countmeup.service.ResultsService;
import uk.co.bbc.countmeup.service.ResultsServiceImpl;
import uk.co.bbc.countmeup.service.VoteService;
import uk.co.bbc.countmeup.service.VoteServiceImpl;

/**
 * REST controller class with the endpoints to place a vote for a candidate and
 * retrieve the results.
 * 
 * @author Andrew Pedrosa
 * 
 */
@RestController
@RequestMapping("/vote")

public class VoteController {

	private VoteService voteService = new VoteServiceImpl();
	private ResultsService resultsService = new ResultsServiceImpl();

	/**
	 * Endpoint to place a vote for a candidate, the voterID is the first
	 * parameter in the URI and the candidateName is the second parameter. A 201
	 * response code is returned if the vote is accepted, a 403 code is sent if
	 * the voter has already placed 3 votes and a 404 not found is returned if
	 * the voter or candidate is not registered.
	 * 
	 * @param voterId
	 *            - ID of the voter, currently stored: (voter1, voter2, voter3,
	 *            voter4)
	 * @param candidateName
	 *            - Name of the candidate receiving the votes, currently stored:
	 *            (A,B,C,D)
	 * @return Http response depending on the result of the call.
	 */
	@RequestMapping(value = "/{voterId}/{candidateName}", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<String> vote(@PathVariable String voterId, @PathVariable String candidateName) {
		try {

			voteService.saveVote(voterId, candidateName);
		} catch (VotesExceededException ex) {
			return new ResponseEntity<String>(ex.toString(), HttpStatus.FORBIDDEN);
		} catch (CandidateNotFoundException ex) {
			return new ResponseEntity<String>(ex.toString(), HttpStatus.NOT_FOUND);
		} catch (VoterNotFoundException ex) {
			return new ResponseEntity<String>(ex.toString(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>("Vote placed.", HttpStatus.CREATED);

	}

	/**
	 * Endpoint to return the results of the votes, this is returned as a JSON
	 * object with the candidate and votes listed. This is to allow for easy
	 * processing in the front end as the JSON can be converted into another
	 * object and displayed however required. A string or HTTP has not been
	 * returned as this would limit the display options available to the front
	 * end.
	 * 
	 * @return JSON response with the results of the vote
	 */
	@RequestMapping(value = "/results", method = RequestMethod.GET)
	@ResponseBody
	public Results getResults() {

		return resultsService.getVoteResults();

	}

}