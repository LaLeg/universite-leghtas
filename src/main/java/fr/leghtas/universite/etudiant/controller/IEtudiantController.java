package fr.leghtas.universite.etudiant.controller;

import org.springframework.ui.Model;

import fr.leghtas.universite.etudiant.domain.Etudiant;

public interface IEtudiantController {
	public String afficherEtudiants(Model model);

	public String getEtudiant(Model model, Integer id);

	public String ajoutEtudiant(Model model);

	public String addEtudiant(Model model, Etudiant etudiant);

	public String supprimerEtudiant(Model model, Integer id);

	public String modifierEtudiant(Model model, Integer id);

	public String modifEtudiant(Model model, Etudiant etudiant);

}
