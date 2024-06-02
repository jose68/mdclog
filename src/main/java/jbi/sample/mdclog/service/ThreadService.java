package jbi.sample.mdclog.service;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.slf4j.MDC;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
@Service
public class ThreadService {
	
	Logger logger = LoggerFactory.getLogger(ThreadService.class);
	
	@Async
	public CompletableFuture<Integer> runTest(int id) throws InterruptedException {
		MDC.put("ThreadId", id+"");
		System.out.println(LocalTime.now()+" Start runTest: "+id);
		if (id == 1) {
			Thread.sleep(5000);
		}
		logger.info("test: "+id);
		System.out.println(LocalTime.now()+" end runTest: "+id);
		return CompletableFuture.completedFuture(0);
	}
}
