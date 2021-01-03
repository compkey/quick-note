package com.example.quicknote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class QuickNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickNoteApplication.class, args);
	}

}
