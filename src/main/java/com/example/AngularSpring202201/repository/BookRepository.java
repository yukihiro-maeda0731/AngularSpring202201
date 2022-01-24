package com.example.AngularSpring202201.repository;

import com.example.AngularSpring202201.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}