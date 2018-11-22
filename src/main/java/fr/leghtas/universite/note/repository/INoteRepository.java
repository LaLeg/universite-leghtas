package fr.leghtas.universite.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.leghtas.universite.note.domain.Note;
import fr.leghtas.universite.note.domain.NotePK;

public interface INoteRepository extends JpaRepository<Note, NotePK> {

}
