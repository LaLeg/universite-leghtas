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
	public List<Matiere> findAllMatieres() {
		List<Matiere> liste = matiereRepository.findAll();
		return liste;
	}

	@Override
	public Matiere saveMatiere(Matiere matiere) {
		return matiereRepository.save(matiere);
	}

	@Override
	public Matiere updateMatiere(Matiere matiere) {
		return matiereRepository.save(matiere);
	}

	@Override
	public Matiere getMatiereByID(Integer id) {
		Matiere infosMatiere = matiereRepository.getOne(id);

		return infosMatiere;
	}

	@Override
	public void deleteMatiere(Integer id) {
		matiereRepository.deleteById(id);
	}

	@Override
	public Enseignant getEnseignantByID(Integer idenseignant) {
		Enseignant e = enseignantBisness.getEnseignant(idenseignant);
		return e;
	}

	@Override
	public List<Enseignant> findAllEnseignants() {
		// TODO Auto-generated method stub
		return enseignantBisness.getEnseignants();
	}

}
