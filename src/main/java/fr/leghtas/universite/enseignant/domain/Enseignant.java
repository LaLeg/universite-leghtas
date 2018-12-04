package fr.leghtas.universite.enseignant.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.leghtas.universite.matiere.domain.Matiere;

@Entity
@Table(name = "t_enseignant")
public class Enseignant {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "numero_enseignant")
	private Integer numEnseignant;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "date_naissance")
	private String dateNaissance;

	@Column(name = "sexe")
	private String sexe;

	@Column(name = "grade")
	private String grade;

	@Column(name = "date_embauche")
	private String dateEmbauche;

	@OneToMany(mappedBy = "enseignant")
	List<Matiere> matieres;

	public Enseignant() {
		super();

		// TODO Auto-generated constructor stub
	}

	public Enseignant(Integer id, Integer numEnseignant, String nom, String prenom, String dateNaissance, String sexe,
			String grade, String dateEmbauche) {
		super();
		this.id = id;
		this.numEnseignant = numEnseignant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.grade = grade;
		this.dateEmbauche = dateEmbauche;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumEnseignant() {
		return numEnseignant;
	}

	public void setNumEnseignant(Integer numEnseignant) {
		this.numEnseignant = numEnseignant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

}
