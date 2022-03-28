package com.emerson;

import com.emerson.model.Student;
import com.emerson.repository.StudentRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(StudentRepository studentRepository) {
		return args -> {
			studentRepository.deleteAll();

			Student c = new Student();
			c.setName("Emerson Pinjeiro");
			c.setEmail("emerson@gmail.com");
			c.setPassword("123456789");

			studentRepository.save(c);
		};
	}
}
