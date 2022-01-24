package com.example.AngularSpring202201.config;

import com.example.AngularSpring202201.model.Book;
import com.example.AngularSpring202201.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Stream;

@Configuration
public class BookConfig {
        @Bean
        CommandLineRunner commandLineRunner(BookRepository repository) {
            return args -> {
                Stream.of(new Book(null, "Horton Hears a Who", "Dr. Seuss"), new Book(null, "A Brief History of Time", "Stephen Hawking"),
                        new Book(null, "Brave New World", "Aldous Huxley")).forEach(book -> {
                    repository.save(book);
                });
                //retrieve them all, and print so that we see everything is wired up correctly
                repository.findAll().forEach(System.out::println);
            };
        }
    }

