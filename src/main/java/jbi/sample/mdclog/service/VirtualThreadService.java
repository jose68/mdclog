package jbi.sample.mdclog.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.MDC;

import org.slf4j.Logger;
@Service
public class VirtualThreadService {
	
	Logger logger = LoggerFactory.getLogger(VirtualThreadService.class);
	
	public void runTest(int id) {
		MDC.put("virtualThreadId", id+"");
		logger.info("test:"+id);
		return;
	}
}
