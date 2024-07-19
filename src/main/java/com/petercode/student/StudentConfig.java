package com.petercode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student mariam =  new Student(

                    LocalDate.of(2000, Month.JANUARY,5),
                    "mariam@gmail.com",
                    "Mariam"
            );
            Student peter =  new Student(

                    LocalDate.of(2000, Month.JANUARY,5),
                    "peter@gmail.com",
                    "Peter"
            );
            Student alex =  new Student(

                    LocalDate.of(1920, Month.JANUARY,5),
                    "alex@gmail.com",
                    "Alex"
            );
            Student kevin =  new Student(

                    LocalDate.of(2010, Month.JANUARY,5),
                    "mariam@gmail.com",
                    "Kevin"

            );
            repository.saveAll(
                    List.of(mariam,peter,alex,kevin)
            );
        };
    }
}
