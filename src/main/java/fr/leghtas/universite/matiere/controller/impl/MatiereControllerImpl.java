package fr.leghtas.universite.matiere.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.leghtas.universite.enseignant.domain.Enseignant;
import fr.leghtas.universite.matiere.buisiness.IMatiereBuisiness;
import fr.leghtas.universite.matiere.controller.IMatiereController;
import fr.leghtas.universite.matiere.domain.Matiere;

@Controller

public class MatiereControllerImpl implements IMatiereController {

	@Autowired
	IMatiereBuisiness matiereBuisiness;

	@Override
	@RequestMapping("/matieres")
	public String afficherMatieres(Model model) {
		List<Matiere> listeMatieres = matiereBuisiness.findAllMatieres();

		model.addAttribute("matieres", listeMatieres);

		return "matieres";
	}

	@Override
	@RequestMapping("/matiere-infos")
	public String getMatiere(Model model, @RequestParam Integer id) {
		Matiere infosMatiere = matiereBuisiness.getMatiereByID(id);
		model.addAttribute("infosMatiere", infosMatiere);

		return "infos-matiere";
	}

	@Override
	@RequestMapping("/ajout-matiere")
	public String ajoutFormMatiere(Model model) {
		Matiere formMatiere = new Matiere();
		model.addAttribute("ajoutFormMatiere", formMatiere);

		List<Enseignant> enseignants = matiereBuisiness.findAllEnseignants();
		model.addAttribute("enseignants", enseignants);
		return "form-matiere";
	}

	@Override
	@PostMapping("/add-matiere")
	public String addMatiere(Model model, @ModelAttribute Matiere matiere, @RequestParam Integer idenseignant) {
		Enseignant enseignant = matiereBuisiness.getEnseignantByID(idenseignant);
		matiere.setEnseignant(enseignant);
		matiereBuisiness.saveMatiere(matiere);

		return "redirect:/matieres";
	}

	@Override
	@RequestMapping("/modifForm-matiere")
	public String modifFormMatiere(Model model, @RequestParam Integer id) {
		Matiere matiere = matiereBuisiness.getMatiereByID(id);
		model.addAttribute("modifFormMatiere", matiere);

		List<Enseignant> enseignants = matiereBuisiness.findAllEnseignants();
		model.addAttribute("enseignants", enseignants);

		return "form-matiere-modif";
	}

	@Override
	@PostMapping("/modifier-matiere")
	public String modifierMatiere(Model model, @ModelAttribute Matiere matiere, @RequestParam Integer idenseignant) {
		Enseignant enseignant = matiereBuisiness.getEnseignantByID(idenseignant);
		matiere.setEnseignant(enseignant);
		matiereBuisiness.saveMatiere(matiere);

		return "redirect:/matieres";
	}

}
