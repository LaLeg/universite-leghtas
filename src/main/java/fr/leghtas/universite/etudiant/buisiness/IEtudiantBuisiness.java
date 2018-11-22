package fr.leghtas.universite.etudiant.buisiness;

import java.util.List;

import fr.leghtas.universite.etudiant.domain.Etudiant;

public interface IEtudiantBuisiness {
	public List<Etudiant> afficherEtudiants();

	public Etudiant getEtudiant(Integer id);

	public void saveEtudiant(Etudiant etudiant);

	public void supprimerEtudiant(Integer id);

}
