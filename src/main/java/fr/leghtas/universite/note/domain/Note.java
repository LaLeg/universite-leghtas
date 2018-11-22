package fr.leghtas.universite.note.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.leghtas.universite.etudiant.domain.Etudiant;
import fr.leghtas.universite.matiere.domain.Matiere;

@Entity
@Table(name = "t_note")
public class Note {

	@EmbeddedId
	private NotePK notePK;

	@Column(name = "Note")
	private Double note;

	@ManyToOne
	@JoinColumn(name = "id_etudiant", insertable = false, updatable = false)
	private Etudiant etudiant;

	@ManyToOne
	@JoinColumn(name = "id_matiere", insertable = false, updatable = false)
	private Matiere matiere;

	public NotePK getNotePK() {
		return notePK;
	}

	public void setNotePK(NotePK notePK) {
		this.notePK = notePK;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

}
