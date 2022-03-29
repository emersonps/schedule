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
			s.setTime("10/04/2022 17h00 às 20h00");

			scheduleRepository.save(s);

			Schedule s1 = new Schedule();
			s1.setTeacher("Emerson Pinheiro");
			s1.setCourse("CSS");
			s1.setTime("10/05/2022 10h00 àa 12h00");

			scheduleRepository.save(s1);

			Schedule s2 = new Schedule();
			s2.setTeacher("Maria Pinheiro");
			s2.setCourse("JS");
			s2.setTime("04/05/2022 11h00 às 12h00");

			scheduleRepository.save(s2);

			Schedule s3 = new Schedule();
			s3.setTeacher("Welleson Gama");
			s3.setCourse("JQuery");
			s3.setTime("04/04/2022 10h00 à 13h00");

			scheduleRepository.save(s3);

			Schedule s4 = new Schedule();
			s4.setTeacher("Alessandro Henrique");
			s4.setCourse("PHP");
			s4.setTime("04/04/2022 10h00 à 13h00");

			scheduleRepository.save(s4);
		};
	}
}
