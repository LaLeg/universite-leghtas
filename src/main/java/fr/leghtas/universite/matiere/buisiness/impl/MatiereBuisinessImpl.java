package fr.leghtas.universite.matiere.buisiness.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.leghtas.universite.enseignant.buisiness.IEnseignantBuisiness;
import fr.leghtas.universite.enseignant.domain.Enseignant;
import fr.leghtas.universite.matiere.buisiness.IMatiereBuisiness;
import fr.leghtas.universite.matiere.domain.Matiere;
import fr.leghtas.universite.matiere.repository.IMatiereRepository;

@Service

public class MatiereBuisinessImpl implements IMatiereBuisiness {

	@Autowired
	private IMatiereRepository matiereRepository;
	@Autowired
	private IEnseignantBuisiness enseignantBisness;

	@Override
	public List<Matiere> afficherMatieres() {
		List<Matiere> listeMatieres = matiereRepository.findAll();
		// TODO Auto-generated method stub
		return listeMatieres;
	}

	@Override
	public Matiere getMatiere(Integer id) {
		Matiere infosMatiere = matiereRepository.getOne(id);

		return infosMatiere;
	}

	@Override
	public List<Enseignant> findAllEnseignants() {
		List<Enseignant> liste = enseignantBisness.getEnseignants();
		return liste;
	}

	@Override
	public void saveMatiere(Matiere matiere) {
		matiereRepository.save(matiere);
		// TODO Auto-generated method stub

	}

	@Override
	public Enseignant getEnseignantByID(Integer idenseignant) {
		Enseignant e = enseignantBisness.getEnseignant(idenseignant);

		return e;
	}

}
