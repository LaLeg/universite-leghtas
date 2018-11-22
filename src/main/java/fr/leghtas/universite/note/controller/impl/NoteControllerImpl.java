package fr.leghtas.universite.note.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.leghtas.universite.note.buisiness.INoteBuisiness;
import fr.leghtas.universite.note.controller.INoteController;
import fr.leghtas.universite.note.domain.Note;

@Controller

public class NoteControllerImpl implements INoteController {
	@Autowired
	INoteBuisiness noteBuisiness;

	@Override
	@RequestMapping("/notes")
	public String afficherNotes(Model model) {
		List<Note> listeNotes = noteBuisiness.afficherNotes();
		model.addAttribute("listeNotes", listeNotes);

		return "notes";
	}

}
