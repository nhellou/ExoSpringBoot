package com.exemple.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Section implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idSection;
	private String libelle;
	
	@OneToMany
	private List<Matiere> matieres;
	
	@OneToMany
	private List<Eleve> eleves;

	public Section(long idSection, String libelle, List<Matiere> matieres, List<Eleve> eleves) {
		super();
		this.idSection = idSection;
		this.libelle = libelle;
		this.matieres = matieres;
		this.eleves = eleves;
	}

		
	public Section(String libelle, List<Matiere> matieres, List<Eleve> eleves) {
		super();
		this.libelle = libelle;
		this.matieres = matieres;
		this.eleves = eleves;
	}



	public Section() {
		super();
	}

	public long getIdSection() {
		return idSection;
	}

	public void setIdSection(long idSection) {
		this.idSection = idSection;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	@Override
	public String toString() {
		return "Section [idSection=" + idSection + ", libelle=" + libelle + ", matieres=" + matieres + ", eleves="
				+ eleves + "]";
	}
	
		
}
