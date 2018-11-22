package fr.leghtas.universite.enseignant.controller;

import org.springframework.ui.Model;

import fr.leghtas.universite.enseignant.domain.Enseignant;

public interface IEnseignantController {

	public String afficherEnseigants(Model model);

	public String afficherEnseignant(Model model, Integer id);

	public String ajoutEnseignant(Model model);

	public String addEnseignant(Model model, Enseignant enseignant);

	public String supprimerEnseignant(Model model, Integer id);

}
