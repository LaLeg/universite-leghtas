package fr.leghtas.universite.etudiant.controller.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.leghtas.universite.etudiant.buisiness.IEtudiantBuisiness;
import fr.leghtas.universite.etudiant.controller.IEtudiantController;
import fr.leghtas.universite.etudiant.domain.Etudiant;

@Controller
public class EtudiantControllerImpl implements IEtudiantController {
	@Autowired
	private IEtudiantBuisiness etudiantBuisiness;

	public static final String REDIRECT_ETUDIANTS = "redirect:/etudiants";

	@Override
	@RequestMapping("/etudiants")
	public String afficherEtudiants(Model model) {
		List<Etudiant> etudiants = etudiantBuisiness.afficherEtudiants();
		model.addAttribute("etudiants", etudiants);

		// TODO Auto-generated method stub
		return "etudiants";
	}

	@Override
	@RequestMapping("/etudiant-infos")
	public String getEtudiant(Model model, @RequestParam Integer id) {
		Etudiant infosEtudiant = etudiantBuisiness.getEtudiant(id);
		model.addAttribute("infosEtudiant", infosEtudiant);
		// TODO Auto-generated method stub
		return "etudiant-infos";
	}

	@Override
	@RequestMapping("/ajout-etudiant")
	public String ajoutEtudiant(Model model) {
		Etudiant etudiant = new Etudiant();
		model.addAttribute("ajoutEtudiant", etudiant);
		// TODO Auto-generated method stub
		return "ajout-etudiant";
	}

	@Override
	@PostMapping("/add-etudiant")
	public String addEtudiant(Model model, @ModelAttribute Etudiant etudiant) {
		etudiantBuisiness.saveEtudiant(etudiant);

		return REDIRECT_ETUDIANTS;
	}

	@Override
	@RequestMapping("/supprimerEtudiant")
	public String supprimerEtudiant(Model model, @RequestParam Integer id) {
		etudiantBuisiness.supprimerEtudiant(id);
		// TODO Auto-generated method stub
		return REDIRECT_ETUDIANTS;
	}

	@Override
	@RequestMapping("/modifierEtudiant")
	public String modifierEtudiant(Model model, @RequestParam Integer id) {
		Etudiant etudiant = etudiantBuisiness.getEtudiant(id);
		model.addAttribute("etudiantForm", etudiant);
		// TODO Auto-generated method stub
		return "modifier-etudiant";
	}

	@Override
	@PostMapping("/modif-etudiant")
	public String modifEtudiant(Model model, @ModelAttribute Etudiant etudiant) {
		etudiantBuisiness.saveEtudiant(etudiant);
		// TODO Auto-generated method stub
		return REDIRECT_ETUDIANTS;
	}

}
