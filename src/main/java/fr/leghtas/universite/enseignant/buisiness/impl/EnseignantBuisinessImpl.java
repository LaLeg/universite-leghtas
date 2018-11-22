package fr.leghtas.universite.enseignant.buisiness.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.leghtas.universite.enseignant.buisiness.IEnseignantBuisiness;
import fr.leghtas.universite.enseignant.domain.Enseignant;
import fr.leghtas.universite.enseignant.repository.IEnseignantRepository;

@Service
public class EnseignantBuisinessImpl implements IEnseignantBuisiness {
	@Autowired
	private IEnseignantRepository enseignantRepository;

	@Override
	public List<Enseignant> getEnseignants() {
		List<Enseignant> listeEnseignants = enseignantRepository.findAll();

		/*
		 * Enseignant e1 = new Enseignant(1, 125, "Dupont", "Marc","1980-05-10" , "M",
		 * "Pr", "1990-09-01"); Enseignant e2 = new Enseignant(2, 80, "Boyer",
		 * "Julie","1986-12-12" , "F", "MCF", "2005-09-01"); Enseignant e3 = new
		 * Enseignant(3, 12, "Vincent", "Paul","1975-02-19" , "M", "Ass", "1999-09-01");
		 * Enseignant e4 = new Enseignant(4, 20, "Simon", "Etienne","1985-12-12" , "M",
		 * "MCF", "2006-03-12");
		 * 
		 * listeEnseignants.add(e1); listeEnseignants.add(e2); listeEnseignants.add(e3);
		 * listeEnseignants.add(e4);
		 * 
		 */

		return listeEnseignants;
	}

	@Override
	public Enseignant getEnseignant(Integer id) {
		/*
		 * Enseignant e = null; List<Enseignant> listeEnseignants = new ArrayList<>();
		 * Enseignant e1 = new Enseignant(1, 125, "Dupont", "Marc","1980-05-10" , "M",
		 * "Pr", "1990-09-01"); Enseignant e2 = new Enseignant(2, 80, "Boyer",
		 * "Julie","1986-12-12" , "F", "MCF", "2005-09-01"); Enseignant e3 = new
		 * Enseignant(3, 12, "Vincent", "Paul","1975-02-19" , "M", "Ass", "1999-09-01");
		 * Enseignant e4 = new Enseignant(4, 20, "Simon", "Etienne","1985-12-12" , "M",
		 * "MCF", "2006-03-12");
		 * 
		 * listeEnseignants.add(e1); listeEnseignants.add(e2); listeEnseignants.add(e3);
		 * listeEnseignants.add(e4);
		 * 
		 * for (int i = 0; i < listeEnseignants.size(); i++) { Enseignant en
		 * =listeEnseignants.get(i); if(en.getId() == id) { e = listeEnseignants.get(i);
		 * } }
		 */
		// TODO Auto-generated method stub

		Enseignant e = enseignantRepository.getOne(id);
		return e;
	}

	@Override
	public void saveEnseignant(Enseignant enseignant) {
		enseignantRepository.save(enseignant);
		/*
		 * System.out.println("Enseignant sauvegardé :"); System.out.println("ID : " +
		 * enseignant.getId()); System.out.println("Numéro Enseignant : " +
		 * enseignant.getNumEnseignant()); System.out.println("Nom : " +
		 * enseignant.getNom()); System.out.println("Prenom : " +
		 * enseignant.getPrenom()); System.out.println("Date de naissance : " +
		 * enseignant.getDateNaissance()); System.out.println("Sexe : " +
		 * enseignant.getSexe()); System.out.println("Grade : " +
		 * enseignant.getGrade()); System.out.println("Date d'embauche : " +
		 * enseignant.getDateEmbauche());
		 */
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerEnseignant(Integer id) {
		enseignantRepository.deleteById(id);
	}

}
