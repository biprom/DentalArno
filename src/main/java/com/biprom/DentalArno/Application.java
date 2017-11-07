package com.biprom.DentalArno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Kristof
 * Created on 21/10/2017.
 */
@SpringBootApplication
@ComponentScan("com.biprom.DentalArno")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
