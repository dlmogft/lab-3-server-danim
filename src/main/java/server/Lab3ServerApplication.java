package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Boot application that acts as a Spring Config server
 * reading yml files from a Git repository specified in application.yml
 *
 * The @EnableConfigServer annotation is necessary to set the application as a config server
 *
 */
@SpringBootApplication
@EnableConfigServer
public class Lab3ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3ServerApplication.class, args);
	}

}
