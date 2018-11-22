package fr.leghtas.universite.matiere.controller;

import org.springframework.ui.Model;

import fr.leghtas.universite.matiere.domain.Matiere;

public interface IMatiereController {
	public String afficherMatieres(Model model);

	public String getMatiere(Model model, Integer id);

	public String ajoutFormMatiere(Model model);

	public String addMatiere(Model model, Matiere matiere, Integer idenseignant);

	public String modifFormMatiere(Model model, Integer id);

	public String modifierMatiere(Model model, Matiere matiere, Integer idenseignant);
}
