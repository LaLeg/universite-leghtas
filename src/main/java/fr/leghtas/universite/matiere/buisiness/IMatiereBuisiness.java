package fr.leghtas.universite.matiere.buisiness;

import java.util.List;

import fr.leghtas.universite.enseignant.domain.Enseignant;
import fr.leghtas.universite.matiere.domain.Matiere;

public interface IMatiereBuisiness {

	public List<Matiere> findAllMatieres();

	public Matiere saveMatiere(Matiere matiere);

	public Matiere updateMatiere(Matiere matiere);

	public Matiere getMatiereByID(Integer idMatiere);

	public void deleteMatiere(Integer idMatiere);

	public Enseignant getEnseignantByID(Integer idenseignant);

	public List<Enseignant> findAllEnseignants();

}
