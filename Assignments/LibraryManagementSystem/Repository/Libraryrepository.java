package com.example.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lib.model.Librarian;

public interface LibraryRepository extends JpaRepository<Librarian, Long> {

}
