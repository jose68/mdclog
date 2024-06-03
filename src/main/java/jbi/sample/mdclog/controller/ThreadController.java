package jbi.sample.mdclog.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jbi.sample.mdclog.service.ThreadService;

@RestController
public class ThreadController {

	@Autowired  // Injects dependencies automatically
	private ThreadService threadService;
	
	@GetMapping("/test")
	public String Test() throws InterruptedException {
		
	CompletableFuture<Integer> threadService1 = threadService.runTest(1);
        CompletableFuture<Integer> threadService2 = threadService.runTest(2);

        CompletableFuture.allOf(threadService1, threadService2).join();
        
        return "OK";
	}

}
