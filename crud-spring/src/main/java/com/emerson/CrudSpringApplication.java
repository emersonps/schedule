package com.emerson;

import com.emerson.model.Schedule;
import com.emerson.repository.ScheduleRepository;

import com.emerson.model.Schedule;
import com.emerson.repository.ScheduleRepository;

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
	CommandLineRunner initDatabase(ScheduleRepository scheduleRepository) {
		return args -> {
			scheduleRepository.deleteAll();

			Schedule s = new Schedule();
			s.setTeacher("Emerson Pinheiro");
			s.setCourse("HTML");
			s.setTime("10/04/2022 10h00 à 20h00");

			scheduleRepository.save(s);

			Schedule s1 = new Schedule();
			s1.setTeacher("Emerson Pinheiro");
			s1.setCourse("CSS");
			s1.setTime("10/05/2022 10h00 à 20h00");

			scheduleRepository.save(s1);
		};
	}
}
