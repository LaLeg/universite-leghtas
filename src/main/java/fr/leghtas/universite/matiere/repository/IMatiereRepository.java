package fr.leghtas.universite.matiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.leghtas.universite.matiere.domain.Matiere;

@Repository
public interface IMatiereRepository extends JpaRepository<Matiere, Integer> {

}
