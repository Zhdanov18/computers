package ru.geekbrains.computers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ComputersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputersApplication.class, args);
	}

}
