package com.example.lib.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.lib.Service.LibraryService;

import com.example.lib.model.Librarian;
import com.example.lib.repository.LibraryRepository;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	private LibraryRepository libraryRepository;
	
	public LibraryServiceImpl(LibraryRepository libraryRepository) {
		super();
		this.libraryRepository = libraryRepository;
	}

	public Librarian saveLibrary(Librarian librarian) {
		return libraryRepository.save(librarian);
		
	}

	public List<Librarian> getAllLibrarians() {
		return libraryRepository.findAll();
	
	}
	
	public Librarian getLibrarianById(long id) {
		Optional<Librarian> librarian = libraryRepository.findById(id);
		if(librarian.isPresent()) {
			return librarian.get();
		}else {
			return null;
		}
	}

	@Override
	public void deleteLibrarian(long id) {
		libraryRepository.deleteById(id);
		
	}

	
	

}
