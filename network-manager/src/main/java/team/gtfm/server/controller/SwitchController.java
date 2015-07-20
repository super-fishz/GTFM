package team.gtfm.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import team.gtfm.server.bean.Room;
import team.gtfm.server.bean.Switch;
import team.gtfm.server.bean.UpdateResult;

@RestController
public class SwitchController {
	private final String contentType = "application/json; charset=utf-8";
	
	@RequestMapping(value="/data/switch", 
			method=RequestMethod.POST,
			consumes=contentType,
			produces=contentType)
	public ResponseEntity<UpdateResult> insertRoom(@RequestBody Switch switchObj){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/data/switch/{seq}", 
			method=RequestMethod.GET,
			produces=contentType)
	public ResponseEntity<Switch> getRoom(@PathVariable String seq){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/data/switch/{seq}", 
			method=RequestMethod.DELETE,
			produces=contentType)
	public ResponseEntity<UpdateResult> deleteRoom(@PathVariable String seq){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/data/switch", 
			method=RequestMethod.PUT,
			consumes=contentType,
			produces=contentType)
	public ResponseEntity<UpdateResult> putRoom(@RequestBody Switch switchObj){
		return new ResponseEntity<>(HttpStatus.OK);
	}
}