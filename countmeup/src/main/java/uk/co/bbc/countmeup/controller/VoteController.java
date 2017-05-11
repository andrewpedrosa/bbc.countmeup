package uk.co.bbc.countmeup.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vote")

public class VoteController {
	
 @RequestMapping(value = "/{name}", method = RequestMethod.PUT)
 @ResponseBody
 public ResponseEntity<String> vote(@PathVariable String name) {
	 return ResponseEntity.status(HttpStatus.FORBIDDEN)
		       .contentType(MediaType.TEXT_PLAIN)
		       .body("Vote Accepted");

	 
 }
 
 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
 @ResponseBody
 public ResponseEntity<String> voteResults(@PathVariable String name) {
	 return ResponseEntity.status(HttpStatus.FORBIDDEN)
		       .contentType(MediaType.TEXT_PLAIN)
		       .body("Vote Accepted");

	 
 }
}