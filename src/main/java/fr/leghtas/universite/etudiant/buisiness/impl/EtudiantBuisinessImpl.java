package fr.leghtas.universite.etudiant.buisiness.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.leghtas.universite.etudiant.buisiness.IEtudiantBuisiness;
import fr.leghtas.universite.etudiant.domain.Etudiant;
import fr.leghtas.universite.etudiant.repository.IEtudiantRepository;

@Service
public class EtudiantBuisinessImpl implements IEtudiantBuisiness {
	@Autowired
	private IEtudiantRepository etudiantRepository;

	@Override
	public List<Etudiant> afficherEtudiants() {
		List<Etudiant> listeEtudiants = etudiantRepository.findAll();
		// TODO Auto-generated method stub
		return listeEtudiants;
	}

	@Override
	public Etudiant getEtudiant(Integer id) {
		Etudiant e = etudiantRepository.getOne(id);

		return e;
	}

	@Override
	public void saveEtudiant(Etudiant etudiant) {
		etudiantRepository.save(etudiant);
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerEtudiant(Integer id) {

		etudiantRepository.deleteById(id);

		// TODO Auto-generated method stub

	}

}
