package com.example.lib.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lib.Service.LibraryService;
import com.example.lib.model.Librarian;

@RestController
@RequestMapping("/api/librarians")
public class LibraryController {
	
	private LibraryService libraryService;

	public LibraryController(LibraryService libraryService) {
		super();
		this.libraryService = libraryService;
	}
	
	//build create librarian REST API
	@PostMapping
	public ResponseEntity<Librarian> saveLibrary(@RequestBody Librarian librarian){
		return new ResponseEntity<Librarian>(libraryService.saveLibrary(librarian), HttpStatus.CREATED);
			
	}
	
	//build get all librarians REST API
	@GetMapping
	public List<Librarian> getAllEmployees(){
		return libraryService.getAllLibrarians();
	}
	
	//build get librarians by id rest api
	//http://localhost:8080/api/librarians/1
	@GetMapping("{id}")
	public ResponseEntity<Librarian> getLibrarianById(@PathVariable("id")   long librarianid){
		return new ResponseEntity<Librarian>(libraryService.getLibrarianById(librarianid), HttpStatus.OK);
		
	}
	
	//build delete librarian rest api
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteLibrarian(@PathVariable("id") long id){
		libraryService.deleteLibrarian(id);
		
		return new ResponseEntity<String>("Librarian deleted successfully", HttpStatus.OK);
	}

}
