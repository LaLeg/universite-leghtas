package fr.leghtas.universite.enseignant.buisiness;

import java.util.List;

import fr.leghtas.universite.enseignant.domain.Enseignant;

public interface IEnseignantBuisiness {
	public List<Enseignant> getEnseignants();

	public Enseignant getEnseignant(Integer id);

	public void saveEnseignant(Enseignant enseignant);

	public void supprimerEnseignant(Integer id);

}
