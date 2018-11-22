package fr.leghtas.universite.matiere.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.leghtas.universite.enseignant.domain.Enseignant;
import fr.leghtas.universite.note.domain.Note;

@Entity
@Table(name = "t_matiere")
public class Matiere {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "numero_matiere")
	private Integer numMatiere;

	@Column(name = "nom")
	private String nom;

	@Column(name = "coef")
	private Integer coef;

	@Column(name = "date_debut")
	private String dateDebut;

	@Column(name = "date_fin")
	private String dateFin;

	@ManyToOne
	@JoinColumn(name = "id_enseignant")
	private Enseignant enseignant;

	@OneToMany(mappedBy = "matiere")
	private List<Note> notes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumMatiere() {
		return numMatiere;
	}

	public void setNumMatiere(Integer numMatiere) {
		this.numMatiere = numMatiere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCoef() {
		return coef;
	}

	public void setCoef(Integer coef) {
		this.coef = coef;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

}
