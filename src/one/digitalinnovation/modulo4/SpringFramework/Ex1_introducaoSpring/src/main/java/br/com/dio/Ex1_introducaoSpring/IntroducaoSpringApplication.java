package br.com.dio.Ex1_introducaoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class IntroducaoSpringApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoSpringApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IntroducaoSpringApplication.class);
	}
}
