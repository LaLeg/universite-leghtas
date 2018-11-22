package fr.leghtas.universite.matiere.buisiness;

import java.util.List;

import fr.leghtas.universite.enseignant.domain.Enseignant;
import fr.leghtas.universite.matiere.domain.Matiere;

public interface IMatiereBuisiness {
	public List<Matiere> afficherMatieres();

	public Matiere getMatiere(Integer id);

	public List<Enseignant> findAllEnseignants();

	public void saveMatiere(Matiere matiere);

	public Enseignant getEnseignantByID(Integer idenseignant);

}
