package fr.leghtas.universite.note.buisiness.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.leghtas.universite.note.buisiness.INoteBuisiness;
import fr.leghtas.universite.note.domain.Note;
import fr.leghtas.universite.note.repository.INoteRepository;

@Service
public class NoteBuisinessImpl implements INoteBuisiness {

	@Autowired
	INoteRepository noteRepository;

	@Override
	public List<Note> afficherNotes() {

		List<Note> listeNotes = noteRepository.findAll();

		return listeNotes;
	}

}
