package fr.leghtas.universite.enseignant.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.leghtas.universite.enseignant.buisiness.IEnseignantBuisiness;
import fr.leghtas.universite.enseignant.controller.IEnseignantController;
import fr.leghtas.universite.enseignant.domain.Enseignant;

@Controller
public class EnseignantControllerImpl implements IEnseignantController {
	@Autowired
	private IEnseignantBuisiness enseignantBuisiness;

	@Override
	@RequestMapping("/enseignants")
	public String afficherEnseigants(Model model) {
		List<Enseignant> enseignants = enseignantBuisiness.getEnseignants();
		model.addAttribute("enseignants", enseignants);

		// TODO Auto-generated method stub
		return "enseignants";
	}

	@Override
	@RequestMapping("/enseignant-infos")
	public String afficherEnseignant(Model model, @RequestParam Integer id) {
		Enseignant infosEnseignant = enseignantBuisiness.getEnseignant(id);
		model.addAttribute("infosEnseignant", infosEnseignant);

		return "enseignant-infos";
	}

	@Override
	@RequestMapping("/ajout-enseignant")
	public String ajoutEnseignant(Model model) {
		Enseignant enseignant = new Enseignant();
		model.addAttribute("ajoutEnseignant", enseignant);
		return "ajout-enseignant";
	}

	@Override
	@PostMapping("/add-enseignant")
	public String addEnseignant(Model model, @ModelAttribute Enseignant enseignant) {

		enseignantBuisiness.saveEnseignant(enseignant);
		return "redirect:/enseignants";
		// TODO Auto-generated method stub

	}

	@Override
	@RequestMapping("/supprimerEnseignant")
	public String supprimerEnseignant(Model model, @RequestParam Integer id) {
		enseignantBuisiness.supprimerEnseignant(id);

		return "redirect:/enseignants";
	}

}
