package com.example.lib.Service;

import java.util.List;

import com.example.lib.model.Librarian;

public interface LibraryService {

	Librarian saveLibrary(Librarian librarian);
	List<Librarian> getAllLibrarians();
	Librarian getLibrarianById(long id);
	void deleteLibrarian(long id);

	

	
	

	
	
	
}
