package edu.mccnebu.tickr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "edu.mccnebu.tickr.*" })
public class TickrApplication {

	public static void main(String[] args) {
		SpringApplication.run(TickrApplication.class, args);
	}

}
