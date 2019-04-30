package com.exemple.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Matiere implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idMatiere;
	private String libelle;
	private float duree;
	private int coefficient;
	
	@ManyToOne
	private Section section;

	public Matiere() {
		super();
	}

		
	public Matiere(String libelle, float duree, int coefficient) {
		super();
		this.libelle = libelle;
		this.duree = duree;
		this.coefficient = coefficient;
	}



	public Matiere(long idMatiere, String libelle, float duree, int coefficient, Section section) {
		super();
		this.idMatiere = idMatiere;
		this.libelle = libelle;
		this.duree = duree;
		this.coefficient = coefficient;
		this.section = section;
	}

	public long getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(long idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", libelle=" + libelle + ", duree=" + duree + ", coefficient="
				+ coefficient + ", section=" + section + "]";
	}

		
	

}
