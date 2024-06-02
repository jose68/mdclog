package jbi.sample.mdclog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MdclogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdclogApplication.class, args);
	}

}