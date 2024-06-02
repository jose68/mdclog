package jbi.sample.mdclog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jbi.sample.mdclog.service.VirtualThreadService;

@RestController
public class VirtualThreadController {

	@Autowired  // Injects dependencies automatically
	private VirtualThreadService virtualThreadService;
	
	@GetMapping("/test")
	public String Test() {
		virtualThreadService.runTest(1);
		virtualThreadService.runTest(2);
		return "OK";
	}

}
